package co.uniquindio.concesionario.controller;




import com.jfoenix.controls.JFXButton;

import co.uniquindio.concesionario.exception.ConcesionarioException;
import co.uniquindio.concesionario.model.Empleado;
import co.uniquindio.concesionario.model.EstadoEmpleado;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class CrudEmpleadoController implements Initializable {
	ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton btnBuscarEmpleado;

    @FXML
    private TextField txtIdBuscar;
    @FXML
    private TableColumn<Empleado, EstadoEmpleado> colEstado;


    @FXML
    private TableColumn<Empleado, String> colEdad;

    @FXML
    private TableColumn<Empleado, String> colSueldo;

    @FXML
    private TableColumn<Empleado, String> colNombre;

    @FXML
    private JFXButton btnBloquear;

    @FXML
    private JFXButton btnAgregar;

    @FXML
    private TableColumn<Empleado, String> colCargo;

    @FXML
    private TableColumn<Empleado, String> colApellido;

    @FXML
    private JFXButton btnVolver;

    @FXML
    private TableView<Empleado> tblCrudEmpleados;

    @FXML
    private ComboBox<?> cbxFilterCargo;

    @FXML
    private JFXButton btnEliminar;

    @FXML
    private TableColumn<Empleado, String> colId;

    @FXML
    private JFXButton btnActualizar;

	private Empleado empleadoSeleccionado;

	private EstadoEmpleado estado;

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
    		stage.setTitle("Agregar Empleado");
			Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
			myStage.close();


    	} catch (IOException e) {

    	}

    }



    @FXML
    void actualizarEmpleado(ActionEvent event) {
    	if(tblCrudEmpleados.getSelectionModel().getSelectedItem() !=null){
        	try {

        		FXMLLoader loader = new FXMLLoader(
        				getClass().getResource("../view/actualizarEmpleadoView.fxml"));
        		Parent root = loader.load();
        		((ActualizarEmpleadoController) loader.getController()).recibirPersona(tblCrudEmpleados.getSelectionModel().getSelectedItem());



        		Scene scene = new Scene(root);
        		Stage stage = new Stage();

        		stage.setScene(scene);
        		stage.show();
        		stage.setTitle("Actualizar Empleado");
    			Stage myStage = (Stage) this.btnActualizar.getScene().getWindow();
    			myStage.close();


        	} catch (IOException e) {

        	}

    	}else{
    		mostrarMensaje("actualizarPersona", "persona no seleccionada", "no selecciono una persona", AlertType.INFORMATION);
    	}
    }
    public void mostrarMensaje(String titulo , String header , String contenido , AlertType alertType){
    	Alert alert = new Alert(alertType);
    	alert.setTitle(titulo);
    	alert.setHeaderText(header);
    	alert.setContentText(contenido);
    	alert.showAndWait();
    }




    @FXML
    void eliminarEmpleado(ActionEvent event) {
    	if(tblCrudEmpleados.getSelectionModel().getSelectedItem() !=null){
    		empleadoSeleccionado=tblCrudEmpleados.getSelectionModel().getSelectedItem();
    		try {
				modelFactoryController.concesionario.eliminarEmpleado(empleadoSeleccionado);
			} catch (ConcesionarioException e) {
				e.getMessage();
				mostrarMensaje("crudException", "informacioninvalida", e.getMessage() , AlertType.INFORMATION);

			}

    		tblCrudEmpleados.getItems().remove(empleadoSeleccionado);


    		getTableView().refresh();

    	}
    	else{
    		mostrarMensaje("EliminarEmpleado", "persona no seleccionada", "no selecciono una persona", AlertType.INFORMATION);

    	}


    }


    @FXML
    void bloquearEmpleado(ActionEvent event) {
        Empleado empleadoSeleccionado = tblCrudEmpleados.getSelectionModel().getSelectedItem();

        if (empleadoSeleccionado != null) {
            // Obtener el estado actual del empleado
            EstadoEmpleado estadoActual = empleadoSeleccionado.getEstadoEmpleado();

            // Cambiar el estado del empleado utilizando el modelo de datos
            if (estadoActual == EstadoEmpleado.ACTIVO) {
            	estado=EstadoEmpleado.BLOQUEADO;
                try {
					modelFactoryController.concesionario.bloquearEmpleado(empleadoSeleccionado, estado);
				} catch (ConcesionarioException e) {

					e.printStackTrace();
				}
            } else {
            	estado=EstadoEmpleado.ACTIVO;
                try {
					modelFactoryController.concesionario.bloquearEmpleado(empleadoSeleccionado, estado);
				} catch (ConcesionarioException e) {

					e.printStackTrace();
				}
            }

            // Actualizar la vista de la TableView
            tblCrudEmpleados.refresh();
        }else{
    		mostrarMensaje("actualizarEmpleado", "persona no seleccionada", "no selecciono una persona", AlertType.INFORMATION);


        }

    }



    @FXML
    void volverVentanaAdmin(ActionEvent event) {
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


    @FXML
    void filtrarEmpleados(ActionEvent event) {

    	String idFiltro = txtIdBuscar.getText();
    	 if (idFiltro!=null){
    	        // Filtrar la tabla de empleados por ID
    	        ObservableList<Empleado> empleadosFiltrados = FXCollections.observableArrayList();
    	        for (Empleado empleado : tblCrudEmpleados.getItems()) {
    	            if (empleado.getId().equals(idFiltro)) {
    	                empleadosFiltrados.add(empleado);
    	            }
    	        }

    	        // Actualizar la vista de la tabla con los empleados filtrados
    	        tblCrudEmpleados.setItems(empleadosFiltrados);


    	 }else{

    		 tblCrudEmpleados.refresh();

    	 }

    }
    public TableView<Empleado> getTableView() {
        return tblCrudEmpleados;
    }



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		colNombre.setCellValueFactory( new PropertyValueFactory<>("nombre") );
		colApellido.setCellValueFactory( new PropertyValueFactory<>("apellido") );
		colId.setCellValueFactory( new PropertyValueFactory<>("id") );
		colCargo.setCellValueFactory( new PropertyValueFactory<>("cargo") );
		colSueldo.setCellValueFactory( new PropertyValueFactory<>("sueldo") );
		colEdad.setCellValueFactory( new PropertyValueFactory<>("edad") );
		colEstado.setCellValueFactory( new PropertyValueFactory<>("estadoEmpleado") );



		ArrayList<Empleado> empleados = modelFactoryController.concesionario.getListaEmpleados();

		tblCrudEmpleados.setItems(FXCollections.observableArrayList(empleados));

	}




}
