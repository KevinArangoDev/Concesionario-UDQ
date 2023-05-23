package co.uniquindio.concesionario.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import co.uniquindio.concesionario.model.Empleado;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class AdministradorController  implements Initializable{
	ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;



    @FXML
    private TableColumn<Empleado, String> colIdentificacion;

    @FXML
    private TableColumn<Empleado, String> colEstado;

    @FXML
    private TableColumn<Empleado, Double> colSueldo;



    @FXML
    private TableColumn<Empleado, String > colNombre;

    @FXML
    private Button btnCambiarEstado;

    @FXML
    private MenuItem login;

    @FXML
    private TextField txtBuscar;

    @FXML
    private Button btnAgregar;

    @FXML
    private TableColumn<Empleado, String> colCargo;

    @FXML
    private TableView<Empleado> tblEmpleados;

    @FXML
    private TableColumn<Empleado, String> colApellido;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnReportes;

    @FXML
    private Button btnActualizar;

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
    		stage.setTitle("Lista Facturas");
    		Stage myStage = (Stage) this.btnReportes.getScene().getWindow();
    		myStage.close();

    	} catch (IOException e) {

    	}



    }

    @FXML
    void volverInicio(ActionEvent event) {
    	 // Crear una ventana de confirmación
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmación");
        alert.setHeaderText("si  vuelves al inicio se cerrara sesion automaticamente");
        alert.setContentText("¿Está seguro de ejecutar esta acción?");

        // Agregar botones de "Sí" y "No"
        ButtonType buttonTypeYes = new ButtonType("Sí");
        ButtonType buttonTypeNo = new ButtonType("No");
        alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo);

        // Obtener el resultado de la ventana de confirmación
        ButtonType result = alert.showAndWait().orElse(ButtonType.NO);

        // Verificar si el usuario eligió "Sí"
        if (result == buttonTypeYes) {
        	try {
                // Obtener el MenuItem seleccionado
                MenuItem menuItem = (MenuItem) event.getSource();

                // Obtener el escenario actual a través del MenuItem
                Stage currentStage = (Stage) menuItem.getParentPopup().getOwnerWindow();

                // Cargar la ventana principal desde su archivo FXML
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/principalView.fxml"));
                Parent ventanaPrincipalRoot = loader.load();


                // Configurar cualquier dato necesario en el controlador de la ventana principal

                // Cambiar la escena actual en el escenario a la ventana principal
                Scene ventanaPrincipalScene = new Scene(ventanaPrincipalRoot);
                currentStage.setScene(ventanaPrincipalScene);

                // Mostrar la ventana principal
                currentStage.show();
            } catch (IOException e) {
                e.printStackTrace();
                // Manejar cualquier excepción que pueda ocurrir al cargar la ventana principal
            }

        }


    }


    @FXML
    void volverLogin(ActionEvent event) {
    	try {
            // Obtener el MenuItem seleccionado
            MenuItem menuItem = (MenuItem) event.getSource();

            // Obtener el escenario actual a través del MenuItem
            Stage currentStage = (Stage) menuItem.getParentPopup().getOwnerWindow();

            // Cargar la ventana principal desde su archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/loginAdministradorView.fxml"));
            Parent ventanaPrincipalRoot = loader.load();


            // Configurar cualquier dato necesario en el controlador de la ventana principal

            // Cambiar la escena actual en el escenario a la ventana principal
            Scene ventanaPrincipalScene = new Scene(ventanaPrincipalRoot);
            currentStage.setScene(ventanaPrincipalScene);

            // Mostrar la ventana principal
            currentStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void abrirVentAgregarEmpleado(ActionEvent event) {
    	try {

    		FXMLLoader loader = new FXMLLoader(
    				getClass().getResource("../view/AgregarEmpleadoView.fxml"));
    		Parent root = loader.load();



    		Scene scene = new Scene(root);
    		Stage stage = new Stage();

    		stage.setScene(scene);
    		stage.show();
    		stage.setTitle("Lista Facturas");
    		Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
    		myStage.close();

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
    void cambiarEstadoEmpleado(ActionEvent event) {

    }

	public void init() {

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		colCargo.setCellValueFactory( new PropertyValueFactory<>("cargo") );
		colIdentificacion.setCellValueFactory( new PropertyValueFactory<>("identificacion") );
    	colApellido.setCellValueFactory( new PropertyValueFactory<>("apellido") );
    	colNombre.setCellValueFactory( new PropertyValueFactory<>("nombre") );
    	colSueldo.setCellValueFactory( new PropertyValueFactory<>("sueldo") );
    	colEstado.setCellValueFactory( new PropertyValueFactory<>("nombre") );


    	ArrayList<Empleado> empleados  = modelFactoryController.concesionario.getListaEmpleados();

    	tblEmpleados.setItems( FXCollections.observableList(empleados) );

	}

}

