package co.uniquindio.concesionario.controller;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import co.uniquindio.concesionario.model.Moto;
import co.uniquindio.concesionario.model.TipoCombustible;
import co.uniquindio.concesionario.model.TipoNuevoUsado;
import co.uniquindio.concesionario.model.TipoTransmision;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;

public class ComprarMotoController {

	 private ModelFactoryController singleton;

	    public void initialize() {
	        singleton = ModelFactoryController.getInstance();

	    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField txtModelo;

    @FXML
    private ComboBox<TipoCombustible> listaCombustible;

    @FXML
    private ComboBox<TipoNuevoUsado> listaNuevoUsado;

    @FXML
    private JFXTextField txtVelocidadMaxima;

    @FXML
    private ImageView imgLogo;

    @FXML
    private JFXTextField txtCambios;

    @FXML
    private JFXTextField txtPlaca;

    @FXML
    private JFXButton btnVolverVentEmpleado;

    @FXML
    private JFXButton btnRealizarCompraMoto;

    @FXML
    private JFXButton btnLimpiarDatosMoto;

    @FXML
    private JFXTextField txtCilindraje;

    @FXML
    private JFXTextField txtMarca;

    @FXML
    private ComboBox<TipoTransmision> listaTrasmision;





    @FXML
    void listaCombustible(ActionEvent event) {

    }



    @FXML
    void listaTrasmision(ActionEvent event) {

    }



    @FXML
    void listaNuevoUsado(ActionEvent event) {

    }


    @FXML
    void realizarCompraMoto(ActionEvent event) {

    	TipoCombustible tipoCombustible = listaCombustible.getValue();
    	TipoTransmision tipoTransmision = listaTrasmision.getValue();
        TipoNuevoUsado tipoNuevoUsado = listaNuevoUsado.getValue();
    	String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String cambios = txtCambios.getText();
        double velMaxima = Double.parseDouble(txtVelocidadMaxima.getText());
        String cilindraje = txtCilindraje.getText();
        String placa = txtPlaca.getText();

        Moto moto = new Moto();
        moto.setTipoCombustible(tipoCombustible);
        moto.setTipoTransmision(tipoTransmision);
        moto.setTipoNuevoUsado(tipoNuevoUsado);
        moto.setMarca(marca);
        moto.setModelo(modelo);
        moto.setCambios(cambios);
        moto.setVelMax(velMaxima);
        moto.setCilindraje(cilindraje);
        moto.setPlaca(placa);

        singleton.getListaVehiculos().add(moto);

    }


    @FXML
    void limpiarDatosMoto(ActionEvent event) {

    }


    @FXML
    void volVentEmpleado(ActionEvent event) {

    }

}

