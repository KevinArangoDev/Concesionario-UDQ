package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Camion extends Carro implements Serializable{
	/**
	 * Declaracion de atributos
	 */
	private String tipoCamion;
	private String capCarga;
	private double frenAire;
	private String numEjes;

	/**
	 * Contructor de la clase Camion con los atributos de su superclase  Carro
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
	 * @param tipoCamion
	 * @param capCarga
	 * @param frenAire
	 * @param numEjes
	 */
	public Camion(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String numPasajeros,
			String placa, String numPuertas, String capMaletero, boolean hasAireAcondicionado, boolean hasCamaraReversa,
			boolean hasABS, String numBolsasAire, String tipoCamion, String capCarga, double frenAire, String numEjes) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, numPasajeros,
				placa, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire);
		this.tipoCamion = tipoCamion;
		this.capCarga = capMaletero;
		this.frenAire = frenAire;
		this.numEjes = numEjes;
	}

	// constructor vacio
	public Camion(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String numPasajeros,
			String placa, String numPuertas, String capMaletero, boolean hasAireAcondicionado, boolean hasCamaraReversa,
			boolean hasABS, String numBolsasAire) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, numPasajeros,
				placa, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire);
	}

	/**
	 * Getters and setters  y metodo to String
	 * @return
	 */
//-------------------------------------------------------------------------
	public String getTipoCamion() {
		return tipoCamion;
	}
	public void setTipoCamion(String tipoCamion) {
		this.tipoCamion = tipoCamion;
	}
	public String getCapCarga() {
		return capCarga;
	}
	public void setCapCarga(String capCarga) {
		this.capCarga = capCarga;
	}
	public double getFrenAire() {
		return frenAire;
	}
	public void setFrenAire(double frenAire) {
		this.frenAire = frenAire;
	}
	public String getNumEjes() {
		return numEjes;
	}
	public void setNumEjes(String numEjes) {
		this.numEjes = numEjes;
	}
	@Override
	public String toString() {
		return "Camion [tipoCamion=" + tipoCamion + ", capCarga=" + capCarga + ", frenAire=" + frenAire + ", numEjes="
				+ numEjes + "]";
	}

//-------------------------------------------------------------
}

