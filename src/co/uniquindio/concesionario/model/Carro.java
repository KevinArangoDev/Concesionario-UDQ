package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class Carro  extends Vehiculo implements Serializable{


	/**
	 * Declaracion de atributos
	 */
	private String numPasajeros;
	private boolean velCrucero;
	private String numPuertas;
	private String capMaletero;
	private boolean hasAireAcondicionado;
	private boolean hasCamaraReversa;
	private boolean hasABS;
	private String numBolsasAire;

	/**
	 * constructor con los atributos de la clase Carro y su superClase Vehiculo
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
	 */

	public Carro(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String placa,
			String numPasajeros, boolean velCrucero, String numPuertas, String capMaletero,
			boolean hasAireAcondicionado, boolean hasCamaraReversa, boolean hasABS, String numBolsasAire) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, placa);
		this.numPasajeros = numPasajeros;
		this.velCrucero = velCrucero;
		this.numPuertas = numPuertas;
		this.capMaletero = capMaletero;
		this.hasAireAcondicionado = hasAireAcondicionado;
		this.hasCamaraReversa = hasCamaraReversa;
		this.hasABS = hasABS;
		this.numBolsasAire = numBolsasAire;
	}

// ------------------------------------------------------------------
	/**
	 * Getters and Setters
	 * @return
	 */


	public String getNumPuertas() {
		return numPuertas;
	}
	public String getNumPasajeros() {
		return numPasajeros;
	}
	public void setNumPasajeros(String numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	public boolean isVelCrucero() {
		return velCrucero;
	}
	public void setVelCrucero(boolean velCrucero) {
		this.velCrucero = velCrucero;
	}

	public void setNumPuertas(String numPuertas) {
		this.numPuertas = numPuertas;
	}
	public String getCapMaletero() {
		return capMaletero;
	}
	public void setCapMaletero(String capMaletero) {
		this.capMaletero = capMaletero;
	}
	public boolean isHasAireAcondicionado() {
		return hasAireAcondicionado;
	}
	public void setHasAireAcondicionado(boolean hasAireAcondicionado) {
		this.hasAireAcondicionado = hasAireAcondicionado;
	}
	public boolean isHasCamaraReversa() {
		return hasCamaraReversa;
	}
	public void setHasCamaraReversa(boolean hasCamaraReversa) {
		this.hasCamaraReversa = hasCamaraReversa;
	}
	public boolean isHasABS() {
		return hasABS;
	}
	public void setHasABS(boolean hasABS) {
		this.hasABS = hasABS;
	}
	public String getNumBolsasAire() {
		return numBolsasAire;
	}
	public void setNumBolsasAire(String numBolsasAire) {
		this.numBolsasAire = numBolsasAire;
	}
// --------------------------------------------------------------

	//metodo toString
	@Override
	public String toString() {
		return "Carro [numPuertas=" + numPuertas + ", capMaletero=" + capMaletero + ", hasAireAcondicionado="
				+ hasAireAcondicionado + ", hasCamaraReversa=" + hasCamaraReversa + ", hasABS=" + hasABS

				+ ", numBolsasAire=" + numBolsasAire + "]";
	}
}
