package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Moto extends Vehiculo implements Serializable{

	public Moto(TipoCombustible tipoCombustible, TipoTransmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String placa) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, placa);
		// TODO Auto-generated constructor stub
	}

	public Moto(){
		super();
	}


}
