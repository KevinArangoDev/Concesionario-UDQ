package co.uniquindio.concesionario.model;

public class Deportivo  extends  Vehiculo implements deCeroACien{
	/**
	 * Declaracion de atributos
	 */
	private String numPuertas;
	private String numBolsasAire;
	private Double caballosFuerza;

/**
 * constructor vacio
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
	public Deportivo(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String numPasajeros,
			String placa) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, numPasajeros,
				placa);
	}

	/**
	 * constructor  que tiene los atributso de la superclse y de la clase Depopttivo
	 *
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
	 * @param numPuertas
	 * @param numBolsasAire
	 * @param caballosFuerza
	 */

	public Deportivo(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String numPasajeros,
			String placa, String numPuertas, String numBolsasAire, Double caballosFuerza) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, numPasajeros,
				placa);
		this.numPuertas = numPuertas;
		this.numBolsasAire = numBolsasAire;
		this.caballosFuerza = caballosFuerza;
	}

	/**
	 * Getters and Setters
	 * @return
	 */

	public String getNumPuertas() {
		return numPuertas;
	}


	public void setNumPuertas(String numPuertas) {
		this.numPuertas = numPuertas;
	}


	public String getNumBolsasAire() {
		return numBolsasAire;
	}


	public void setNumBolsasAire(String numBolsasAire) {
		this.numBolsasAire = numBolsasAire;
	}


	public Double getCaballosFuerza() {
		return caballosFuerza;
	}


	public void setCaballosFuerza(Double caballosFuerza) {
		this.caballosFuerza = caballosFuerza;
	}

// metodo to String

	@Override
	public String toString() {
		return "Deportivo [numPuertas=" + numPuertas + ", numBolsasAire=" + numBolsasAire + ", caballosFuerza="
				+ caballosFuerza + "]";
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
