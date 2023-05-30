package co.uniquindio.concesionario.controller;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import co.uniquindio.concesionario.model.Concesionario;
import co.uniquindio.concesionario.model.TipoCombustible;
import co.uniquindio.concesionario.model.TipoNuevoUsado;
import co.uniquindio.concesionario.model.TipoTransaccion;
import co.uniquindio.concesionario.model.TipoTransmision;
import co.uniquindio.concesionario.model.Vehiculo;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ComprarPesadoController {

    private ModelFactoryController singleton;



    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField txtVelCruceroPesado;

    @FXML
    private JFXTextField txtModeloPesado;

    @FXML
    private JFXTextField txtMarcaPesado;

    @FXML
    private JFXTextField txtPlacaPesado;


    @FXML
    private ComboBox<String> vendedorCombobox;

    @FXML
    private ComboBox<TipoTransaccion> listaTipoTransaccion;

    @FXML
    private JFXTextField txtCambiosPesado;

    @FXML
    private ImageView imgLogo1;

    @FXML
    private ComboBox<TipoTransmision> listaTrasmisionPesados;

    @FXML
    private JFXTextField txtPasajerosPesado;

    @FXML
    private JFXButton btnLimpiarDatosLiviano1;

    @FXML
    private JFXTextField txtCilindrajePesado;

    @FXML
    private JFXButton btnRealizarCompraLivianoPesado;

    @FXML
    private ComboBox<String> tieneAirePesado;


    @FXML
    private ComboBox<TipoNuevoUsado> listaNuevoUsadoPesado;

    @FXML
    private ComboBox<String> tieneABSPesado;

    @FXML
    private ComboBox<String> tieneCamReversaPesado;

    @FXML
    private JFXButton btnVolverVentEmpleado1;

    @FXML
    private JFXTextField txtCapMaleteroPesado;

    @FXML
    private ComboBox<TipoCombustible> listaCombustiblePesado;

    @FXML
    private JFXTextField txtBolsasAirePesado;

    @FXML
    private JFXTextField txtVelMaximaPesado;

    @FXML
    private JFXTextField txtNumPuertasPesado;

    @FXML
    private void initialize() {
        singleton = ModelFactoryController.getInstance();

        // Configurar opciones para otros ComboBox
        listaCombustiblePesado.getItems().addAll(TipoCombustible.values());
        listaTrasmisionPesados.getItems().addAll(TipoTransmision.values());
        listaNuevoUsadoPesado.getItems().addAll(TipoNuevoUsado.values());
        listaTipoTransaccion.getItems().addAll(TipoTransaccion.COMPRA, TipoTransaccion.REGISTRO);


        ObservableList<String> opcionesSiNo = FXCollections.observableArrayList("Si", "No");
        tieneAirePesado.setItems(opcionesSiNo);
        tieneCamReversaPesado.setItems(opcionesSiNo);
        tieneABSPesado.setItems(opcionesSiNo);
    }

    @FXML
    private void compraVehPesado(ActionEvent event) {
    	Concesionario concesionario = ModelFactoryController.getInstance().getConcesionario();

        String marca = txtMarcaPesado.getText();
        String modelo = txtModeloPesado.getText();
        String cambios = txtCambiosPesado.getText();
        String velMaximaText = txtVelMaximaPesado.getText();
        String cilindraje = txtCilindrajePesado.getText();
        String placa = txtPlacaPesado.getText();
        double velMaxima;
        TipoTransaccion tipoTransaccion = listaTipoTransaccion.getValue();
        TipoCombustible tipoCombustible = listaCombustiblePesado.getValue();
        TipoTransmision tipoTransmision = listaTrasmisionPesados.getValue();
        TipoNuevoUsado tipoNuevoUsado = listaNuevoUsadoPesado.getValue();
        String numPasajeros = txtPasajerosPesado.getText();

        String numPuertas = txtNumPuertasPesado.getText();
        String capMaletero = txtCapMaleteroPesado.getText();
        boolean hasAireAcondicionado = tieneAirePesado != null && tieneAirePesado.getValue().equals("Si");
        boolean hasCamaraReversa = tieneCamReversaPesado != null && tieneCamReversaPesado.getValue().equals("Si");
        boolean hasABS = tieneABSPesado != null && tieneABSPesado.getValue().equals("Si");
        String numBolsasAire = txtBolsasAirePesado.getText();


        if (!velMaximaText.isEmpty()) {
            velMaxima = Double.parseDouble(velMaximaText);
        } else {
            // La cadena velMaximaText está vacía, muestra un mensaje de error o realiza alguna acción adecuada
            // Por ejemplo:
        	ModelFactoryController.mostrarAlerta("Por favor, ingrese un valor para la velocidad máxima.");
            return;  // Sale del método sin continuar con la compra del vehículo
        }
        String textoVelCrucero = txtVelCruceroPesado.getText().trim();  // Obtiene el texto y elimina los espacios en blanco al inicio y al final
        double velCrucero;

        if (!textoVelCrucero.isEmpty()) {
            velCrucero = Double.parseDouble(textoVelCrucero);
        } else {
            // Manejar el caso cuando el campo está vacío
            // Por ejemplo, mostrar un mensaje de error o asignar un valor predeterminado
            velCrucero = 0.0;  // Valor predeterminado
        }

        if (ModelFactoryController.validarCamposPesado(marca, modelo, cambios, velMaxima, cilindraje, placa, tipoTransaccion, tipoCombustible, tipoTransmision, tipoNuevoUsado, numPasajeros, velCrucero, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire)) {
        	Vehiculo vehiculoPesado = ModelFactoryController.crearVehiculoPesado(marca, modelo, cambios, velMaxima, cilindraje,
                    placa, tipoTransaccion, tipoCombustible, tipoTransmision, tipoNuevoUsado, numPasajeros, velCrucero,
                    numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire);
        		concesionario.getListaVehiculos().add(vehiculoPesado);
        		concesionario.getListaTransacciones().add(vehiculoPesado);
        		ModelFactoryController.mostrarAlerta("¡Vehículo comprado!");
                limpiarCampos();
                ArrayList<Vehiculo> listaVehiculos = concesionario.getListaVehiculos();

                for (Vehiculo vehiculo : listaVehiculos) {
                    System.out.println(vehiculo.toString());
                }

        } else {
        	ModelFactoryController.mostrarAlerta("Por favor, completa todos los campos y selecciona una opción de revisión técnica.");
        }
    }

    @FXML
    private void limpiarDatosLiviano(ActionEvent event) {
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtMarcaPesado.clear();
        txtModeloPesado.clear();
        txtCambiosPesado.clear();
        txtVelMaximaPesado.clear();
        txtCilindrajePesado.clear();
        txtPlacaPesado.clear();
        listaTipoTransaccion.getSelectionModel().clearSelection();
        listaCombustiblePesado.getSelectionModel().clearSelection();
        listaTrasmisionPesados.getSelectionModel().clearSelection();
        listaNuevoUsadoPesado.getSelectionModel().clearSelection();
        txtPasajerosPesado.clear();
        txtVelCruceroPesado.clear();
        txtNumPuertasPesado.clear();
        txtCapMaleteroPesado.clear();
        tieneAirePesado.getSelectionModel().clearSelection();
        tieneCamReversaPesado.getSelectionModel().clearSelection();
        tieneABSPesado.getSelectionModel().clearSelection();
        txtBolsasAirePesado.clear();

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
    		Stage myStage = (Stage) this.btnVolverVentEmpleado1.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {
            e.printStackTrace();
    	}
    }



}

