package co.uniquindio.concesionario.controller;
import com.jfoenix.controls.JFXButton;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ComprarVehiculoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton btnVPesado;

    @FXML
    private JFXButton btnMoto;

    @FXML
    private JFXButton btnVLiviano;

    @FXML
    void ventCompMoto(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/ComprarMotoView.fxml"));
    		Parent root = loader.load();

    		ComprarMotoController controlador = loader.getController();

    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Car UQ");
    		Stage myStage = (Stage) this.btnMoto.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {
            e.printStackTrace();
    	}
    }

    @FXML
    void ventVehPesado(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/ComprarPesadoView.fxml"));
    		Parent root = loader.load();

    		ComprarPesadoController controlador = loader.getController();

    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Car UQ");
    		Stage myStage = (Stage) this.btnVPesado.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {
            e.printStackTrace();
    	}

    }

    @FXML
    void ventVehLiviano(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/ComprarLivianoView.fxml"));
    		Parent root = loader.load();

    		ComprarLivianoController controlador = loader.getController();

    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Car UQ");
    		Stage myStage = (Stage) this.btnVLiviano.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {
            e.printStackTrace();
    	}
    }




}
