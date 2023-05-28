package co.uniquindio.concesionario.model;

public abstract class VehiculoPesado extends Carro {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributos
	 */
	private String capMaletero;
	private String salidasEmergencia;
	private String capCajaCarga;
	private double velCrucero;


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
	 * @param numPasajeros
	 * @param velCrucero
	 * @param numPuertas
	 * @param capMaletero
	 * @param hasAireAcondicionado
	 * @param hasCamaraReversa
	 * @param hasABS
	 * @param numBolsasAire
	 */
	public VehiculoPesado(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String placa,
			String numPasajeros, boolean velCrucero, String numPuertas, String capMaletero,
			boolean hasAireAcondicionado, boolean hasCamaraReversa, boolean hasABS, String numBolsasAire) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, placa, numPasajeros,
				velCrucero, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire);
		// TODO Auto-generated constructor stub
	}





//-----------------------------------------------------------------------------------------------------

	/**
	 * Getters y setters, hascode, equals
	 */

	public String getCapMaletero() {
		return capMaletero;
	}

	public void setCapMaletero(String capMaletero) {
		this.capMaletero = capMaletero;
	}

	public String getSalidasEmergencia() {
		return salidasEmergencia;
	}

	public void setSalidasEmergencia(String salidasEmergencia) {
		this.salidasEmergencia = salidasEmergencia;
	}

	public String getCapCajaCarga() {
		return capCajaCarga;
	}

	public void setCapCajaCarga(String capCajaCarga) {
		this.capCajaCarga = capCajaCarga;
	}

	public double getVelCrucero() {
		return velCrucero;
	}

	public void setVelCrucero(double velCrucero) {
		this.velCrucero = velCrucero;
	}

	@Override
	public String toString() {
		return "VehiculoPesado [capMaletero=" + capMaletero + ", salidasEmergencia=" + salidasEmergencia
				+ ", capCajaCarga=" + capCajaCarga + ", velCrucero=" + velCrucero + "]";
	}





}
