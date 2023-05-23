package co.uniquindio.concesionario.exception;


import java.io.Serializable;

@SuppressWarnings("serial")
public class AdministradorException  extends Exception implements Serializable{

	public AdministradorException(String mensaje) {
		super(mensaje);
	}

}
