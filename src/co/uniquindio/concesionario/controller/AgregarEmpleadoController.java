package co.uniquindio.concesionario.controller;



import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AgregarEmpleadoController implements Initializable{
	ModelFactoryController singleton = ModelFactoryController.getInstance();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtSueldo;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtCargo;

    @FXML
    private TextField txtPasswordRep;

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
    	Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
		myStage.close();



    }



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}




}

