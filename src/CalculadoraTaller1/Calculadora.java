
package CalculadoraTaller1;

import Calculadora.OperacionesCalculadora;
import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        
    int opcion; //Variable para almacenar la opcion ingresada por el usuario
    OperacionesCalculadora operaciones = new OperacionesCalculadora(); //Creamos un objeto de la clase OperacionesCalculadora 
    JOptionPane.showMessageDialog(null, "¡BIENVENIDO A MI CALCULADORA :)!");
    
    do{
    String menu ="INGRESE UNA OPCION:  \n"+"1.SUMA \n"+"2.RESTA \n"+"3.MULTIPLICACION \n"+"4. DIVISION \n"+"5.SALIR";
    String solicitud = JOptionPane.showInputDialog(menu); //Mostramos en cuadro de dialogo el menu
    opcion = Integer.parseInt(solicitud); //Convertimos a un entero la opcion ingresada por el usuario 

     
       switch (opcion) {
        case 1: //Suma
        double numero1Sumar = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL PRIMER NUMERO")); //Convertimos el 1 numero a double, ya que ingresa como String.
        double numero2Sumar = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL SEGUNDO NUMERO")); //Convertimos el 2 numero a double, ya que ingresa como String.
        double suma = operaciones.sumar(numero1Sumar,numero2Sumar); //Llamos al metodo sumar y pasamos como parametro los numeros 
        JOptionPane.showMessageDialog(null, "LA SUMA ENTRE "+numero1Sumar+ " Y "+numero2Sumar+" ES: "+suma); //Mostramos en cuadro de dialogo el resultado de la operacion.
            break;
        case 2: //Resta
        double numero1Restar = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL PRIMER NUMERO"));
        double numero2Restar = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL SEGUNDO NUMERO"));
        double resta = operaciones.restar(numero1Restar,numero2Restar);
        JOptionPane.showMessageDialog(null, "LA RESTA ENTRE: "+numero1Restar+ " Y "+numero2Restar+" ES: "+resta);
        
            break;
            
        case 3:
        double numero1Multiplicar = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL PRIMER NUMERO"));
        double numero2Multiplicar = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL SEGUNDO NUMERO"));
        double multiplicacion = operaciones.multiplicar(numero1Multiplicar,numero2Multiplicar);
        JOptionPane.showMessageDialog(null, "LA MULTIPLICACION ENTRE: "+numero1Multiplicar+ " Y "+numero2Multiplicar+" ES: "+multiplicacion);
            break;
 
        case 4:
        double numero1Dividir = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL PRIMER NUMERO"));
        double numero2Dividir = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL SEGUNDO NUMERO"));
        if(numero2Dividir !=0){
        double division = operaciones.multiplicar(numero1Dividir,numero2Dividir);
        JOptionPane.showMessageDialog(null, "LA DIVISION ENTRE: "+numero1Dividir+ " Y "+numero2Dividir+" es: "+division);
        }else{
            JOptionPane.showMessageDialog(null, "NO SE PUEDE REALIZAR DIVISON POR 0");
       }
        break;
        
        case 5: //Opcion que nos permite salir de la calculadora
            JOptionPane.showMessageDialog(null,"HAS SALIDO DE MI CALCULADORA");
            break;
         
        default: //Mensaje para advertir sobre opcion invalida de nuestro menu 
            JOptionPane.showMessageDialog(null, "¡OPCION INVALIDA!, INGRESE UNA OPCION VALIDA");
         }
       if(opcion !=5){ //Si el usuario selecciono una opcion diferente a 5, se ejecutara esta parte, 
           // Creamos un cuadro de dialogo que contiene un si  y no, para saber si el usuario quiere continuar o no haciendo mas operaciones
           int continuar = JOptionPane.showConfirmDialog(null, "DESEA CONTINUAR?","CONFIRMACION",JOptionPane.YES_NO_OPTION);
           if(continuar == JOptionPane.NO_OPTION){ //Si selecciona un NO, hacemos un print 
               System.out.println("EL USUARIO NO QUISO CONTINUAR CON OTRA OPERACION");
               opcion = 5; //Cuando seleeciona un NO, asiganmos el valor de salir a opcion para salir correctamente de la calculadora. 
           }
       }
     }while(opcion !=5); // El ciclo seguira ejecutandose, mientras se seleccione una opcion diferente a 5 y mientras el usuario no seleccione la opcion de no continuar en la calculadora en el condicional anterior
    }
}
