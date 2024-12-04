

package CuartoTallerTercerCorte;

import java.util.Random;
/**
 *
 * @author luisc
 */
public class Atleta extends Thread {
    private String nombre;
    private int velocidad;
    private int meta = 1000;
    private int distanciaRecorrida = 0;
    
    public Atleta(String nombre){
        this.nombre = nombre;
        this.velocidad = new Random().nextInt(1000)+1;
    }
     @Override
public void run() {
        System.out.println(nombre + " comenzó la carrera con velocidad " + velocidad + " km/s");
        while (distanciaRecorrida < meta) {
            distanciaRecorrida += velocidad; 
            System.out.println(nombre + " lleva " + distanciaRecorrida + " km");
            try {
                Thread.sleep(1000); // Esperar 1 segundo entre cada incremento
            } catch (InterruptedException e) {
                System.out.println(nombre + " fue interrumpido.");
            }
        }
        System.out.println(nombre + " llegó a la meta!");
    }

    public String getNombre() {
        return nombre;
    }
}
    
