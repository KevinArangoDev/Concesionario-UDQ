package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Camion extends VehiculoPesado implements Serializable{

	public Camion(TipoCombustible tipoCombustible, TipoTransmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, double frenAire, String cambios, Double velMax, String cilindraje, String placa,
			String numPasajeros, String numEjes, double velCrucero, String capCarga, String numPuertas, String capMaletero,
			boolean hasAireAcondicionado, boolean hasCamaraReversa, boolean hasABS, String numBolsasAire, String tipoCamion) {
		super(tipoCombustible, tipoTrasmision,  tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, placa, numPasajeros,
				velCrucero, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire);
	}
//---------------------------------------------------------------------------------------------------

}

