package co.uniquindio.concesionario.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import co.uniquindio.concesionario.exception.ConcesionarioException;
import co.uniquindio.concesionario.exception.EmpleadoException;

@SuppressWarnings("serial")
public class Concesionario implements Serializable {

	/**
	 * Atributos
	 */
	private String nombre;
	private String direccion;
	private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	private ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
	private ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
	private ArrayList<Administrador> listaAdministradores = new ArrayList<Administrador>();
	private ArrayList<Transaccion> listaTransacciones = new ArrayList<>();

	/**
	 * constructor de la clase concesionario
	 *
	 * @param nombre
	 * @param direccion
	 */
	public Concesionario(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaEmpleados.add( new Empleado("juan", "23", "123","vendedor", 200.0, "perez", "123", EstadoEmpleado.ACTIVO) );

	}

	// constructor vacio
	public Concesionario() {
		super();
	}

	// ------------------------------------------------------------------------------------------------------
	// Getters and Setters , toString , hash code , .equals

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public ArrayList<Vehiculo> getListaVehiculos() {
//		listaVehiculos.add( new Moto(TipoTransaccion.ALQUILER, TipoCombustible.DIESEL, TipoTransmision.AUTOMATICO, TipoNuevoUsado.NUEVO, "honda", "2023", "2", 12000.0, "2", "kps80f") );
		return listaVehiculos;

	}

	public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	public ArrayList<Transaccion> getListaTransacciones() {
		return listaTransacciones;
	}

	public void setListaTransacciones(ArrayList<Transaccion> listaTransacciones) {
		this.listaTransacciones = listaTransacciones;
	}

	@Override
	public String toString() {
		return "Concesionario [nombre=" + nombre + ", direccion=" + direccion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
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
		Concesionario other = (Concesionario) obj;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

//-------------------------------------------------------------------------------------------------------------------------------------------------
																						// CRUD VEHICULO
	/**
	 * metodo utilizado para agregar un vehiculo
	 *
	 * @param vehiculo
	 */
	public void agregarVehiculo(Vehiculo vehiculo) {
		int bandera = 0;
		for (int i = 0; i < listaVehiculos.size() && bandera == 0; i++) {
			if (listaVehiculos.get(i).getPlaca().equals(vehiculo.getPlaca())) {
				bandera = 1;
			}
		}
		if (bandera == 0) {
			listaVehiculos.add(vehiculo);
			// Persistencia.guardarVehiculo(listaVehiculos);
			System.out.println("Se agrego un nuevo vehiculo .");
		} else {
			System.out.println("Este vehiculo ya existe");
		}

	}

	/**
	 * metodo para actualizar un vehiculo
	 *
	 * @param vehiculoActualizado
	 */
	public void actualizarVehiculo(Empleado empleado ,Vehiculo vehiculoActualizado) {

		for (int i = 0; i < listaVehiculos.size(); i++) {
			if (listaVehiculos.get(i).getPlaca().equals(vehiculoActualizado.getPlaca())) {
				listaVehiculos.set(i, vehiculoActualizado);
			} else {
				// Si no se encontró el vehículo con el id especificado
				System.out.println("No se encontró el vehículo con esa placa: " + vehiculoActualizado.getPlaca());

			}
		}

	}

	/**
	 * metodo utilizado para eliminar un vehiculo
	 *
	 * @param vehiculo
	 */
	public void eliminarVehiculo(Vehiculo vehiculo) {

		String idVehiculo = vehiculo.getPlaca();

		for (int i = 0; i < listaVehiculos.size(); i++) {
			if (listaVehiculos.get(i).getPlaca().equals(idVehiculo)) {
				listaVehiculos.remove(i);

				System.out.println("Se elimino el vehiculo.");
				// Persistencia.guardarCliente(listaClientes);
				break;
			} else {
				System.out.println("no existe un vehiculo con esa id");

			}

		}
	}

//-------------------------------------------------------------------------------------------------------
																				// CRUD EMPLEADO

	/**
	 * metodo para agregar un empleado a la lista de empleados , validando si el
	 * empleado ya existe segun su id
	 *
	 * @param cliente
	 * @return
	 * @throws ConcesionarioException
	 */

	public void agregarEmpleado( Empleado empleado) throws ConcesionarioException {

		int bandera = 0;
		for (int i = 0; i < listaEmpleados.size() && bandera == 0; i++) {
			if (listaEmpleados.get(i).getId().equals(empleado.getId())) {
				bandera = 1;
			}
		}
		if (bandera == 0) {
			listaEmpleados.add(empleado);
			// Persistencia.guardarEmpleado(listaEmpleados);
			System.out.println("Se agrego un nuevo empleado .");
		} else {
			throw new ConcesionarioException("ya existe un empleado con esa identificacion");
		}


	}

	/**
	 * metodo utilizado para actualizar un empleado , validando si este existe
	 * segun su id
	 *
	 * @param nombre
	 * @param edad
	 * @param id
	 * @param cargo
	 * @param sueldo
	 * @return
	 * @throws ConcesionarioException
	 */
	public void actualizarEmpleado(Empleado empleadoActualizado) throws ConcesionarioException {

		for (int i = 0; i < listaEmpleados.size(); i++) {
			if (listaEmpleados.get(i).getId().equals(empleadoActualizado.getId())) {
				listaEmpleados.set(i, empleadoActualizado);
			}
//			else {
//				// Si no se encontró el empleado con el id especificado
//				throw new ConcesionarioException("no se encontro un empleado con esa id");
//
//			}
		}

	}

	/**
	 * metodo utilizado para eliminar un empleado de la lista de empleados
	 * validando que el empleado existe obteniendo su id
	 *
	 * @param cliente
	 * @throws ConcesionarioException
	 */

	public void eliminarEmpleado( Empleado empleadoSeleccionado) throws ConcesionarioException {

		String idEmpleado = empleadoSeleccionado.getId();

		for (int i = 0; i < listaEmpleados.size(); i++) {
			if (listaEmpleados.get(i).getId().equals(idEmpleado)) {
				listaEmpleados.remove(i);

				System.out.println("Se elimino el empleado.");
				// Persistencia.guardarCliente(listaClientes);
				break;
			}

		}
	}

	/**
	 * metodo para bloquear un empleado
	 *
	 * @param empleado
	 * @param estado
	 * @param bloqueado
	 * @throws ConcesionarioException
	 */

	public void bloquearEmpleado( Empleado empleado, EstadoEmpleado estado) throws ConcesionarioException {
		String idEmpleado = empleado.getId();

		for (int i = 0; i < listaEmpleados.size(); i++) {
			if (listaEmpleados.get(i).getId().equals(idEmpleado)) {
				listaEmpleados.get(i).setEstadoEmpleado(estado);

				System.out.println("Se bloqueo el empleado. " + getNombre());
				break;
			}
		}
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------


	public void agregarCliente(Cliente cliente) throws EmpleadoException, ConcesionarioException  {
//		if(empleado.estadoEmpleado==EstadoEmpleado.ACTIVO){
			int bandera = 0;
			for (int i = 0; i < listaClientes.size() && bandera == 0; i++) {
				if (listaClientes.get(i).getId().equals(cliente.getId())) {
					bandera = 1;
				}
			}
			if (bandera == 0) {
				listaClientes.add(cliente);
			//	Persistencia.guardarCliente(listaClientes);
				System.out.println("Se agrego un nuevo cliente .");
			} else {
				throw new ConcesionarioException("ya existe un cliente con esa id");

			}
		}





	/**
	 * metodo utilizado para actualizar la informacion del cliente que retorna un valor booleando true
	 * si el cliente fue actualizadao exitosamente o false si o fue actualizado
	 * y verificando si el empleado esta activo
	 * @param nombre
	 * @param edad
	 * @param id
	 * @param direccion
	 * @param telefono
	 * @param listaClientes
	 * @return
	 * @throws EmpleadoExceptions
	 */

	public boolean actualizarCliente(String nombre, String edad , String id , String direccion , String telefono , String apellido) throws EmpleadoException{
//		if(estadoEmpleado==EstadoEmpleado.ACTIVO){
			Cliente clienteAct = new Cliente(nombre, edad, id, direccion, telefono , apellido);
			if (id != null) {
				for (int i = 0; i < listaClientes.size(); i++) {
					if (listaClientes.get(i).getId().equals(id)) {
						listaClientes.set(i, clienteAct);

						// Guarda en el txt
						//Persistencia.guardarComprador(listaClientes);
						return true;
					}
				}
			}


		return false;
	}

	/**
	 * metodo utilizado para eliminar un cliente de la lista  de clientes   validando que el cliente existe
	 * obteniendo su id y verificando si el empleado esta activo
	 * @param cliente
	 * @throws ConcesionarioException
	 * @throws EmpleadoExceptions
	 */

	@SuppressWarnings("unused")
	public void eliminarCliente(Cliente cliente) throws EmpleadoException, ConcesionarioException  {
//		if(estadoEmpleado==EstadoEmpleado.ACTIVO){
			String idCliente = cliente.getId();

			for (int i = 0; i < listaClientes.size(); i++) {
				if (listaClientes.get(i).getId().equals(idCliente)) {
					listaClientes.remove(i);

					System.out.println("Se elimino el cliente.");
					//Persistencia.guardarCliente(listaClientes);
					break;
				}else 	throw new ConcesionarioException("no existe un cliente con esa id");


			}

		}



//-----------------------------------------------------------------------------------------------------------------------------------------------
	// login administrador


	public boolean iniciarSesionAdministrador(String usuario, String contrasena){
		if (Administrador.verificarCredenciales(usuario, contrasena)) {
            // Login exitoso
            System.out.println("Bienvenido, administrador!");
            return true;
        } else {
            // Credenciales incorrectas
            System.out.println("Credenciales incorrectas. Acceso denegado.");
            return false;
        }
	}
/**
 *
 * @param idUsuario
 * @return
 * @throws IOException
 */
	public Administrador CargarAdministrador(String idUsuario) throws IOException {

		ArrayList<Administrador> contenido = listaAdministradores;
		Administrador administrador = new Administrador();
		for (int i = 0; i < contenido.size(); i++) {
			if (listaAdministradores.get(i).getId().equals(idUsuario)) {
				administrador = listaAdministradores.get(i);
				return administrador;
			}
		}
		return null;
	}
	/*
	 * Metoodo que permite buscar un administrador en especifico y retornarlo.
	 */
	public Administrador leerAdministrador(String id) {
		if (id != null) {
			for (Administrador c : listaAdministradores) {
				if (c.getId().equals(id))
					return c;
			}
		}
		return null;
	}



	// login empleado
	public Empleado iniciarSesionEmpleado(String empleado, String contrasenia)
			throws FileNotFoundException, IOException, EmpleadoException {
		Empleado empleadoIs = validarEmpleado(empleado, contrasenia);
		if (empleadoIs != null) {
			return empleadoIs;
		} else {
			throw new EmpleadoException(" no existe el empleado " + empleado + "");
		}

	}

	/*
	 * Metodo que permite validar que los datos que ingreso el empleado en el
	 * login, si sean verdaderos
	 */
	private Empleado validarEmpleado(String empleado, String contrasenia) throws FileNotFoundException, IOException {
		ArrayList<Empleado> empleados = listaEmpleados;

		for (int indiceEmpleado = 0; indiceEmpleado < empleados.size(); indiceEmpleado++) {
			Empleado empleadoAux = empleados.get(indiceEmpleado);
			if (empleadoAux.getNombre().equalsIgnoreCase(empleado)
					&& empleadoAux.getId().equalsIgnoreCase(contrasenia)) {
				return empleadoAux;
			}
		}
		return null;
	}
	public Empleado cargarEmpleado(String idUsuario) throws IOException {

		ArrayList<Empleado> contenido = listaEmpleados;
		Empleado empleado = new Empleado();
		for (int i = 0; i < contenido.size(); i++) {
			if (listaEmpleados.get(i).getId().equals(idUsuario)) {
				empleado = listaEmpleados.get(i);
				return empleado;
			}
		}
		return null;
	}


	public void crearTransaccion(Transaccion transaccion){
		listaTransacciones.add(transaccion);

		if( transaccion.getVehiculo() != null){
			eliminarVehiculo(transaccion.getVehiculo());
		}


		System.out.println( listaTransacciones );
		System.out.println( listaVehiculos );

	}


}
