
package clases;

import java.util.ArrayList;

/**
 *
 * @author Win8
 */
public class Gen {
    
    private final int porcentajeCara;
    private final Lanzar aleatorio=new Lanzar();
    private ArrayList<Boolean> cromosoma;
    
    
    
    public Gen(ArrayList<Boolean> cromosoma,int porcentajeCara){
        this.porcentajeCara=porcentajeCara;
        this.cromosoma=new ArrayList<>();
        this.cromosoma=cromosoma;
    }
    
    public void  realizarCreacion(int posicion){
        ingresarGen(posicion);
    }
    
    public boolean creacionGen(){
        return (aleatorio.lanzar()<porcentajeCara);
    }
    
    public void ingresarGen(int posicion){
        cromosoma.add(posicion,creacionGen());
    }
    
    
    
}
