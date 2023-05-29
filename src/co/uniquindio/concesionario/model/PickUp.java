package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PickUp extends VehiculoLiviano implements Serializable{

	/**
	 * Constructor de la clase
	 * @param tipoCombustible
	 * @param tipoTrasmision
	 * @param tipoNuevoUsado
	 * @param marca
	 * @param modelo
	 * @param cambios
	 * @param velMax
	 * @param cilindraje
	 * @param placa
	 * @param numPasajeros
	 * @param velCrucero
	 * @param numPuertas
	 * @param capMaletero
	 * @param hasAireAcondicionado
	 * @param hasABS
	 * @param numBolsasAire
	 * @param sensorColision
	 * @param sensorTraficoCruzado
	 * @param asisPermCarril
	 */
	public PickUp(TipoTransaccion tipoTransaccion, TipoCombustible tipoCombustible, TipoTransmision tipoTransmision,
			TipoNuevoUsado tipoNuevoUsado, String marca, String modelo, String cambios, double velCrucero,
			String cilindraje, String placa, String numPasajeros, double velMax, String numPuertas,
			String capMaletero, boolean hasCamaraReversa, boolean hasAireAcondicionado, String numBolsasAire, boolean hasABS, boolean sensorColision, boolean sensorTraficoCruzado,
			boolean asisPermCarril) {
		super();
	}






}

