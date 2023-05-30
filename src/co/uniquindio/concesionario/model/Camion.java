package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Camion extends VehiculoPesado implements Serializable{

	public Camion(TipoTransaccion tipoTransaccion, TipoCombustible tipoCombustible, TipoTransmision tipoTransmision,
			TipoNuevoUsado tipoNuevoUsado, String marca, String modelo, String cambios, Double velMax,
			String cilindraje, String placa, String numPasajeros, double velCrucero, String numPuertas,
			String capMaletero, boolean hasAireAcondicionado, boolean hasCamaraReversa, boolean hasABS,
			String numBolsasAire) {
		super(tipoTransaccion, tipoCombustible, tipoTransmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje,
				placa, numPasajeros, velCrucero, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS,
				numBolsasAire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Camion [capMaletero=" + capMaletero + ", salidasEmergencia=" + salidasEmergencia + ", capCajaCarga="
				+ capCajaCarga + ", numPuertas=" + numPuertas + ", hasAireAcondicionado=" + hasAireAcondicionado
				+ ", hasCamaraReversa=" + hasCamaraReversa + ", hasABS=" + hasABS + ", numBolsasAire=" + numBolsasAire
				+ ", tipoTransaccion=" + tipoTransaccion + ", tipoCombustible=" + tipoCombustible + ", tipoTransmision="
				+ tipoTransmision + ", tipoNuevoUsado=" + tipoNuevoUsado + ", marca=" + marca + ", modelo=" + modelo
				+ ", cambios=" + cambios + ", velMax=" + velMax + ", cilindraje=" + cilindraje + ", placa=" + placa
				+ "]";
	}




//---------------------------------------------------------------------------------------------------

}

