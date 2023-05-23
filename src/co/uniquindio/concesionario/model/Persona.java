package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class Persona implements Serializable{

	/**
	 * Atributos
	 */
	private String nombre;
	private String edad;
	private String id;
	private String apellido;


	/**
	 * Constructor
	 * @param nombre
	 * @param edad
	 * @param id
	 */

	public Persona() {
		super();
	}

	public Persona(String nombre, String edad, String id, String apellido) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.id = id;
		this.apellido = apellido;
	}

	/**
	 * Getters and setters
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", id=" + id + "]";
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}





}

