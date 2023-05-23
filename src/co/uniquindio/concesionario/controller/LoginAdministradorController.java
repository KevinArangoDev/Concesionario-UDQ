package co.uniquindio.concesionario.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import co.uniquindio.concesionario.exception.AdministradorException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class LoginAdministradorController implements Initializable {

	ModelFactoryController singleton = ModelFactoryController.getInstance();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView imgLogo;

    @FXML
    private JFXTextField txtUsuarioAdmin;

    @FXML
    private JFXPasswordField  txtContraseniaAdmin;

    @FXML
    private JFXButton  btnIngresarAdmin;
    @FXML
    private JFXButton  btnVolverAdmin;

    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

    @FXML
    void ingresarVentAdmin(ActionEvent event) {
    	String idAdmin = this.txtUsuarioAdmin.getText();
		String contrasenia = this.txtContraseniaAdmin.getText();

		if (singleton.inicioSesionAdmin(idAdmin ,contrasenia) == true) {

			try {
//				singleton.guardaRegistroLog("Usuario: " + idAdmin + " inicio sesion", 1, "LoginAnunciante");
				FXMLLoader loader = new FXMLLoader(
						getClass().getResource("../view/AdministradorView.fxml"));
				Parent root = loader.load();

				AdministradorController controlador = loader.getController();
				controlador.init();
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.setTitle("Menu Administrador");
//				stage.getIcons().add(new Image(getClass().getResourceAsStream("/resources/Logo Subasta.png")));
				stage.setScene(scene);
				stage.show();
				stage.setOnCloseRequest(e -> {
//					try {
////					controlador.btnMostrarVentanaPrincipal(event);
//					} catch (Exception e1) {
//						e1.printStackTrace();
//					}
				});
				Stage myStage = (Stage) this.btnIngresarAdmin.getScene().getWindow();
				myStage.close();

			} catch (IOException ex) {

				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setHeaderText(null);
				alert.setTitle("Error");
				alert.setContentText(ex.getMessage());
				alert.showAndWait();
			}
		} else {
//			singleton.guardaRegistroLog("Se intento iniciar sesion sin cuenta", 2, "LoginAnunciante");
//			Alert alert = new Alert(Alert.AlertType.ERROR);
//			alert.setHeaderText(null);
//			alert.setTitle("Notificacion");
//			alert.setContentText("Los datos no coinciden, vuelva a intentarlo.");
//			alert.showAndWait();
			try {
				throw new AdministradorException("administrador no existe \n                 o     \n contraseña incorrecta");
			} catch (AdministradorException e) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setHeaderText(null);
				alert.setTitle("no existe");
				alert.setContentText(e.getMessage());
				alert.showAndWait();
			}
		}


    }
    @FXML
    void volverVentPrincipal(ActionEvent event) {
    	try {
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("../view/PrincipalView.fxml"));
			Parent root = loader.load();

//			PrincipalController controlador = loader.getController();

			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setTitle("Concesionario uq");
//			stage.getIcons().add(new Image(getClass().getResourceAsStream("/resources/Logo Subasta.png")));
			stage.setScene(scene);
			stage.show();

			Stage myStage = (Stage) this.btnVolverAdmin.getScene().getWindow();
			myStage.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

    }




}

