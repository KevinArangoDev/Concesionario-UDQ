package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PickUp extends VehiculoLiviano implements Serializable{


	/**
	 * Declaracion de atributos
	 */
	private boolean cuatroXcuatro;
	private String capCajaCarga;

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
	 * @param hasCamaraReversa
	 * @param hasABS
	 * @param numBolsasAire
	 * @param sensorColision
	 * @param sensorTraficoCruzado
	 * @param asisPermCarril
	 */
	public PickUp(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String placa,
			String numPasajeros, boolean velCrucero, String numPuertas, String capMaletero,
			boolean hasAireAcondicionado, boolean hasCamaraReversa, boolean hasABS, String numBolsasAire,
			boolean sensorColision, boolean sensorTraficoCruzado, boolean asisPermCarril, boolean cuatroXcuatro, String capCajaCarga) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, placa, numPasajeros,
				velCrucero, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire,
				sensorColision, sensorTraficoCruzado, asisPermCarril);
		this.cuatroXcuatro = cuatroXcuatro;
		this.capCajaCarga = capCajaCarga;
	}



	/**
	 * Getters and Setters y metodo To String
	 * @return
	 */
//---------------------------------------------------------
	public boolean isCuatroXcuatro() {
		return cuatroXcuatro;
	}
	public void setCuatroXcuatro(boolean cuatroXcuatro) {
		this.cuatroXcuatro = cuatroXcuatro;
	}
	public String getCapCajaCarga() {
		return capCajaCarga;
	}
	public void setCapCajaCarga(String capCajaCarga) {
		this.capCajaCarga = capCajaCarga;
	}
	@Override
	public String toString() {
		return "PickUp [cuatroXcuatro=" + cuatroXcuatro + ", capCajaCarga=" + capCajaCarga + "]";
	}

//-----------------------------------------------------------------------



}

