package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Bus extends Carro  implements Serializable{
	/**
	 * Declaracion de atributos
	 */
	private String  numEjes;
	private String numsalidasEmergencia;

	/**
	 * constructor de la clase  Bus , con los atributos de su superclase Carro
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
	 * @param numEjes
	 * @param numsalidasEmergencia
	 */
	public Bus(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String numPasajeros,
			String placa, String numPuertas, String capMaletero, boolean hasAireAcondicionado, boolean hasCamaraReversa,
			boolean hasABS, String numBolsasAire, String numEjes, String numsalidasEmergencia) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, numPasajeros,
				placa, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire);
		this.numEjes = numEjes;
		this.numsalidasEmergencia = numsalidasEmergencia;
	}

	// constructor vacio
	public Bus(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String numPasajeros,
			String placa, String numPuertas, String capMaletero, boolean hasAireAcondicionado, boolean hasCamaraReversa,
			boolean hasABS, String numBolsasAire) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, numPasajeros,
				placa, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire);
	}


/**
 * Getters and setters y  metodo toString
 * @return
 */

	//--------------------------------------------------------
	public String getNumEjes() {
		return numEjes;
	}
	public void setNumEjes(String numEjes) {
		this.numEjes = numEjes;
	}
	public String getNumsalidasEmergencia() {
		return numsalidasEmergencia;
	}
	public void setNumsalidasEmergencia(String numsalidasEmergencia) {
		this.numsalidasEmergencia = numsalidasEmergencia;
	}
	@Override
	public String toString() {
		return "Bus [numEjes=" + numEjes + ", numsalidasEmergencia=" + numsalidasEmergencia + "]";
	}
//-----------------------------------------------------------------------------

}

