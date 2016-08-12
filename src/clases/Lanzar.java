
package clases;

import java.util.Random;


public class Lanzar {
    Random aleatorio=new Random();
    
    public int lanzar(){
        return (aleatorio.nextInt(100));
    }
}
