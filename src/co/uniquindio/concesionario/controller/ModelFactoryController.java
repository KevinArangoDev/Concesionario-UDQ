package co.uniquindio.concesionario.controller;

import java.io.IOException;
import java.util.ArrayList;

import co.uniquindio.concesionario.model.Administrador;
import co.uniquindio.concesionario.model.Camioneta;
import co.uniquindio.concesionario.model.Concesionario;
import co.uniquindio.concesionario.model.Empleado;
import co.uniquindio.concesionario.model.Moto;
import co.uniquindio.concesionario.model.PickUp;
import co.uniquindio.concesionario.model.Sedan;
import co.uniquindio.concesionario.model.TipoCombustible;
import co.uniquindio.concesionario.model.TipoNuevoUsado;
import co.uniquindio.concesionario.model.TipoTransaccion;
import co.uniquindio.concesionario.model.TipoTransmision;
import co.uniquindio.concesionario.model.Vans;
import co.uniquindio.concesionario.model.Vehiculo;
import co.uniquindio.concesionario.model.VehiculoLiviano;


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
			System.out.println("invocaci�n clase singleton");
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

		public static Vehiculo crearVehiculoLiviano(String marca, String modelo, String cambios, double velMaxima, String cilindraje,
		        String placa, TipoTransaccion tipoTransaccion, TipoCombustible tipoCombustible,
		        TipoTransmision tipoTransmision, TipoNuevoUsado tipoNuevoUsado, String numPasajeros, double velCrucero,
		        String numPuertas, String capMaletero, boolean hasAireAcondicionado, boolean hasCamaraReversa,
		        boolean hasABS, String numBolsasAire, boolean sensorColision, boolean sensorTraficoCruzado,
		        boolean asisPermCarril) {

		    if (modelo.equals("Vans")) {
		        return new Vans(tipoTransaccion, tipoCombustible, tipoTransmision, tipoNuevoUsado, marca, modelo, cambios, velMaxima, cilindraje, placa, numPasajeros, velCrucero, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, numBolsasAire, hasABS, sensorColision, sensorTraficoCruzado, asisPermCarril);
		    } else if (modelo.equals("Camioneta")) {
		        return new Camioneta(tipoTransaccion, tipoCombustible, tipoTransmision, tipoNuevoUsado, marca, modelo, cambios, velMaxima, cilindraje, placa, numPasajeros, velCrucero, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, numBolsasAire, hasABS, sensorColision, sensorTraficoCruzado, asisPermCarril);
		    } else if (modelo.equals("PickUp")) {
		        return new PickUp(tipoTransaccion, tipoCombustible, tipoTransmision, tipoNuevoUsado, marca, modelo, cambios, velMaxima, cilindraje, placa, numPasajeros, velCrucero, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, numBolsasAire, hasABS, sensorColision, sensorTraficoCruzado, asisPermCarril);
		    } else if (modelo.equals("Sedan")) {
		        return new Sedan();
		    }

		    // Si el modelo no coincide con ninguno de los anteriores, se lanza una excepci�n
		    throw new IllegalArgumentException("Modelo de veh�culo no v�lido: " + modelo);
		}






}

