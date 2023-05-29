package co.uniquindio.concesionario.controller;



import com.jfoenix.controls.JFXButton;

import co.uniquindio.concesionario.exception.ConcesionarioException;
import co.uniquindio.concesionario.model.Empleado;
import co.uniquindio.concesionario.model.EstadoEmpleado;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AgregarEmpleadoController implements Initializable{
	ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();
	private CrudEmpleadoController CrudEmpleadoController;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtSueldo;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtCargo;

    @FXML
    private PasswordField txtPasswordRep;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtApellido;

    @FXML
    private JFXButton btnAgregar;

    @FXML
    private TextField txtIdentificacion;



    @FXML
    void agregarPerson(ActionEvent event) {

    	//capturo los datos
    	String nombre = this.txtNombre.getText();
		String apellido = this.txtApellido.getText();
		String id = this.txtIdentificacion.getText();
		String cargo = this.txtCargo.getText();
		double sueldo = Double.parseDouble(this.txtSueldo.getText());
		String password = this.txtPassword.getText();
		String passwordRep = this.txtPasswordRep.getText();
		String edad =this.txtEdad.getText();
		EstadoEmpleado estado=EstadoEmpleado.ACTIVO;

		if(datosValidos(nombre , apellido , id, cargo, sueldo, password, passwordRep, edad ,estado)==true){
			System.out.println("valido");
			Empleado nuevoEmpleado = new Empleado(nombre, edad, id, cargo, sueldo, apellido, passwordRep ,EstadoEmpleado.ACTIVO);

			try {
				modelFactoryController.getConcesionario().agregarEmpleado(nuevoEmpleado);;

				System.out.println("empleadoRegistrado");
			} catch (ConcesionarioException e) {

				e.getMessage();
				mostrarMensaje("excepcion", "verificacion", e.getMessage(), AlertType.INFORMATION);


			}


			try {

	    		FXMLLoader loader = new FXMLLoader(
	    				getClass().getResource("../view/CrudEmpleadoView.fxml"));
	    		Parent root = loader.load();


	    		Scene scene = new Scene(root);
	    		Stage stage = new Stage();

	    		stage.setScene(scene);
	    		stage.show();
	    		stage.setTitle("Crud");
	    		Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
	    		myStage.close();

	    	} catch (IOException ex) {

	    	}

		}






    }

    /**
     * metodo utilizado para validar que el usuario ingrese datos correctamente  y que no deje los campos de texto vacios , ademas verifica que la id
     * sueldo , edad solo se pueden ingresar numeros
     * @param nombre
     * @param apellido
     * @param identificacion
     * @param cargo
     * @param sueldo
     * @param password
     * @param passwordRep
     * @param edad
     * @return
     */
	private boolean datosValidos(String nombre, String apellido, String identificacion, String cargo ,double sueldo , String password, String passwordRep ,String edad ,EstadoEmpleado estado) {

	    boolean esNumerica = identificacion != null && !identificacion.isEmpty() && identificacion.matches("\\d+");
	    boolean nombreValido = nombre != null && nombre.matches("[a-zA-Z]+");
	    boolean cargoValido = cargo != null && cargo.matches("[a-zA-Z]+");
	    boolean sueldoValido = sueldo>0;
	    boolean passwordValido = password != null;
	    boolean passwordRepValido = passwordRep != null;
	    boolean apellidoValido = apellido != null && apellido.matches("[a-zA-Z]+");
	    boolean edadValida = edad != null && !edad.isEmpty() && edad.matches("\\d+");
	    boolean passwordIgualValido = password != null && password.equals(passwordRep);





	    String notificacion = "";
	    if (nombre == null || !nombreValido) {
	        notificacion += "El nombre ingresado es inválido. ";
	    }
	    if (apellido == null || !apellidoValido) {
	        notificacion += "El apellido ingresado es inválido. ";
	    }
	    if (identificacion == null || !esNumerica) {
	        notificacion += "La identificación ingresada es inválida. ";
	    }
	    if (cargo == null || !cargoValido) {
	        notificacion += "El cargo ingresado es inválido. ";
	    }
	    if ( !sueldoValido) {
	        notificacion += "El sueldo ingresado es inválido. ";
	    }
	    if (password == null || !passwordValido) {
	        notificacion += "El password ingresado es inválido. ";
	    }
	    if (passwordRep == null || !passwordRepValido) {
	        notificacion += "El password ingresado es inválido. ";
	    }
	    if (password == null || !passwordIgualValido) {
	        notificacion += "La contraseña ingresada no coincide con la confirmación de contraseña. ";
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




	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}




}

