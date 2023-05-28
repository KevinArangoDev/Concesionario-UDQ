package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Camioneta extends VehiculoLiviano implements Serializable{


	private boolean cuatroXcuatro;

	public Camioneta(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String placa,
			String numPasajeros, boolean velCrucero, String numPuertas, String capMaletero,
			boolean hasAireAcondicionado, boolean hasCamaraReversa, boolean hasABS, String numBolsasAire,
			boolean sensorColision, boolean sensorTraficoCruzado, boolean asisPermCarril) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, placa, numPasajeros,
				velCrucero, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire,
				sensorColision, sensorTraficoCruzado, asisPermCarril);
		// TODO Auto-generated constructor stub
	}

	public boolean isCuatroXcuatro() {
		return cuatroXcuatro;
	}

	public void setCuatroXcuatro(boolean cuatroXcuatro) {
		this.cuatroXcuatro = cuatroXcuatro;
	}

	@Override
	public String toString() {
		return "Camioneta [cuatroXcuatro=" + cuatroXcuatro + "]";
	}




}
