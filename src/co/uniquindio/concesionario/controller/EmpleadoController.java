package co.uniquindio.concesionario.controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class EmpleadoController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton btnVenderVehiculo;

    @FXML
    private JFXButton btnCerrarSesionEmpleado;

    @FXML
    private JFXButton btnAlquilarVehiculo;

    @FXML
    private JFXButton btnComprarVehiculo;

    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

    @FXML
    void ventVenderVehiculo(ActionEvent event) {

    }

    @FXML
    void ventAlquilarVehiculo(ActionEvent event) {

    }


    @FXML
    void ventComprarVehiculo(ActionEvent event) {

    }


    @FXML
    void ventCerrasSesion(ActionEvent event) {

    }
}
