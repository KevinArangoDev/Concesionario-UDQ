package co.uniquindio.concesionario.controller;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import co.uniquindio.concesionario.model.Concesionario;
import co.uniquindio.concesionario.model.Empleado;
import co.uniquindio.concesionario.model.TipoCombustible;
import co.uniquindio.concesionario.model.TipoNuevoUsado;
import co.uniquindio.concesionario.model.TipoTransaccion;
import co.uniquindio.concesionario.model.TipoTransmision;
import co.uniquindio.concesionario.model.Vehiculo;

public class ComprarLivianoController {

    private ModelFactoryController singleton;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> vendedorComboBox;


    @FXML
    private ComboBox<String> tieneCamReversa;


    @FXML
    private ComboBox<String> tieneSensorColision;

    @FXML
    private TextField txtCapMaletero;

    @FXML
    private ComboBox<TipoCombustible> listaCombustibleLiviano;

    @FXML
    private ComboBox<String> tieneAire;

    @FXML
    private ComboBox<String> tieneAsisCarril;

    @FXML
    private TextField txtBolsasAire;

    @FXML
    private ComboBox<TipoTransmision> listaTrasmisionLiviano;

    @FXML
    private ComboBox<TipoNuevoUsado> listaNuevoUsadoLiviano;

    @FXML
    private ComboBox<TipoTransaccion> listaTipoTransaccion;

    @FXML
    private TextField txtVelMaxima;

    @FXML
    private ComboBox<String> tieneABS;

    @FXML
    private TextField txtPasajeros;

    @FXML
    private TextField txtMarcaLiviano;

    @FXML
    private ImageView imgLogo;

    @FXML
    private TextField txtCambios;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtModeloLiviano;

    @FXML
    private ComboBox<String> tieneSenTrafCruzado;

    @FXML
    private TextField txtNumPuertas;

    @FXML
    private JFXButton btnLimpiarDatosLiviano;

    @FXML
    private TextField txtCilindraje;
    @FXML
    private TextField txtVelCrucero;
    @FXML
    private JFXButton btnVolverVentEmpleado;


    @FXML
    private void initialize() {
        singleton = ModelFactoryController.getInstance();

        ArrayList<Empleado> empleados = ModelFactoryController.getInstance().concesionario.getListaEmpleados(); // Obtén el ArrayList<Empleado>

	     // Agregar un nuevo empleado a la lista
	     Empleado nuevoEmpleado = new Empleado("Luis", "", "", "");
	     empleados.add(nuevoEmpleado);

	     // Agregar el nombre del nuevo empleado al ComboBox
	     String nombreEmpleado = nuevoEmpleado.getNombre();
	     vendedorComboBox.getItems().add(nombreEmpleado);

        // Configurar opciones para otros ComboBox
        listaCombustibleLiviano.getItems().addAll(TipoCombustible.values());
        listaTrasmisionLiviano.getItems().addAll(TipoTransmision.values());
        listaNuevoUsadoLiviano.getItems().addAll(TipoNuevoUsado.values());
        listaTipoTransaccion.getItems().addAll(TipoTransaccion.COMPRA, TipoTransaccion.REGISTRO);


        ObservableList<String> opcionesSiNo = FXCollections.observableArrayList("Si", "No");
        tieneAire.setItems(opcionesSiNo);
        tieneCamReversa.setItems(opcionesSiNo);
        tieneABS.setItems(opcionesSiNo);
        tieneSensorColision.setItems(opcionesSiNo);
        tieneSenTrafCruzado.setItems(opcionesSiNo);
        tieneAsisCarril.setItems(opcionesSiNo);
    }



	@FXML
    private void compraVehLiviano(ActionEvent event) {
    	Concesionario concesionario = ModelFactoryController.getInstance().getConcesionario();

        String marca = txtMarcaLiviano.getText();
        String modelo = txtModeloLiviano.getText();
        String cambios = txtCambios.getText();
        String velMaximaText = txtVelMaxima.getText();
        String cilindraje = txtCilindraje.getText();
        String placa = txtPlaca.getText();
        double velMaxima;
        TipoTransaccion tipoTransaccion = listaTipoTransaccion.getValue();
        TipoCombustible tipoCombustible = listaCombustibleLiviano.getValue();
        TipoTransmision tipoTransmision = listaTrasmisionLiviano.getValue();
        TipoNuevoUsado tipoNuevoUsado = listaNuevoUsadoLiviano.getValue();
        String numPasajeros = txtPasajeros.getText();

        String numPuertas = txtNumPuertas.getText();
        String capMaletero = txtCapMaletero.getText();
        boolean hasAireAcondicionado = tieneAire != null && tieneAire.getValue().equals("Si");
        boolean hasCamaraReversa = tieneCamReversa != null && tieneCamReversa.getValue().equals("Si");
        boolean hasABS = tieneABS != null && tieneABS.getValue().equals("Si");
        String numBolsasAire = txtBolsasAire.getText();
        boolean sensorColision = (tieneSensorColision != null && tieneSensorColision.getValue().equals("Si")) ? true : false;
        boolean sensorTraficoCruzado = (tieneSenTrafCruzado != null && tieneSenTrafCruzado.getValue().equals("Si")) ? true : false;
        boolean asisPermCarril = (tieneAsisCarril != null && tieneAsisCarril.getValue().equals("Si")) ? true : false;

        if (!velMaximaText.isEmpty()) {
            velMaxima = Double.parseDouble(velMaximaText);
        } else {
            // La cadena velMaximaText está vacía, muestra un mensaje de error o realiza alguna acción adecuada
            // Por ejemplo:
        	ModelFactoryController.mostrarAlerta("Por favor, ingrese un valor para la velocidad máxima.");
            return;  // Sale del método sin continuar con la compra del vehículo
        }
        String textoVelCrucero = txtVelCrucero.getText().trim();  // Obtiene el texto y elimina los espacios en blanco al inicio y al final
        double velCrucero;

        if (!textoVelCrucero.isEmpty()) {
            velCrucero = Double.parseDouble(textoVelCrucero);
        } else {
            // Manejar el caso cuando el campo está vacío
            // Por ejemplo, mostrar un mensaje de error o asignar un valor predeterminado
            velCrucero = 0.0;  // Valor predeterminado
        }

        if (ModelFactoryController.validarCampos(marca, modelo, cambios, velMaxima, cilindraje, placa, tipoTransaccion, tipoCombustible, tipoTransmision, tipoNuevoUsado, numPasajeros, velCrucero, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire, sensorColision, sensorTraficoCruzado, asisPermCarril)) {
        	Vehiculo vehiculoLiviano = ModelFactoryController.crearVehiculoLiviano(marca, modelo, cambios, velMaxima, cilindraje,
                    placa, tipoTransaccion, tipoCombustible, tipoTransmision, tipoNuevoUsado, numPasajeros, velCrucero,
                    numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire, sensorColision,
                    sensorTraficoCruzado, asisPermCarril);
        		concesionario.getListaVehiculos().add(vehiculoLiviano);
        		concesionario.getListaTransacciones().add(vehiculoLiviano);
        		ModelFactoryController.mostrarAlerta("¡Vehículo comprado!");
                limpiarCampos();

        } else {
        	ModelFactoryController.mostrarAlerta("Por favor, completa todos los campos y selecciona una opción de revisión técnica.");
        }
    }



	@FXML
    private void volVentEmpleado(ActionEvent event) {
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

    @FXML
    private void limpiarDatosLiviano(ActionEvent event) {
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtMarcaLiviano.clear();
        txtModeloLiviano.clear();
        txtCambios.clear();
        txtVelMaxima.clear();
        txtCilindraje.clear();
        txtPlaca.clear();
        listaTipoTransaccion.getSelectionModel().clearSelection();
        listaCombustibleLiviano.getSelectionModel().clearSelection();
        listaTrasmisionLiviano.getSelectionModel().clearSelection();
        listaNuevoUsadoLiviano.getSelectionModel().clearSelection();
        txtPasajeros.clear();
        txtVelCrucero.clear();
        txtNumPuertas.clear();
        txtCapMaletero.clear();
        tieneAire.getSelectionModel().clearSelection();
        tieneCamReversa.getSelectionModel().clearSelection();
        tieneABS.getSelectionModel().clearSelection();
        txtBolsasAire.clear();
        tieneSensorColision.getSelectionModel().clearSelection();
        tieneSenTrafCruzado.getSelectionModel().clearSelection();
        tieneAsisCarril.getSelectionModel().clearSelection();
    }



}
