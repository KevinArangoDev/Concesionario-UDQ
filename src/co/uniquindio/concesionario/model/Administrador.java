package co.uniquindio.concesionario.model;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Administrador extends Persona implements Serializable {
	/**
	 * Declaracion de atributos
	 */

	private double sueldo;
	private ArrayList<Empleado> listaEmpleados;
	private String contrasenia;
	private static final String USUARIO_ADMIN = "admin";
    private static final String CONTRASENA_ADMIN = "123456";







	public Administrador(String nombre, String edad, String id, double sueldo, String contrasenia , String apellido) {
		super(nombre, edad, id , apellido);
		this.sueldo = sueldo;
		this.contrasenia = contrasenia;
	}

		public Administrador() {
		super();
	}

	/**
	 * Getters and setter y metodo toString
	 * @return
	 */
//-------------------------------------------------------------------------------
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	@Override
	public String toString() {
		return "Administrador [sueldo=" + sueldo + "]";
	}

	/**
	 * @return the contrasenia
	 */
	public String getContrasenia() {
		return contrasenia;
	}

	/**
	 * @param contrasenia the contrasenia to set
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}






	public static boolean verificarCredenciales(String usuario, String contrasena) {
		return usuario.equals(USUARIO_ADMIN) && contrasena.equals(CONTRASENA_ADMIN);

	}

//-----------------------------------------------------------------------------------------------
//										//CRUD EMPLEADO
//
//	/**
//	 * metodo para agregar un empleado a la lista de empleados  , validando si el empleado ya existe segun su id
//	 * @param cliente
//	 */
//
//	public void agregarEmpleado(Empleado empleado)  {
//		int bandera = 0;
//		for (int i = 0; i < listaEmpleados.size() && bandera == 0; i++) {
//			if (listaEmpleados.get(i).getId().equals(empleado.getId())) {
//				bandera = 1;
//			}
//		}
//		if (bandera == 0) {
//			listaEmpleados.add(empleado);
//		//	Persistencia.guardarEmpleado(listaEmpleados);
//			System.out.println("Se agrego un nuevo empleado .");
//		} else {
//			System.out.println("Este empleado con esa id  ya existe");
//		}
//
//	}
//
//	/**
//	 * metodo utilizado para actualizar un empleado , validando si este existe segun su id
//	 * @param nombre
//	 * @param edad
//	 * @param id
//	 * @param cargo
//	 * @param sueldo
//	 * @return
//	 */
//	public void actualizarEmpleado(Empleado empleadoActualizado) {
//
//        for (int i = 0; i < listaEmpleados.size(); i++) {
//            if ( listaEmpleados.get(i).getId().equals( empleadoActualizado.getId()) ) {
//            	listaEmpleados.set(i, empleadoActualizado);
//            }
//            else{
//		        // Si no se encontró el empleado con el id especificado
//		        System.out.println("No se encontró el empleado con esa id: " + empleadoActualizado.getId());
//
//	        }
//        }
//
//	}
//
//
//	/**
//	 * metodo utilizado para eliminar un empleado de la lista  de empleados   validando que el empleado existe
//	 * obteniendo su id
//	 * @param cliente
//	 */
//	public void eliminarEmpleado(Empleado empleado)  {
//
//		String idEmpleado = empleado.getId();
//
//		for (int i = 0; i < listaEmpleados.size(); i++) {
//			if (listaEmpleados.get(i).getId().equals(idEmpleado)) {
//				listaEmpleados.remove(i);
//
//				System.out.println("Se elimino el empleado.");
//				//Persistencia.guardarCliente(listaClientes);
//				break;
//			}else{
//				System.out.println("no existe un empleado con esa id");
//
//			}
//
//		}
//	}
//
//	/**
//	 * metodo para bloquear un empleado
//	 * @param empleado
//	 */
//	public void bloquearEmpleado(Empleado empleado){
//		String idEmpleado = empleado.getId();
//
//		for (int i = 0; i < listaEmpleados.size(); i++) {
//			if (listaEmpleados.get(i).getId().equals(idEmpleado)) {
//				 listaEmpleados.get(i).setEstadoEmpleado(EstadoEmpleado.BLOQUEADO);
//
//				System.out.println("Se bloqueo el empleado. " + getNombre());
//				break;
//			}else{
//				System.out.println("no existe un empleado con esa id");
//
//			}
//
//		}
//	}
//
//---------------------------------------------------------------------------------------------------


}

