package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class Vehiculo implements Serializable {
	/**
	 * declaracion de atributos
	 */
	private TipoCombustible tipoCombustible;
	private TipoTrasmision tipoTrasmision;
	private TipoNuevoUsado tipoNuevoUsado;
	private  String marca;
	private String modelo;
	private  String Cambios;
	private Double velMax;
	private String cilindraje;
	private String numPasajeros;
	private String placa ;

	/**
	 * Constructor para la clase Vehiculo
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
	 */

	public Vehiculo(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String numPasajeros,
			String placa) {
		super();
		this.tipoCombustible = tipoCombustible;
		this.tipoTrasmision = tipoTrasmision;
		this.tipoNuevoUsado = tipoNuevoUsado;
		this.marca = marca;
		this.modelo = modelo;
		Cambios = cambios;
		this.velMax = velMax;
		this.cilindraje = cilindraje;
		this.numPasajeros = numPasajeros;
		this.placa = placa;
	}

	/**
	 * constructor vacio
	 */

	public Vehiculo() {
		super();
	}

	/**
	 * Getters and setters
	 * @return
	 */

	public TipoCombustible getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(TipoCombustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	public TipoTrasmision getTipoTrasmision() {
		return tipoTrasmision;
	}
	public void setTipoTrasmision(TipoTrasmision tipoTrasmision) {
		this.tipoTrasmision = tipoTrasmision;
	}
	public TipoNuevoUsado getTipoNuevoUsado() {
		return tipoNuevoUsado;
	}
	public void setTipoNuevoUsado(TipoNuevoUsado tipoNuevoUsado) {
		this.tipoNuevoUsado = tipoNuevoUsado;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCambios() {
		return Cambios;
	}
	public void setCambios(String cambios) {
		Cambios = cambios;
	}
	public Double getVelMax() {
		return velMax;
	}
	public void setVelMax(Double velMax) {
		this.velMax = velMax;
	}
	public String getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}
	public String getNumPasajeros() {
		return numPasajeros;
	}
	public void setNumPasajeros(String numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	// metodo to String
	@Override
	public String toString() {
		return "Vehiculo [tipoCombustible=" + tipoCombustible + ", tipoTrasmision=" + tipoTrasmision
				+ ", tipoNuevoUsado=" + tipoNuevoUsado + ", marca=" + marca + ", modelo=" + modelo + ", Cambios="
				+ Cambios + ", velMax=" + velMax + ", cilindraje=" + cilindraje + ", numPasajeros=" + numPasajeros
				+ ", placa=" + placa + "]";
	}







}
