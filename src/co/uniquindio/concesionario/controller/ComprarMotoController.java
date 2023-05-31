package co.uniquindio.concesionario.controller;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import co.uniquindio.concesionario.model.Concesionario;
import co.uniquindio.concesionario.model.Moto;
import co.uniquindio.concesionario.model.TipoCombustible;
import co.uniquindio.concesionario.model.TipoNuevoUsado;
import co.uniquindio.concesionario.model.TipoTransaccion;
import co.uniquindio.concesionario.model.TipoTransmision;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ComprarMotoController {

	 private ModelFactoryController singleton;


	    public void initialize() {
	        singleton = ModelFactoryController.getInstance();


	        listaTransaccion.getItems().addAll(TipoTransaccion.COMPRA, TipoTransaccion.REGISTRO);


	        // Obtener los valores de la enumeración TipoCombustible
	        TipoCombustible[] tiposCombustible = TipoCombustible.values();

	        // Agregar los valores al ComboBox
	        listaCombustible.getItems().addAll(tiposCombustible);

	     // Obtener los valores de la enumeración TipoCombustible
	        TipoNuevoUsado[] tipoNuevoUsado = TipoNuevoUsado.values();

	        // Agregar los valores al ComboBox
	        listaNuevoUsado.getItems().addAll(tipoNuevoUsado);

	     // Obtener los valores de la enumeración TipoCombustible
	        TipoTransmision[] tiposTrasmision = TipoTransmision.values();

	        // Agregar los valores al ComboBox
	        listaTrasmision.getItems().addAll(tiposTrasmision);

	    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField txtModelo;

    @FXML
    private ComboBox<TipoCombustible> listaCombustible;

    @FXML
    private ComboBox<TipoNuevoUsado> listaNuevoUsado;

    @FXML
    private ComboBox<TipoTransaccion> listaTransaccion;

    @FXML
    private JFXTextField txtVelocidadMaxima;

    @FXML
    private ImageView imgLogo;

    @FXML
    private JFXTextField txtCambios;

    @FXML
    private JFXTextField txtPlaca;

    @FXML
    private JFXButton btnVolverVentEmpleado;

    @FXML
    private JFXButton btnRealizarCompraMoto;

    @FXML
    private JFXButton btnLimpiarDatosMoto;

    @FXML
    private JFXTextField txtCilindraje;

    @FXML
    private JFXTextField txtMarca;

    @FXML
    private ComboBox<TipoTransmision> listaTrasmision;





    @FXML
    void listaCombustible(ActionEvent event) {

    }



    @FXML
    void listaTrasmision(ActionEvent event) {

    }



    @FXML
    void listaNuevoUsado(ActionEvent event) {

    }


    @FXML
    void realizarCompraMoto(ActionEvent event) {

    	Concesionario concesionario = ModelFactoryController.getInstance().getConcesionario();
        TipoCombustible tipoCombustible = listaCombustible.getValue();
        TipoTransmision tipoTransmision = listaTrasmision.getValue();
        TipoNuevoUsado tipoNuevoUsado = listaNuevoUsado.getValue();
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String cambios = txtCambios.getText();
        String velMaximaText = txtVelocidadMaxima.getText();
        String cilindraje = txtCilindraje.getText();
        String placa = txtPlaca.getText();

        if (tipoCombustible == null || tipoTransmision == null || tipoNuevoUsado == null
                || marca.isEmpty() || modelo.isEmpty() || cambios.isEmpty()
                || velMaximaText.isEmpty() || cilindraje.isEmpty() || placa.isEmpty()) {
            // Mostrar alerta de campos vacíos
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Todos los campos son obligatorios");
            alert.showAndWait();
            return;
        }

        double velMaxima = Double.parseDouble(velMaximaText);

        // Crear la moto y guardarla en la lista de vehiculos.
        Moto moto = new Moto();
        moto.setTipoCombustible(tipoCombustible);
        moto.setTipoTransmision(tipoTransmision);
        moto.setTipoNuevoUsado(tipoNuevoUsado);
        moto.setMarca(marca);
        moto.setModelo(modelo);
        moto.setCambios(cambios);
        moto.setVelMax(velMaxima);
        moto.setCilindraje(cilindraje);
        moto.setPlaca(placa);

        concesionario.getListaVehiculos().add(moto);
		concesionario.getListaTransacciones().add(moto);

      // Borrar los campos
        txtMarca.setText("");
        txtModelo.setText("");
        txtCambios.setText("");
        txtVelocidadMaxima.setText("");
        txtCilindraje.setText("");
        txtPlaca.setText("");
        listaCombustible.getSelectionModel().clearSelection();
        listaTrasmision.getSelectionModel().clearSelection();
        listaNuevoUsado.getSelectionModel().clearSelection();
        listaTransaccion.getSelectionModel().clearSelection();


     // Mostrar alerta de compra exitosa
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Compra Exitosa");
        alert.setHeaderText(null);
        alert.setContentText("La compra se ha realizado correctamente");
        alert.showAndWait();
    }


    @FXML
    void limpiarDatosMoto(ActionEvent event) {
    	limpiarDatos();
    }


    private void limpiarDatos() {
    	 // Borrar los campos
        txtMarca.setText("");
        txtModelo.setText("");
        txtCambios.setText("");
        txtVelocidadMaxima.setText("");
        txtCilindraje.setText("");
        txtPlaca.setText("");
        listaCombustible.getSelectionModel().clearSelection();
        listaTrasmision.getSelectionModel().clearSelection();
        listaNuevoUsado.getSelectionModel().clearSelection();
        listaTransaccion.getSelectionModel().clearSelection();
	}



	@FXML
    void volVentEmpleado(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/ComprarVehiculoView.fxml"));
    		Parent root = loader.load();

    		ComprarVehiculoController controlador = loader.getController();

    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Car UQ");
    		Stage myStage = (Stage) this.btnVolverVentEmpleado.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {
            e.printStackTrace();
    	}
    }

}

