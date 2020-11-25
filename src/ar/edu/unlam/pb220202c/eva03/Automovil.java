package ar.edu.unlam.pb220202c.eva03;

public class Automovil extends Vehiculo implements Imultable {


    public Automovil(String patente, Integer velocidadActual, Integer limiteVelocidad) {
        super(patente, velocidadActual, limiteVelocidad);
        setLimiteVelocidad(130);
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

    //Si es necesario Utilice herencia o implemente de Interfaces
//	Se debe crear contructeres getters y Setters y loos que crean convenientes
	
//el Limite de velociadad para autos es de 130km
//en caso que supere dicho limite el este sera multado



	
	
   
	
}
