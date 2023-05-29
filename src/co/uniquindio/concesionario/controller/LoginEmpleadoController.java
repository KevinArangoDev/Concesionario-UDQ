package co.uniquindio.concesionario.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import co.uniquindio.concesionario.model.Empleado;
import co.uniquindio.concesionario.model.EstadoEmpleado;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.management.Notification;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class LoginEmpleadoController implements Initializable {
	ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView imgLogo;

    @FXML
    private JFXButton btnVolver;

    @FXML
    private JFXButton btnIngresar;

    @FXML
    private JFXTextField txtUsuario;

    @FXML
    private JFXPasswordField txtContrasenia;

    @Override
   	public void initialize(URL location, ResourceBundle resources) {
   		// TODO Auto-generated method stub

   	}


    @FXML
    void ingresarVentEmpleado(ActionEvent event) throws IOException  {
    	  String usuario = txtUsuario.getText();
    	  String contrasenia = txtContrasenia.getText();
    	  if (validarCredenciales(usuario, contrasenia)) {
			  try{
			    	FXMLLoader loader = new FXMLLoader(
							getClass().getResource("../view/EmpleadoView.fxml"));
					Parent root = loader.load();

					EmpleadoController controlador = loader.getController();

					Scene scene = new Scene(root);
					Stage stage = new Stage();

					stage.setScene(scene);
					stage.show();
					stage.setTitle("Car UQ");
					Stage myStage = (Stage) this.btnIngresar.getScene().getWindow();
					myStage.close();

				} catch (IOException e) {
			        e.printStackTrace();
				}

		  }else{
			  mostrarMensaje("ee", "contraseña o usuario incorrecto", "", AlertType.INFORMATION);
		  }


    }



    @FXML
    void volverVentPrincipal(ActionEvent event) {
		  try{
		    	FXMLLoader loader = new FXMLLoader(
						getClass().getResource("../view/PrincipalView.fxml"));
				Parent root = loader.load();

				EmpleadoController controlador = loader.getController();

				Scene scene = new Scene(root);
				Stage stage = new Stage();

				stage.setScene(scene);
				stage.show();
				stage.setTitle("Car UQ");
				Stage myStage = (Stage) this.btnVolver.getScene().getWindow();
				myStage.close();

			} catch (IOException e) {
		        e.printStackTrace();
			}
    }
    private boolean validarCredenciales(String usuario, String contrasenia)  {
        // Obtener el empleado correspondiente al usuario ingresado
        Empleado empleado = null;
		try {
			empleado = modelFactoryController.getConcesionario().cargarEmpleado(usuario);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Verificar si el empleado existe y si la contraseña es correcta
        if (empleado != null && empleado.getPassword().equals(contrasenia)) {
            // Verificar si el empleado está bloqueado
            if (empleado.getEstadoEmpleado() == EstadoEmpleado.BLOQUEADO) {

            	mostrarMensaje("empleado inactivo", "empleado:"+empleado.getNombre(), "empleado bloqueado", AlertType.INFORMATION);
            	return false; // El empleado está bloqueado

            } else {
                return true; // El empleado no está bloqueado
            }
        } else {
            return false; // Credenciales inválidas
        }
    }
	   public void mostrarMensaje(String titulo , String header , String contenido , AlertType alertType){
	    	Alert alert = new Alert(alertType);
	    	alert.setTitle(titulo);
	    	alert.setHeaderText(header);
	    	alert.setContentText(contenido);
	    	alert.showAndWait();
	    }






}
