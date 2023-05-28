package co.uniquindio.concesionario.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import co.uniquindio.concesionario.model.Vehiculo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

public class VenderVehiculoController implements Initializable {

	ModelFactoryController singleton = ModelFactoryController.getInstance();

	public void setModelFactoryController(ModelFactoryController singleton) {
        this.singleton = singleton;
    }


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Obtener la lista de vehículos desde Concesionario
        ArrayList<Vehiculo> vehiculos = singleton.getConcesionario().getListaVehiculos();

        // Agregar los vehículos al ComboBox
        listaBuscarVehicvulo.getItems().addAll(vehiculos);

	}

	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> tblCarritoCompras;

    @FXML
    private ComboBox<Vehiculo> listaBuscarVehicvulo;

    @FXML
    private JFXButton btnLimpiarDatos;

    @FXML
    private Label lblTotal;

    @FXML
    private JFXTextField txtIdentificacion;

    @FXML
    private ImageView imgLogo;

    @FXML
    private JFXButton btnVolverVentEmpleado;

    @FXML
    private ComboBox<?> listaMetodoDeCompra;

    @FXML
    private JFXButton btnAgregarAlCarrito;

    @FXML
    private JFXTextField txtNombreCliente;

    @FXML
    private Label lblSubTotal;

    @FXML
    private DatePicker dateFechaDeCompra;

    @FXML
    private Label lblIva;

    @FXML
    private JFXTextField txtApellidoCliente;

    @FXML
    private JFXButton btnRealizarCompra;

    @FXML
    void buscarVehiculo(ActionEvent event) {

    }

    @FXML
    void agregarAlCarrito(ActionEvent event) {

    }

    @FXML
    void metodoDeCompra(ActionEvent event) {

    }

    @FXML
    void volVentEmpleado(ActionEvent event) {

    }



    @FXML
    void limpiarDatos(ActionEvent event) {

    }

    @FXML
    void realizarCompra(ActionEvent event) {

    }



}
