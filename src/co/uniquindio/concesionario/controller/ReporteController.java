package co.uniquindio.concesionario.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.uniquindio.concesionario.model.Concesionario;
import co.uniquindio.concesionario.model.Vehiculo;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ReporteController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Vehiculo> tablaVehiculos;



    @FXML
    private TableColumn<Vehiculo, String> columnaMarca;

    @FXML
    private TableColumn<Vehiculo, String> columnaModelo;

    @FXML
    private TableColumn<Vehiculo, String> columnaPlaca;

    @FXML
    private TableColumn<Vehiculo, String> columnaTransaccion;


    @FXML
    private TableView<Vehiculo> tablaTransacciones;

    @FXML
    private TableColumn<Vehiculo, String> columnaModeloTransaccion;

    @FXML
    private TableColumn<Vehiculo, String> columnaPlacaTransaccion;




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Configurar las celdas de fábrica para cada columna
        columnaMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        columnaModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        columnaPlaca.setCellValueFactory(new PropertyValueFactory<>("placa"));
        columnaTransaccion.setCellValueFactory(new PropertyValueFactory<>("tipoTransaccion"));
        columnaModeloTransaccion.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        columnaPlacaTransaccion.setCellValueFactory(new PropertyValueFactory<>("placa"));
        // Configurar otras columnas

        // Obtener la instancia del Concesionario desde ModelFactoryController
        Concesionario concesionario = ModelFactoryController.getInstance().getConcesionario();

        // Configurar los datos en la tabla
        tablaVehiculos.setItems(FXCollections.observableArrayList(concesionario.getListaVehiculos()));
        tablaTransacciones.setItems(FXCollections.observableArrayList(concesionario.getListaTransacciones()));

    }



}

