package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Camion extends VehiculoPesado implements Serializable{


	/**
	 * Declaracion de atributos
	 */
	private String tipoCamion;
	private String capCarga;
	private double frenAire;
	private String numEjes;


	public Camion(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, double frenAire, String cambios, Double velMax, String cilindraje, String placa,
			String numPasajeros, String numEjes, boolean velCrucero, String capCarga, String numPuertas, String capMaletero,
			boolean hasAireAcondicionado, boolean hasCamaraReversa, boolean hasABS, String numBolsasAire, String tipoCamion) {
		super(tipoCombustible, tipoTrasmision,  tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, placa, numPasajeros,
				velCrucero, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire);
		this.tipoCamion = tipoCamion;
		this.capCarga = capCarga;
		this.frenAire = frenAire;
		this.numEjes = numEjes;
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

