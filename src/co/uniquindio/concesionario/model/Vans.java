package co.uniquindio.concesionario.model;

@SuppressWarnings("serial")
public class Vans extends VehiculoLiviano {

	/**
	 *
	 * @param tipoCombustible
	 * @param tipoTrasmision
	 * @param tipoNuevoUsado
	 * @param marca
	 * @param modelo
	 * @param cambios
	 * @param velMax
	 * @param cilindraje
	 * @param placa
	 * @param numPasajeros
	 * @param velCrucero
	 * @param i
	 * @param d
	 * @param hasAireAcondicionado
	 * @param hasCamaraReversa
	 * @param hasABS
	 * @param j
	 * @param sensorTraficoCruzado
	 * @param asisPermCarril
	 */


	@Override
	public String toString() {
		return "Vans [sensorColision=" + sensorColision + ", sensorTraficoCruzado=" + sensorTraficoCruzado
				+ ", asisPermCarril=" + asisPermCarril + ", numPuertas=" + numPuertas + ", capMaletero=" + capMaletero
				+ ", hasAireAcondicionado=" + hasAireAcondicionado + ", hasCamaraReversa=" + hasCamaraReversa
				+ ", hasABS=" + hasABS + ", numBolsasAire=" + numBolsasAire
				+ ", tipoCombustible=" + tipoCombustible + ", tipoTransmision=" + tipoTransmision + ", tipoNuevoUsado="
				+ tipoNuevoUsado + ", marca=" + marca + ", modelo=" + modelo + ", cambios=" + cambios + ", velMax="
				+ velMax + ", cilindraje=" + cilindraje + ", placa=" + placa + "]";
	}



	public Vans(TipoTransaccion tipoTransaccion, TipoCombustible tipoCombustible, TipoTransmision tipoTransmision,
			TipoNuevoUsado tipoNuevoUsado, String marca, String modelo, String cambios, Double velMax,
			String cilindraje, String placa, String numPasajeros, double velCrucero, String numPuertas,
			String capMaletero, boolean hasAireAcondicionado, boolean hasCamaraReversa, boolean hasABS,
			String numBolsasAire) {
		super(tipoTransaccion, tipoCombustible, tipoTransmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje,
				placa, numPasajeros, velCrucero, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS,
				numBolsasAire);
		// TODO Auto-generated constructor stub
	}







}
