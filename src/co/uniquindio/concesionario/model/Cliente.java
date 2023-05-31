package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Cliente extends Persona implements Serializable {

	/**
	 * Atributos
	 */
	private String direccion;
	private String telefono;

	/**
	 * Constructor
	 */
	public Cliente(String nombre, String edad, String id, String direccion, String telefono , String apellido) {
		super(nombre, edad, id,apellido);
		this.direccion = direccion;
		this.telefono = telefono;
	}


	public Cliente(String nombre, String edad, String id, String apellido) {
		super(nombre, edad, id, apellido);

	}


	public Cliente(String nombre, String id, String apellido) {
		super(nombre, id, apellido);
		// TODO Auto-generated constructor stub
	}


	/**
	 * Getters and setters
	 */
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "cliente:"+getNombre() +" apellid"+getApellido();
	}



}