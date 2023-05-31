package co.uniquindio.concesionario.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import co.uniquindio.concesionario.model.Cliente;
import co.uniquindio.concesionario.model.Empleado;
import co.uniquindio.concesionario.model.Transaccion;
import co.uniquindio.concesionario.model.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class AlquilarVehiculoController implements Initializable {
	ModelFactoryController singleton = ModelFactoryController.getInstance();

	public void setModelFactoryController(ModelFactoryController singleton) {
        this.singleton = singleton;
    }


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Obtener la lista de vehículos desde Concesionario
        ArrayList<Vehiculo> vehiculos = singleton.getConcesionario().getListaVehiculos();

		colVehiculo.setCellValueFactory( new PropertyValueFactory<>("placa") );
		colPrecio.setCellValueFactory( new PropertyValueFactory<>("precio") );

        // Agregar los vehículos al ComboBox
        listaBuscarVehicvulo.getItems().addAll(vehiculos);
        listaMetodoDeCompra.getItems().add("Alquiler");


	}

	 private Vehiculo vehiculoSeleccionado;

	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Vehiculo> tblCarritoCompras;

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
    private ComboBox<String> listaMetodoDeCompra;

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
    private TableColumn<Vehiculo, String> colVehiculo;

    @FXML
    private TableColumn<Vehiculo, Double> colPrecio;

    @FXML
    void buscarVehiculo(ActionEvent event) {

    }

    @FXML
    void agregarAlCarrito(ActionEvent event) {
    	vehiculoSeleccionado = listaBuscarVehicvulo.getSelectionModel().getSelectedItem();
        // Agregar los datos del vehículo a la TableView "tblCarritoCompras"
        // Suponiendo que tienes las columnas adecuadas en la TableView, puedes utilizar el método "getItems()" para obtener la lista de elementos y luego agregar el vehículo seleccionado a esa lista.
        tblCarritoCompras.getItems().add(vehiculoSeleccionado);

    }

    @FXML
    void metodoDeCompra(ActionEvent event) {




    }

    @FXML
    void volVentEmpleado(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/EmpleadoView.fxml"));
    		Parent root = loader.load();


    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Login Administrador");
    		Stage myStage = (Stage) this.btnVolverVentEmpleado.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {

    	}

    }

 

    @FXML
    void limpiarDatos(ActionEvent event) {

    }

    @FXML
    void realizarCompra(ActionEvent event) {

    	String nombre = txtNombreCliente.getText();
    	String id = txtIdentificacion.getText();
    	String apellido = txtApellidoCliente.getText();

    	if( !nombre.isEmpty() && !id.isEmpty() && !apellido.isEmpty() ){

    		Empleado empleado = singleton.getEmpleado();
	    	Cliente cliente = new Cliente(nombre, id, apellido);

	    	singleton.concesionario.crearTransaccion( new Transaccion(vehiculoSeleccionado, cliente, empleado, dateFechaDeCompra.getValue(), listaMetodoDeCompra.getSelectionModel().getSelectedItem()) );
    	}

    }

}
