package co.uniquindio.concesionario.model;

public class Deportivo  extends  Vehiculo implements deCeroACien{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Declaracion de atributos
	 */
	private Double caballosFuerza;

	/**
	 * Constructor de la clase
	 * @param tipoCombustible
	 * @param tipoTrasmision
	 * @param tipoNuevoUsado
	 * @param marca
	 * @param modelo
	 * @param cambios
	 * @param velMax
	 * @param cilindraje
	 * @param placa
	 * @param numPuertas
	 * @param numBolsasAire
	 * @param caballosFuerza
	 */

	public Deportivo(TipoTransaccion tipoTransaccion, TipoCombustible tipoCombustible, TipoTransmision tipoTransmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String placa,
			String numPuertas, String numBolsasAire, Double caballosFuerza) {
		super(tipoTransaccion, tipoCombustible, tipoTransmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, placa);
		this.caballosFuerza = caballosFuerza;
	}

//--------------------------------------------------------------------------------------------------
	/**
	 * Getters and Setters
	 * @return
	 */



	public Double getCaballosFuerza() {
		return caballosFuerza;
	}


	public void setCaballosFuerza(Double caballosFuerza) {
		this.caballosFuerza = caballosFuerza;
	}

// metodo to String
	@Override
	public String toString() {
		return "Deportivo [caballosFuerza=" + caballosFuerza + "]";
	}




	/**
	 * implementacion de  la interface deCeroACien  la cula utilizaremos para determinar cuanto
	 * tiempo se demora el vehiculo en alcanzar los 100 km/h
	 */
	@Override
	public double calcularTiempoDe100KmPorHora() {
		// TODO Auto-generated method stub
		return 0;
	}





}
