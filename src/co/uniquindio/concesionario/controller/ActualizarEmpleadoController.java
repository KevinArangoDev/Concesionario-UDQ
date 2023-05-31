package co.uniquindio.concesionario.controller;



import com.jfoenix.controls.JFXButton;

import co.uniquindio.concesionario.exception.ConcesionarioException;
import co.uniquindio.concesionario.model.Empleado;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class ActualizarEmpleadoController implements Initializable{
	//llamamaos   singleton
	ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();


	private CrudEmpleadoController crudEmpleadoController;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtSueldo;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtCargo;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtApellido;

    @FXML
    private JFXButton btnActualizar;
	private Empleado seleccion;

    @FXML
    void getCargo(ActionEvent event) {


    }


    @FXML
    void getNombre(ActionEvent event) {

    }

    @FXML
    void getApellido(ActionEvent event) {

    }



    @FXML
    void getEdad(ActionEvent event) {

    }

    @FXML
    void getSueldo(ActionEvent event) {

    }

    @FXML
    void actualizarEmpleado(ActionEvent event) {



    	String nombre = this.txtNombre.getText();
		String apellido = this.txtApellido.getText();
		String cargo = this.txtCargo.getText();
		String sueldoText = this.txtSueldo.getText();
		String edad = this.txtEdad.getText();
    	if(datosValidos(nombre, apellido, cargo, sueldoText, edad)){
    		Double sueldo = null;


			if (!sueldoText.isEmpty()) {

				sueldo = Double.parseDouble(sueldoText);
    		seleccion.setNombre(nombre);
        	seleccion.setApellido(apellido);
        	seleccion.setCargo(cargo);
        	seleccion.setEdad(edad);
        	seleccion.setSueldo(sueldo);

        	try {
    			modelFactoryController.concesionario.actualizarEmpleado(seleccion);
    		} catch (ConcesionarioException e) {

    			e.printStackTrace();
    		}
        	try {

	    		FXMLLoader loader = new FXMLLoader(
	    				getClass().getResource("../view/CrudEmpleadoView.fxml"));
	    		Parent root = loader.load();


	    		Scene scene = new Scene(root);
	    		Stage stage = new Stage();

	    		stage.setScene(scene);
	    		stage.show();
	    		stage.setTitle("Reportes");
	    		Stage myStage = (Stage) this.btnActualizar.getScene().getWindow();
	    		myStage.close();

	    	} catch (IOException ex) {

	    	}
			}
    	}

		}








	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	public void recibirPersona(Empleado empleado) {
		seleccion=empleado;


	}

	public CrudEmpleadoController getCrudEmpleadoController() {
		return crudEmpleadoController;
	}

	public void setCrudEmpleadoController(CrudEmpleadoController crudEmpleadoController) {
		this.crudEmpleadoController = crudEmpleadoController;
	}
	private boolean datosValidos(String nombre, String apellido, String cargo ,String sueldo ,String edad ) {

	    boolean nombreValido = nombre != null && nombre.matches("[a-zA-Z]+");
	    boolean cargoValido = cargo != null && cargo.matches("[a-zA-Z]+");
	    boolean sueldoValido = sueldo!=null;
	    boolean apellidoValido = apellido != null && apellido.matches("[a-zA-Z]+");
	    boolean edadValida = edad != null && !edad.isEmpty() && edad.matches("\\d+");





	    String notificacion = "";
	    if (nombre == null || !nombreValido) {
	        notificacion += "El nombre ingresado es inválido. ";
	    }
	    if (apellido == null || !apellidoValido) {
	        notificacion += "El apellido ingresado es inválido. ";
	    }

	    if (cargo == null || !cargoValido) {
	        notificacion += "El cargo ingresado es inválido. ";
	    }
	    if ( !sueldoValido) {
	        notificacion += "El sueldo ingresado es inválido. ";
	    }



	    if (edad == null || !edadValida) {
		    notificacion += "la edad ingresado es inválido. ";
		}
	    if(notificacion.equals("")){
			return true;
		}else{
			 mostrarMensaje("notificiacion persona", "informacion invalida", notificacion, AlertType.WARNING);

			    return false;


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
