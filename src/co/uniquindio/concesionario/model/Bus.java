package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Bus extends VehiculoPesado  implements Serializable{

	/**
	 * Declaracion de atributos
	 */
	private String  numEjes;
	private String numsalidasEmergencia;


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
	public Bus(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String placa,
			String numPasajeros, boolean velCrucero, String numPuertas, String capMaletero,
			boolean hasAireAcondicionado, boolean hasCamaraReversa, boolean hasABS, String numBolsasAire) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, placa, numPasajeros,
				velCrucero, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire);
		// TODO Auto-generated constructor stub
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

