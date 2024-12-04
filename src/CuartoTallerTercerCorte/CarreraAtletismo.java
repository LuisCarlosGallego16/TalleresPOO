/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuartoTallerTercerCorte;

/**
 *
 * @author luisc
 */
public class CarreraAtletismo {

    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Pepe");
        Atleta atleta2 = new Atleta("Juanito");
        Atleta atleta3 = new Atleta("Toribio");
        Atleta atleta4 = new Atleta("Luisito");
        Atleta atleta5 = new Atleta("Prado");

        atleta1.start();
        atleta2.start();
        atleta3.start();
        atleta4.start();
        atleta5.start();

        try {
            atleta1.join();
            atleta2.join();
            atleta3.join();
            atleta4.join();
            atleta5.join();
        } catch (InterruptedException e) {
            System.out.println("LA CARRERA FUE INTERRUMPIDA");
        }
        System.out.println("LA CARRERA TERMINO!");

    }
}
