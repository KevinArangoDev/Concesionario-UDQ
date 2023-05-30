package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Camioneta extends VehiculoLiviano implements Serializable{




	public Camioneta(TipoTransaccion tipoTransaccion, TipoCombustible tipoCombustible, TipoTransmision tipoTransmision,
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
		return "Camioneta [sensorColision=" + sensorColision + ", sensorTraficoCruzado=" + sensorTraficoCruzado
				+ ", asisPermCarril=" + asisPermCarril + ", numPuertas=" + numPuertas + ", capMaletero=" + capMaletero
				+ ", hasAireAcondicionado=" + hasAireAcondicionado + ", hasCamaraReversa=" + hasCamaraReversa
				+ ", hasABS=" + hasABS + ", numBolsasAire=" + numBolsasAire + ", tipoTransaccion=" + tipoTransaccion
				+ ", tipoCombustible=" + tipoCombustible + ", tipoTransmision=" + tipoTransmision + ", tipoNuevoUsado="
				+ tipoNuevoUsado + ", marca=" + marca + ", modelo=" + modelo + ", cambios=" + cambios + ", velMax="
				+ velMax + ", cilindraje=" + cilindraje + ", placa=" + placa + "]";
	}





}
