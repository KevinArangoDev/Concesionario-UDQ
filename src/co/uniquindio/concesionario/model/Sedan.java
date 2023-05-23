package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Sedan extends  VehiculoLiviano implements Serializable {

	public Sedan(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String numPasajeros,
			String placa, String numPuertas, String capMaletero, boolean hasAireAcondicionado, boolean hasCamaraReversa,
			boolean hasABS, String numBolsasAire, boolean velCrucero, boolean sensorColision,
			boolean sensorTraficoCruzado, boolean asisPermCarril) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, numPasajeros, placa,
				numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire, velCrucero,
				sensorColision, sensorTraficoCruzado, asisPermCarril);
	}

}
