package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class Carro  extends Vehiculo implements Serializable{


	/**
	 * Declaracion de atributos
	 */
	private String numPasajeros;
	private double velCrucero;
	protected String numPuertas;
	protected String capMaletero;
	protected boolean hasAireAcondicionado;
	protected boolean hasCamaraReversa;
	protected boolean hasABS;
	protected String numBolsasAire;

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

	public Carro(TipoTransaccion tipoTransaccion, TipoCombustible tipoCombustible, TipoTransmision tipoTransmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String placa,
			String numPasajeros, double velCrucero, String numPuertas, String capMaletero,
			boolean hasAireAcondicionado, boolean hasCamaraReversa, boolean hasABS, String numBolsasAire) {
		super(tipoTransaccion, tipoCombustible, tipoTransmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, placa);
		this.numPasajeros = numPasajeros;
		this.velCrucero = velCrucero;
		this.numPuertas = numPuertas;
		this.capMaletero = capMaletero;
		this.hasAireAcondicionado = hasAireAcondicionado;
		this.hasCamaraReversa = hasCamaraReversa;
		this.hasABS = hasABS;
		this.numBolsasAire = numBolsasAire;
	}

public Carro() {
	super();
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
	public double getVelCrucero() {
		return velCrucero;
	}
	public void setVelCrucero(double velCrucero) {
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

	@Override
	public String toString() {
		return "Carro [numPasajeros=" + numPasajeros + ", velCrucero=" + velCrucero + ", numPuertas=" + numPuertas
				+ ", capMaletero=" + capMaletero + ", hasAireAcondicionado=" + hasAireAcondicionado
				+ ", hasCamaraReversa=" + hasCamaraReversa + ", hasABS=" + hasABS + ", numBolsasAire=" + numBolsasAire
				+ "]";
	}

	//metodo toString

}
