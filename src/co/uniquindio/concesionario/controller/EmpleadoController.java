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
import javafx.stage.Stage;

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
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/VenderVehiculoView.fxml"));
    		Parent root = loader.load();

    		LoginAdministradorController controlador = loader.getController();

    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Car UQ");
    		Stage myStage = (Stage) this.btnVenderVehiculo.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {
            e.printStackTrace();
    	}
    }

    @FXML
    void ventAlquilarVehiculo(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/AlquilarVehiculoView.fxml"));
    		Parent root = loader.load();

    		LoginAdministradorController controlador = loader.getController();

    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Car UQ");
    		Stage myStage = (Stage) this.btnAlquilarVehiculo.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {
            e.printStackTrace();
    	}
    }


    @FXML
    void ventComprarVehiculo(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/ComprarVehiculoView.fxml"));
    		Parent root = loader.load();

    		LoginAdministradorController controlador = loader.getController();

    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Car UQ");
    		Stage myStage = (Stage) this.btnComprarVehiculo.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {
            e.printStackTrace();
    	}
    }


    @FXML
    void ventCerrasSesion(ActionEvent event) {

    }
}
