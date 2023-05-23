package co.uniquindio.concesionario.controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.uniquindio.concesionario.model.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AgregarEmpleadoController implements Initializable {
	ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtSueldo;

    @FXML
    private TextField txtNombre;

    @FXML
    private Button btnNuevo;

    @FXML
    private TextField txtCargo;

    @FXML
    private TextField txtApellido;

    @FXML
    private Button btnAgregar;

    @FXML
    private TextField txtIdentificacion;

    @FXML
    private TextField txtEdad;

    @FXML
    void AgregarEmpleado(ActionEvent event) {
    	String nombre = this.txtNombre.getText();
		String apellido = this.txtApellido.getText();
		String cargo = this.txtApellido.getText();
		String edad = this.txtEdad.getText();
		String id = this.txtIdentificacion.getText();
		double sueldo =Double.parseDouble(txtSueldo.getText());

		Empleado nuevoEmpleado = new Empleado(nombre, edad, id, cargo, sueldo, apellido);


		// Aqui mandamos el objeto con el nombre, id y la edad hacia un metodo que nos
		// permite crear
		// el comprador
		modelFactoryController.getConcesionario().agregarEmpleado(nuevoEmpleado);;


    }

    @FXML
    void NuevoEmpleado(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}


}

