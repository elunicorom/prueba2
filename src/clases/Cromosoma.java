
package clases;

import java.util.ArrayList;


public class Cromosoma {
    private int longitudCromosoma;
    private int porcentajeCara;
    private int porcentajeMutacion;
    private Lanzar aleatorio=new Lanzar();
    private ArrayList<Boolean> cromosoma= new ArrayList<>();
    private Gen gen;
    
    public Cromosoma(int porcentajeCara,int longitudCromosoma,int porcentajeMutacion){
        this.porcentajeCara=porcentajeCara;
        this.longitudCromosoma=longitudCromosoma;
        this.porcentajeMutacion=porcentajeMutacion;
        this.gen=new Gen(cromosoma,this.porcentajeCara);
    }
    
    public void crearCromosoma(){
        iniciarCreacion();
    }
    
    public void iniciarCreacion(){
        for(int i=0;i<(longitudCromosoma);i++){
            gen.realizarCreacion(i);
        }
    }
    
    public String mostrarCromosoma(){
        String cadena="",valor="";
        for (Boolean cromosoma1 : cromosoma) {
            valor=(cromosoma1)?"1":"0";
            cadena=cadena+valor;
        }
        return cadena;
    }
    
    public boolean decisionMutar(){
        return (aleatorio.lanzar()<this.porcentajeMutacion);
    }
    
    public boolean seleccionGen(){
       return(cromosoma.get(5));
    }
    
    public void aplicarMutacion(){
        cromosoma.set(5,!seleccionGen() );
    }
    
    public void iniciarMutacion(){
        if(decisionMutar()){
            aplicarMutacion();
        }
    }
}
