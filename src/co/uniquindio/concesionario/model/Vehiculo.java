package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class Vehiculo implements Serializable {
	/**
	 * declaracion de atributos
	 */

	protected TipoCombustible tipoCombustible;
	protected TipoTransmision tipoTransmision;
	protected TipoNuevoUsado tipoNuevoUsado;
	protected  String marca;
	protected String modelo;
	protected  String cambios;
	protected Double velMax;
	protected String cilindraje;
	protected String placa ;
	protected double precio;

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

	public Vehiculo(TipoTransaccion tipoTransaccion, TipoCombustible tipoCombustible, TipoTransmision tipoTransmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje,
			String placa) {
		super();
		this.tipoCombustible = tipoCombustible;
		this.tipoTransmision = tipoTransmision;
		this.tipoNuevoUsado = tipoNuevoUsado;
		this.marca = marca;
		this.modelo = modelo;
		this.cambios = cambios;
		this.velMax = velMax;
		this.cilindraje = cilindraje;
		this.placa = placa;

	}

	public Vehiculo() {
		// TODO Auto-generated constructor stub
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
	public TipoTransmision getTipoTrasmision() {
		return tipoTransmision;
	}
	public void setTipoTransmision(TipoTransmision tipoTrasmision) {
		this.tipoTransmision = tipoTrasmision;
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
		return cambios;
	}
	public void setCambios(String cambios) {
		this.cambios = cambios;
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
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public TipoTransmision getTipoTransmision() {
		return tipoTransmision;
	}


	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Vehiculo [tipoCombustible=" + tipoCombustible + ", tipoTransmision=" + tipoTransmision
				+ ", tipoNuevoUsado=" + tipoNuevoUsado + ", marca=" + marca + ", modelo=" + modelo + ", cambios="
				+ cambios + ", velMax=" + velMax + ", cilindraje=" + cilindraje + ", placa=" + placa + ", precio="
				+ precio + "]";
	}





	// metodo to String


}


