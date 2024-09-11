
package DiseñoCalculadoraTaller2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DiseñoCalculadora {
    public static void main(String[] args) {
    //SE CREA LA VENTANA PRINCIPAL CON LAS DIMENSIONES NECESARIAS
    JFrame ventana = new JFrame("CALCULADORA");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(800,600);
    ventana.setLayout(null);
        
    //CREAMOS LA PRIMERA ETIQUETA CON DIMENSIONES CENTRADAS QUE INCORPORAMOS DENTRO DE LA VENTANA PRINCIPAL ASEGURANDONOS DE MOSTRARLA. 
    JLabel etiqueta = new JLabel("MI CALCULADORA ");
    etiqueta.setBounds(670, 10, 150, 30); //posicion centrado. 
    ventana.add(etiqueta); //Para añadir lo que se pone de texto en la ventana
    
     /* String informacioJLabel = etiqueta.getText(); //Obtener la informacion del JLabel */
    JLabel etiqueta2 = new JLabel();
    etiqueta2.setText("INGRESE EL NOMBRE: ");
    etiqueta2.setBounds(600, 100, 150, 30);
    ventana.add(etiqueta2);
   
    
    //revisar bien las dimensiones, buscar como se puede mirar de mejoror manera.
    
    
    
    ventana.setVisible(true);
    }
}
