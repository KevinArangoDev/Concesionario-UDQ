package co.uniquindio.concesionario.controller;



import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import co.uniquindio.concesionario.model.Cliente;
import co.uniquindio.concesionario.model.Concesionario;
import co.uniquindio.concesionario.model.Empleado;
import co.uniquindio.concesionario.model.TipoNuevoUsado;
import co.uniquindio.concesionario.model.TipoTransaccion;
import co.uniquindio.concesionario.model.Transaccion;
import co.uniquindio.concesionario.model.Vehiculo;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ReporteController implements Initializable {
	ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Transaccion, LocalDate> colFechaCompra;

    @FXML
    private TableColumn<Vehiculo, String> colMarca;

    @FXML
    private TableView<Vehiculo> tblInventario;

    @FXML
    private TableColumn<String, Vehiculo> colVehiculo;

//    @FXML
//    private TableColumn<Vehiculo, TipoTransaccion> colTransaccion;

    @FXML
    private TableColumn<Vehiculo, TipoNuevoUsado> colTipo;

    @FXML
    private TableView<Transaccion> Transacciones;

    @FXML
    private TableColumn<?, ?> colMetodoCompra;

    @FXML
    private TableColumn<String, Empleado> colEmpleado;

    @FXML
    private TableColumn<Vehiculo, String> colModelo;

    @FXML
    private TableColumn<Vehiculo, String> colPlaca;

    @FXML
    private TableColumn<String, Cliente> colCliente;
    @FXML
    private TableColumn<Vehiculo, Double> colValor;
    @FXML
    private Button btnVolver;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//tblInventario
		colMarca.setCellValueFactory( new PropertyValueFactory<>("marca") );
		colModelo.setCellValueFactory( new PropertyValueFactory<>("modelo") );
		colPlaca.setCellValueFactory( new PropertyValueFactory<>("placa") );
		colTipo.setCellValueFactory( new PropertyValueFactory<>("tipoNuevoUsado") );
//		colTransaccion.setCellValueFactory( new PropertyValueFactory<>("tipoTransaccion") );
		colValor.setCellValueFactory( new PropertyValueFactory<>("precio") );

		ArrayList<Vehiculo> vehiculos = modelFactoryController.concesionario.getListaVehiculos();

		tblInventario.setItems(FXCollections.observableArrayList(vehiculos));
		//tblTransacciones
		colEmpleado.setCellValueFactory(new PropertyValueFactory<>("empleado"));
		colVehiculo.setCellValueFactory(new PropertyValueFactory<>("vehiculo"));
		colCliente.setCellValueFactory(new PropertyValueFactory<>("cliente"));
		colFechaCompra.setCellValueFactory(new PropertyValueFactory<>("fechaCompra"));
		colMetodoCompra.setCellValueFactory(new PropertyValueFactory<>("metodoCompra"));



		List<Transaccion> transacciones = modelFactoryController.concesionario.getListaTransacciones();

		Transacciones.setItems(FXCollections.observableArrayList(transacciones));

	}
    @FXML
    void volverVenAdministrador(ActionEvent event) {
       	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/AdministradorView.fxml"));
    		Parent root = loader.load();


    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Login Administrador");
    		Stage myStage = (Stage) this.btnVolver.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {

    	}

    }







}

