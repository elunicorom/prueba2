
package principal;

import clases.Cromosoma;
import java.util.ArrayList;


public class Individuo {
    

    public final Cromosoma metodos;
    
    public Individuo(int porcentajeCara, int porcentajeMutacion,int longitudCromosoma){
        this.metodos=new Cromosoma(porcentajeCara, longitudCromosoma,porcentajeMutacion);
        
    }

    
    public void iniciarCreacion(String[] cromosomas,int i,String[] cromosomasMutados){
        metodos.crearCromosoma();
        cromosomas[i]=metodos.mostrarCromosoma();
        metodos.iniciarMutacion();
        cromosomasMutados[i]=metodos.mostrarCromosoma();
    }
    
    
}
