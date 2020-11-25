package ar.edu.unlam.pb220202c.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Autopista {
	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los atributos o metodos que crean convenientes
	private HashMap <Integer,Vehiculo> telepase;
	private HashSet <Vehiculo> vehiculosEnCirculacion;
	String nombre;


	public Autopista(String nombre){
		this.nombre = nombre;
	}
	
	public Boolean registrarTelepase (Integer numeroTelpase, Vehiculo vehiculo) {
		telepase.put(numeroTelpase, vehiculo);
		return true;
	}
	public Boolean ingresarAutopista (Integer numeroTelepase) {
		//si el telepase no esta registrado lanza una Exceptios del tipo VehiculoNotFounException
	   // y no permite ingresar al autopista
		if(telepase.containsKey(numeroTelepase){
			vehiculosEnCirculacion.
		}
		else{
			throw new RuntimeException("El telepase no está registrado");
		}

		
		return null;
	}
	
	public void salirAutpista (Vehiculo vehiculo) {
		//lanza Una exception VehiculoNotFounException si no esta en circulacion
		if(vehiculosEnCirculacion.contains(vehiculo)){
			vehiculosEnCirculacion.remove(vehiculo);

		}
		else{
			throw new RuntimeException("El vehículo no existe");
		}
	}
	
	public TreeSet<Vehiculo> obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente(){
	
	return null;
    }

	public Integer cantidadDeVehiculosENCirculacion() {
	
		return 0;
	}

	public Boolean buscarTelepase(Integer numero){
		Integer telepaseEncontrado = null;
		Boolean encontrado = false;
		for (int i = 0; i < telepase.size() ; i++) {
			if (telepase.containsKey(numero)) {
				telepaseEncontrado = numero;
				encontrado = true;

			} else {
				encontrado = false;

			}
		}
		return encontrado;
	}

	public Vehiculo buscarVehiculo(Vehiculo vehiculo) {
		Vehiculo vehiculoEncontrado = null;
		for (int i = 0; i < vehiculosEnCirculacion.size(); i++) {
			if (vehiculosEnCirculacion.contains(vehiculo)) {
				vehiculoEncontrado = vehiculo;

			}
		}
		return vehiculoEncontrado;
	}


}
