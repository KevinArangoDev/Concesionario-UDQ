package co.uniquindio.concesionario.controller;



import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class ActualizarEmpleadoController implements Initializable{
	ModelFactoryController singleton = ModelFactoryController.getInstance();


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

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}




}
