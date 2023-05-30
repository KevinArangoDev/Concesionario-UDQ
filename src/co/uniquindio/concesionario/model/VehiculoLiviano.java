package co.uniquindio.concesionario.model;

import java.io.Serializable;

import co.uniquindio.concesionario.model.Carro;

@SuppressWarnings("serial")
public abstract class VehiculoLiviano  extends Carro implements Serializable{
	/**
	 * Declaracion de atributos
	 */
	protected boolean sensorColision;
	protected  boolean sensorTraficoCruzado;
	protected boolean asisPermCarril;

	/**
	 * Constructor de la clase VehiculoLiviano y los demas atributos de su superclase
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
	 * @param hasCamaraReversa
	 * @param hasABS
	 * @param numBolsasAire
	 * @param sensorColision
	 * @param sensorTraficoCruzado
	 * @param asisPermCarril
	 */



	public VehiculoLiviano() {
		super();
	}
	public VehiculoLiviano(TipoTransaccion tipoTransaccion, TipoCombustible tipoCombustible,
			TipoTransmision tipoTransmision, TipoNuevoUsado tipoNuevoUsado, String marca, String modelo, String cambios,
			Double velMax, String cilindraje, String placa, String numPasajeros, double velCrucero, String numPuertas,
			String capMaletero, boolean hasAireAcondicionado, boolean hasCamaraReversa, boolean hasABS,
			String numBolsasAire) {
		super(tipoTransaccion, tipoCombustible, tipoTransmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje,
				placa, numPasajeros, velCrucero, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS,
				numBolsasAire);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Getters and Setters  , to String
	 * @return
	 */

//----------------------------------------------------------------------

	public boolean isSensorColision() {
		return sensorColision;
	}
	public void setSensorColision(boolean sensorColision) {
		this.sensorColision = sensorColision;
	}
	public boolean isSensorTraficoCruzado() {
		return sensorTraficoCruzado;
	}
	public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
		this.sensorTraficoCruzado = sensorTraficoCruzado;
	}
	public boolean isAsisPermCarril() {
		return asisPermCarril;
	}
	public void setAsisPermCarril(boolean asisPermCarril) {
		this.asisPermCarril = asisPermCarril;
	}
	@Override
	public String toString() {
		return "VehiculoLiviano [sensorColision=" + sensorColision + ", sensorTraficoCruzado=" + sensorTraficoCruzado
				+ ", asisPermCarril=" + asisPermCarril + "]";
	}


//------------------------------------------------------------------------------------------------

}

