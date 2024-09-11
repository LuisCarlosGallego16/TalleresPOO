package DiseñoCalculadoraTaller2;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DiseñoCalculadora {
    public static void main(String[] args) {
    //SE CREA LA VENTANA PRINCIPAL CON LAS DIMENSIONES NECESARIAS
    JFrame ventana = new JFrame("CALCULADORA");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(800,600);
    ventana.setLayout(null);
        
    //CREAMOS LA PRIMERA ETIQUETA CON DIMENSIONES CENTRADAS QUE INCORPORAMOS DENTRO DE LA VENTANA PRINCIPAL ASEGURANDONOS DE MOSTRARLA. 
    JLabel etiqueta = new JLabel("CALCULADORA UAM");
    etiqueta.setBounds(620, 10, 150, 60);  
    ventana.add(etiqueta); 
    
    JLabel numero1 = new JLabel();
    numero1.setText("NUMERO 1: ");
    numero1.setBounds(500, 50, 150, 30);
    ventana.add(numero1);
    
    JLabel numero2 = new JLabel();
    numero2.setText("NUMERO 2: ");
    numero2.setBounds(780, 50, 150, 30);
    ventana.add(numero2);

    //CAMPO PARA VER EL NUMERO 1 
    JTextField campo2= new JTextField();  
    campo2.setBounds(500, 80, 90, 20);
    ventana.add(campo2);
    
    //CAMPO PARA VER EL NUMERO 2
    JTextField campo1 = new JTextField();  
    campo1.setBounds(780, 80, 90, 20);
    ventana.add(campo1);

    //COMBOBOX PARA EL LISTADO DE OPERACIONES DE LA CALCULADORA
    String[] opciones = new String [4];
    opciones[0] ="SUMAR";
    opciones[1] ="RESTAR";
    opciones[2] ="MULTIPLICAR";
    opciones[3] = "DIVIDIR";
    JComboBox comboOperaciones = new JComboBox(opciones);
    comboOperaciones.setBounds(610, 110, 150, 30);
    ventana.add(comboOperaciones);
    
    //BOTONES DE LOS DIFERENTES NUMEROS 
    JButton botonNumero1 = new JButton("1");
    botonNumero1.setBounds(500, 190, 70, 50);
    ventana.add(botonNumero1);
    
    JButton botonNumero4 = new JButton("4");
    botonNumero4.setBounds(500, 260, 70, 50);
    ventana.add(botonNumero4);
    
    JButton botonNumero7 = new JButton("7");
    botonNumero7.setBounds(500, 330, 70, 50);
    ventana.add(botonNumero7);
 
    JButton botonNumero2 = new JButton("2");
    botonNumero2.setBounds(650, 190,70, 50);
    ventana.add(botonNumero2);
 
    JButton botonNumero5 = new JButton("5");
    botonNumero5.setBounds(650, 260, 70, 50);
    ventana.add(botonNumero5);  
    
    JButton botonNumero8 = new JButton("8");
    botonNumero8.setBounds(650, 330, 70, 50);
    ventana.add(botonNumero8);  
    
    JButton botonNumero0 = new JButton("0");
    botonNumero0.setBounds(650, 410, 70, 50);
    ventana.add(botonNumero0);  
    
    JButton botonNumero3 = new JButton("3");
    botonNumero3.setBounds(780, 190, 70, 50);
    ventana.add(botonNumero3);
    
    JButton botonNumero6 = new JButton("6");
    botonNumero6.setBounds(780, 260, 70, 50);
    ventana.add(botonNumero6); 
 
    JButton botonNumero9 = new JButton("9");
    botonNumero9.setBounds(780, 330, 70, 50);
    ventana.add(botonNumero9); 
  
    //BOTON PARA REALIZAR LA OPERACIONES.
    JButton botonCalcular = new JButton("CALCULAR");
    botonCalcular.setBounds(620, 500, 150, 30);
    ventana.add(botonCalcular);
    //MOSTRAR SIEMPRE NUESTRA VENTANA AL MOMENTO DE EJECUTAR EL CODIGO. 
    ventana.setVisible(true);
    }
}
