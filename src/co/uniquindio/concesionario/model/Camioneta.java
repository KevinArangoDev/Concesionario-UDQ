package co.uniquindio.concesionario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Camioneta extends VehiculoLiviano implements Serializable{
	private boolean cuatroXcuatro;

	public Camioneta(TipoCombustible tipoCombustible, TipoTrasmision tipoTrasmision, TipoNuevoUsado tipoNuevoUsado,
			String marca, String modelo, String cambios, Double velMax, String cilindraje, String numPasajeros,
			String placa, String numPuertas, String capMaletero, boolean hasAireAcondicionado, boolean hasCamaraReversa,
			boolean hasABS, String numBolsasAire, boolean velCrucero, boolean sensorColision,
			boolean sensorTraficoCruzado, boolean asisPermCarril, boolean cuatroXcuatro) {
		super(tipoCombustible, tipoTrasmision, tipoNuevoUsado, marca, modelo, cambios, velMax, cilindraje, numPasajeros,
				placa, numPuertas, capMaletero, hasAireAcondicionado, hasCamaraReversa, hasABS, numBolsasAire,
				velCrucero, sensorColision, sensorTraficoCruzado, asisPermCarril);
		this.cuatroXcuatro = cuatroXcuatro;
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
