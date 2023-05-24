package co.uniquindio.concesionario.controller;
import com.jfoenix.controls.JFXButton;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AdministradorController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton btnBuscarEmpleado;

    @FXML
    private TextField txtIdentificacionEmpleado;

    @FXML
    private JFXButton btnCRUDEmpleado;

    @FXML
    private JFXButton btnCerrarSesion;

    @FXML
    private JFXButton btnReportes;

    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

    @FXML
    void ventCrudEmpleado(ActionEvent event) {

    }



    @FXML
    void ventReportes(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/ReportesView.fxml"));
    		Parent root = loader.load();


    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Reportes");
    		Stage myStage = (Stage) this.btnReportes.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {

    	}
    }



    @FXML
    void cerrarSesion(ActionEvent event) {

    }

    public void init(){

    }

}

//    @FXML
//    void volverInicio(ActionEvent event) {
//    	 // Crear una ventana de confirmación
//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//        alert.setTitle("Confirmación");
//        alert.setHeaderText("si  vuelves al inicio se cerrara sesion automaticamente");
//        alert.setContentText("¿Está seguro de ejecutar esta acción?");
//
//        // Agregar botones de "Sí" y "No"
//        ButtonType buttonTypeYes = new ButtonType("Sí");
//        ButtonType buttonTypeNo = new ButtonType("No");
//        alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo);
//
//        // Obtener el resultado de la ventana de confirmación
//        ButtonType result = alert.showAndWait().orElse(ButtonType.NO);
//
//        // Verificar si el usuario eligió "Sí"
//        if (result == buttonTypeYes) {
//        	try {
//                // Obtener el MenuItem seleccionado
//                MenuItem menuItem = (MenuItem) event.getSource();
//
//                // Obtener el escenario actual a través del MenuItem
//                Stage currentStage = (Stage) menuItem.getParentPopup().getOwnerWindow();
//
//                // Cargar la ventana principal desde su archivo FXML
//                FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/principalView.fxml"));
//                Parent ventanaPrincipalRoot = loader.load();
//
//
//                // Configurar cualquier dato necesario en el controlador de la ventana principal
//
//                // Cambiar la escena actual en el escenario a la ventana principal
//                Scene ventanaPrincipalScene = new Scene(ventanaPrincipalRoot);
//                currentStage.setScene(ventanaPrincipalScene);
//
//                // Mostrar la ventana principal
//                currentStage.show();
//            } catch (IOException e) {
//                e.printStackTrace();
//                // Manejar cualquier excepción que pueda ocurrir al cargar la ventana principal
//            }
//
//        }
//
//
//    }
//
//
//    @FXML
//    void volverLogin(ActionEvent event) {
//    	try {
//            // Obtener el MenuItem seleccionado
//            MenuItem menuItem = (MenuItem) event.getSource();
//
//            // Obtener el escenario actual a través del MenuItem
//            Stage currentStage = (Stage) menuItem.getParentPopup().getOwnerWindow();
//
//            // Cargar la ventana principal desde su archivo FXML
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/loginAdministradorView.fxml"));
//            Parent ventanaPrincipalRoot = loader.load();
//
//
//            // Configurar cualquier dato necesario en el controlador de la ventana principal
//
//            // Cambiar la escena actual en el escenario a la ventana principal
//            Scene ventanaPrincipalScene = new Scene(ventanaPrincipalRoot);
//            currentStage.setScene(ventanaPrincipalScene);
//
//            // Mostrar la ventana principal
//            currentStage.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    @FXML
//    void abrirVentAgregarEmpleado(ActionEvent event) {
//    	try {
//
//    		FXMLLoader loader = new FXMLLoader(
//    				getClass().getResource("../view/AgregarEmpleadoView.fxml"));
//    		Parent root = loader.load();
//
//
//
//    		Scene scene = new Scene(root);
//    		Stage stage = new Stage();
//
//    		stage.setScene(scene);
//    		stage.show();
//    		stage.setTitle("Lista Facturas");
//    		Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
//    		myStage.close();
//
//    	} catch (IOException e) {
//
//    	}
//
//
//    }



