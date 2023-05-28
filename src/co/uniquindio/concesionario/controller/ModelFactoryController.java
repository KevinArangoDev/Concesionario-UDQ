package co.uniquindio.concesionario.controller;

import java.io.IOException;
import java.util.ArrayList;

import co.uniquindio.concesionario.model.Administrador;
import co.uniquindio.concesionario.model.Concesionario;
import co.uniquindio.concesionario.model.Empleado;
import co.uniquindio.concesionario.model.Vehiculo;


public class ModelFactoryController {
	//Atributos
	Concesionario concesionario;
	Empleado empleado;
	boolean administrador;
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aqui al ser
		// protected
		private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
	}
	// Metodo para obtener la instancia de nuestra clase
		public static ModelFactoryController getInstance() {
			return SingletonHolder.eINSTANCE;
		}

		public ModelFactoryController() {
			System.out.println("invocación clase singleton");
			inicializarDatos();

		}

		private void inicializarDatos() {
			concesionario = new Concesionario("concesionarioUq " , "cll3-25");

		}

		/**
		 * Getters and Setters
		 * @return
		 */

		public Concesionario getConcesionario() {
			return concesionario;
		}

		public void setConcesionario(Concesionario concesionario) {
			this.concesionario = concesionario;
		}

		public Empleado getEmpleado() {
			return empleado;
		}

		public void setEmpleado(Empleado empleado) {
			this.empleado = empleado;
		}

		public boolean getAdministrador() {
			return administrador;
		}

		public void setAdministrador(boolean administrador) {
			this.administrador = administrador;
		}

		public void registrarEmpleado(Administrador administrador , Empleado empleado) throws IOException {

//			return concesionario.agregarEmpleado(administrador, empleado);

		}
		/*
		 * Metodo que permite iniciar la sesion del comprador
		 */
		public boolean inicioSesionAdmin(String id, String contrasenia) {
			this.administrador = concesionario.iniciarSesionAdministrador(id, contrasenia);
			if(concesionario.iniciarSesionAdministrador(id, contrasenia)== true){
				return true;
			}

			return false;

		}
		public Empleado agregarEmpleado(Empleado empleado) throws IOException {
			concesionario.agregarEmpleado(empleado);
			return empleado;
		}


//hj


}

