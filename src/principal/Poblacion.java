
package principal;
import Excel.Exportar;
import java.util.ArrayList;


public class Poblacion {
   private ArrayList<Individuo> poblacion=new ArrayList<>();
   Individuo individuo;
   private final int numeroIndividuos;
   public String cromosomas[]=new String[10];
   public String cromosomasMutados[]= new String [10];
   public Exportar excel;
   
   public Poblacion(int numeroIndividuos){
       this.numeroIndividuos=numeroIndividuos;
       
   }
   
   public void crearPoblacion(){
       for(int i=0;i<numeroIndividuos;i++){
           individuo=new Individuo(50,10, 10);
           individuo.iniciarCreacion(cromosomas,i,cromosomasMutados);
           poblacion.add(individuo);
       }
       mostrar();
       exportar();
   }
   
   public void mostrar(){
       for(int i=0;i<10;i++){
           System.out.println("SIN MUTAR: "+cromosomas[i]);
           System.out.println("MUTADOS  : "+cromosomasMutados[i]);
       }
   }
   public void exportar(){
       excel= new Exportar(cromosomas, cromosomasMutados);
       System.out.println(excel.exportarExcel());
   }
   
}
