package co.uniquindio.concesionario.controller;
import com.jfoenix.controls.JFXButton;

import co.uniquindio.concesionario.model.Empleado;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class AdministradorController implements Initializable {
	ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton btnBuscarEmpleado;

    @FXML
    private TableColumn<Empleado, String> colApellido;

    @FXML
    private TextField txtIdentificacionEmpleado;

    @FXML
    private JFXButton btnCRUDEmpleado;

    @FXML
    private JFXButton btnCerrarSesion;

    @FXML
    private TableColumn<Empleado, String> colEdad;

    @FXML
    private TableColumn<Empleado, Double> colSueldo;

    @FXML
    private TableColumn<Empleado, String> colNombre;

    @FXML
    private TableColumn<Empleado, String> colId;

    @FXML
    private TableColumn<Empleado, String> colCargo;

    @FXML
    private JFXButton btnReportes;

    @FXML
    private TableView<Empleado> tblListaEmpleados;


    @FXML
    void ventCrudEmpleado(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/CrudEmpleadoView.fxml"));
    		Parent root = loader.load();


    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("crud Empleado");
    		Stage myStage = (Stage) this.btnCRUDEmpleado.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {

    	}

    }



    @FXML
    void ventReportes(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/ReportesView.fxml"));
    		Parent root = loader.load();


    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Reportes");
    		Stage myStage = (Stage) this.btnReportes.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {

    	}
    }



    @FXML
    void cerrarSesion(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/LoginAdministradorView.fxml"));
    		Parent root = loader.load();


    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Login Administrador");
    		Stage myStage = (Stage) this.btnCRUDEmpleado.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {

    	}

    }
    public TableView<Empleado> getTableView() {
        return tblListaEmpleados;
    }
    @Override
 	public void initialize(URL location, ResourceBundle resources) {
		colNombre.setCellValueFactory( new PropertyValueFactory<>("nombre") );
		colApellido.setCellValueFactory( new PropertyValueFactory<>("apellido") );
		colId.setCellValueFactory( new PropertyValueFactory<>("id") );
		colCargo.setCellValueFactory( new PropertyValueFactory<>("cargo") );
		colSueldo.setCellValueFactory( new PropertyValueFactory<>("sueldo") );
		colEdad.setCellValueFactory( new PropertyValueFactory<>("edad") );



		ArrayList<Empleado> empleados = modelFactoryController.concesionario.getListaEmpleados();

		tblListaEmpleados.setItems(FXCollections.observableArrayList(empleados));

 	}

}




