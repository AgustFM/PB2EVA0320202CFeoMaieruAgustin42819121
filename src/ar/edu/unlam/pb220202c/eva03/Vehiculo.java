package ar.edu.unlam.pb220202c.eva03;

public class Vehiculo {

	//Se debe crear contructeres getters y Setters y loos que crean convenientes
	private String patente;
	private Integer velocidadActual;
	private Integer limiteVelocidad;


	public Vehiculo(String patente, Integer velocidadActual, Integer limiteVelocidad){
		super();
		this.patente = patente;
		this.velocidadActual = velocidadActual;
		this.limiteVelocidad = limiteVelocidad;
	}



	public void incrmentarVelocidad(Integer Velocidad) {
		this.velocidadActual = Velocidad;
	}


	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getVelocidadActual() {
		return velocidadActual;
	}


	public Integer getLimiteVelocidad() {
		return limiteVelocidad;
	}

	public void setLimiteVelocidad(Integer limiteVelocidad) {
		this.limiteVelocidad = limiteVelocidad;
	}
}
