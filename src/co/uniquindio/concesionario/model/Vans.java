package co.uniquindio.concesionario.model;

@SuppressWarnings("serial")
public class Vans extends VehiculoLiviano {
	/**
	 * Declaracion atributos
	 */

	private boolean cuatroXcuatro;


	/**
	 * constructor de la clase Vans con los demas atributos de su superclase VehiculoLiviano
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
	 * @param capMaletero
	 * @param hasAireAcondicionado
	 * @param hasCamaraReversa
	 * @param hasABS
	 * @param numBolsasAire
	 * @param velCrucero
	 * @param sensorColision
	 * @param sensorTraficoCruzado
	 * @param asisPermCarril
	 * @param cuatroXcuatro
	 * @param capCargaCaja
	 */

	public Vans(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String numPasajeros,
			String placa, String numPuertas, String capMaletero, boolean hasAireAcondicionado, boolean hasCamaraReversa,
			boolean hasABS, String numBolsasAire, boolean velCrucero, boolean sensorColision,
			boolean sensorTraficoCruzado, boolean asisPermCarril, boolean cuatroXcuatro) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, numPasajeros,
				placa, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire,
				velCrucero, sensorColision, sensorTraficoCruzado, asisPermCarril);
		this.cuatroXcuatro = cuatroXcuatro;

	}
	// constructor vacio

	public Vans(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String numPasajeros,
			String placa, String numPuertas, String capMaletero, boolean hasAireAcondicionado, boolean hasCamaraReversa,
			boolean hasABS, String numBolsasAire, boolean velCrucero, boolean sensorColision,
			boolean sensorTraficoCruzado, boolean asisPermCarril) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, numPasajeros,
				placa, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire,
				velCrucero, sensorColision, sensorTraficoCruzado, asisPermCarril);
	}

	/**
	 * Getters and setters  y metodo to String
	 * @return
	 */
//------------------------------------------------------------------------------
	public boolean isCuatroXcuatro() {
		return cuatroXcuatro;
	}
	public void setCuatroXcuatro(boolean cuatroXcuatro) {
		this.cuatroXcuatro = cuatroXcuatro;
	}

	@Override
	public String toString() {
		return "Vans [cuatroXcuatro=" + cuatroXcuatro +  "]";
	}

//---------------------------------------------------------------------------




}
