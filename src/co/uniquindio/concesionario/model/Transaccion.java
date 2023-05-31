package co.uniquindio.concesionario.model;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class Transaccion implements Serializable{

	private Vehiculo vehiculo;
	private Cliente cliente;
	private Empleado empleado;
	private LocalDate fechaCompra;
	private String metodoCompra;

	public Transaccion(Vehiculo vehiculo, Cliente cliente, Empleado empleado, LocalDate fechaCompra,
			String metodoCompra) {
		super();
		this.vehiculo = vehiculo;
		this.cliente = cliente;
		this.empleado = empleado;
		this.fechaCompra = fechaCompra;
		this.metodoCompra = metodoCompra;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getMetodoCompra() {
		return metodoCompra;
	}

	public void setMetodoCompra(String metodoCompra) {
		this.metodoCompra = metodoCompra;
	}

	@Override
	public String toString() {
		return "Transaccion [vehiculo=" + vehiculo + ", cliente=" + cliente + ", empleado=" + empleado
				+ ", fechaCompra=" + fechaCompra + ", metodoCompra=" + metodoCompra + "]";
	}




}
