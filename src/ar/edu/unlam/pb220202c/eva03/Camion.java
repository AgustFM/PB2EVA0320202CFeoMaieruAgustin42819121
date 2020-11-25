package ar.edu.unlam.pb220202c.eva03;

public class Camion extends Vehiculo implements Imultable {
	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los que crean conveniente
	private Integer cantidadDeEjes;

	public Camion(String patente, Integer velocidadActual, Integer limiteVelocidad, Integer cantidadDeEjes) {
		super(patente, velocidadActual, limiteVelocidad);
		this.cantidadDeEjes = cantidadDeEjes;
		setLimiteVelocidad(80);
	}

	@Override
	public Boolean enInfraccion() {
		Boolean infraccion;
		if(getVelocidadActual() > getLimiteVelocidad()){
			infraccion = true;
		}
		else {
			infraccion = false;
		}
		return infraccion;
	}
	//el Limite de velociadad para autos es de 80km
	//en caso que supere dicho limite el este sera multado

	
}
