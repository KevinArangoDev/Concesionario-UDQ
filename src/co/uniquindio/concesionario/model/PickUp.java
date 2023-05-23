package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PickUp extends Carro implements Serializable{

	/**
	 * Declaracion de atributos
	 */
	private boolean cuatroXcuatro;
	private String capCajaCarga;

	/**
	 * Constructor de la clase Pickup  con los atributos de su superClase carro
	 * @param tipoCombustible
	 * @param tipoTrasmision
	 * @param tipoNuevoUsado
	 * @param marca
	 * @param modelo
	 * @param cambios
	 * @param velMax
	 * @param cilindraje
	 * @param numPasajeros
	 * @param placa
	 * @param numPuertas
	 * @param capMaletero
	 * @param hasAireAcondicionado
	 * @param hasCamaraReversa
	 * @param hasABS
	 * @param numBolsasAire
	 * @param cuatroXcuatro
	 * @param capCajaCarga
	 */
	public PickUp(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String numPasajeros,
			String placa, String numPuertas, String capMaletero, boolean hasAireAcondicionado, boolean hasCamaraReversa,
			boolean hasABS, String numBolsasAire, boolean cuatroXcuatro, String capCajaCarga) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, numPasajeros,
				placa, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire);
		this.cuatroXcuatro = cuatroXcuatro;
		this.capCajaCarga = capMaletero;
	}
	// constructor vacio
	public PickUp(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String numPasajeros,
			String placa, String numPuertas, String capMaletero, boolean hasAireAcondicionado, boolean hasCamaraReversa,
			boolean hasABS, String numBolsasAire) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, numPasajeros,
				placa, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire);
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

