package co.uniquindio.concesionario.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import co.uniquindio.concesionario.model.TipoCombustible;
import co.uniquindio.concesionario.model.TipoNuevoUsado;
import co.uniquindio.concesionario.model.TipoTrasmision;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;

public class ComprarVehiculoController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Obtener los valores de la enumeración TipoCombustible
        TipoCombustible[] tiposCombustible = TipoCombustible.values();

        // Agregar los valores al ComboBox
        listaTipoCombustible.getItems().addAll(tiposCombustible);

        TipoTrasmision[] tiposTrasmision = TipoTrasmision.values();

        // Agregar los valores al ComboBox
        listaTipoTrasmision.getItems().addAll(tiposTrasmision);

        TipoNuevoUsado[] tiposNuevoUsado = TipoNuevoUsado.values();

        // Agregar los valores al ComboBox
        listaTipoNuevoUsado.getItems().addAll(tiposNuevoUsado);
	}
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<TipoCombustible> listaTipoCombustible;

    @FXML
    private JFXTextField txtModelo;

    @FXML
    private JFXButton btnLimpiarDatos;

    @FXML
    private ComboBox<TipoTrasmision> listaTipoTrasmision;

    @FXML
    private JFXTextField txtVelocidadMaxima;

    @FXML
    private ImageView imgLogo;

    @FXML
    private JFXButton btnVolverVentEmpleado;

    @FXML
    private JFXTextField txtCilindraje;

    @FXML
    private ComboBox<?> listaTipoDeVehiculos;

    @FXML
    private JFXTextField txtMarca;

    @FXML
    private JFXButton btnRealizarCompra;

    @FXML
    private ComboBox<TipoNuevoUsado> listaTipoNuevoUsado;

    @FXML
    private JFXTextField txtNumPasajeros;

    @FXML
    void listaVehiculos(ActionEvent event) {

    }

    @FXML
    void listaTipoTrasmision(ActionEvent event) {

    }

    @FXML
    void listaTipoCombustible(ActionEvent event) {

    }

    @FXML
    void listaTipNueUsa(ActionEvent event) {

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