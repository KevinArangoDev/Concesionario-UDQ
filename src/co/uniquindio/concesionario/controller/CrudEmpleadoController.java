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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CrudEmpleadoController implements Initializable {
	ModelFactoryController singleton = ModelFactoryController.getInstance();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton btnBuscarEmpleado;

    @FXML
    private TextField txtIdBuscar;

    @FXML
    private TableColumn<?, ?> colEdad;

    @FXML
    private TableColumn<?, ?> colSueldo;

    @FXML
    private TableColumn<?, ?> colNombre;

    @FXML
    private JFXButton btnBloquear;

    @FXML
    private JFXButton btnAgregar;

    @FXML
    private TableColumn<?, ?> colCargo;

    @FXML
    private TableColumn<?, ?> colApellido;

    @FXML
    private JFXButton btnVolver;

    @FXML
    private TableView<?> tblCrudEmpleados;

    @FXML
    private ComboBox<?> cbxFilterCargo;

    @FXML
    private JFXButton btnEliminar;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private JFXButton btnActualizar;

    @FXML
    void agregarEmpleado(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/AgregarEmpleadoView.fxml"));
    		Parent root = loader.load();


    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Reportes");
    		Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
//    		myStage.close();

    	} catch (IOException e) {

    	}

    }



    @FXML
    void actualizarEmpleado(ActionEvent event) {

    }



    @FXML
    void eliminarEmpleado(ActionEvent event) {

    }


    @FXML
    void bloquearEmpleado(ActionEvent event) {

    }



    @FXML
    void volverVentanaAdmin(ActionEvent event) {

    }


    @FXML
    void filtrarEmpleados(ActionEvent event) {

    }



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}




}
