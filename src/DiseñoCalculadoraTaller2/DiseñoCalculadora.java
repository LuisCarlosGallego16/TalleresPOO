package DiseñoCalculadoraTaller2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DiseñoCalculadora {
    public static void main(String[] args) {
    OperacionesCalculadora OperacionesCalculadora = new OperacionesCalculadora ();
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
    JTextField campo1= new JTextField();  
    campo1.setBounds(500, 80, 90, 20);
    ventana.add(campo1);
    
    //CAMPO PARA VER EL NUMERO 2
    JTextField campo2 = new JTextField();  
    campo2.setBounds(780, 80, 90, 20);
    ventana.add(campo2);

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
    
    //AÑADIR ELECCION DE TODOS LOS NUMEROS AL CAMPO 
    botonNumero1.addMouseListener(new MouseAdapter(){
    public void mouseClicked(MouseEvent e){
    String numero1 = "1";
    String primerNumero = campo1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
    String segundoNumero = campo2.getText();
    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo1.setText(numero1);
    }
    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo2.setText(numero1);
    }
    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
    }       
    }       
 });
 
    botonNumero2.addMouseListener(new MouseAdapter(){
    public void mouseClicked(MouseEvent e){
    String numero1 = "2";
    String primerNumero = campo1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
    String segundoNumero = campo2.getText();
    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo1.setText(numero1);
    }
    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo2.setText(numero1);
    }
    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
    }       
    }       
 });    
    
    botonNumero3.addMouseListener(new MouseAdapter(){
    public void mouseClicked(MouseEvent e){
    String numero1 = "3";
    String primerNumero = campo1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
    String segundoNumero = campo2.getText();
    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo1.setText(numero1);
    }
    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo2.setText(numero1);
    }
    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
     }       
    }       
 });     
    
    botonNumero4.addMouseListener(new MouseAdapter(){
    public void mouseClicked(MouseEvent e){
    String numero1 = "4";
    String primerNumero = campo1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
    String segundoNumero = campo2.getText();
    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo1.setText(numero1);
    }
    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo2.setText(numero1);
    }
    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
     }       
    }       
 });  
    
    botonNumero5.addMouseListener(new MouseAdapter(){
    public void mouseClicked(MouseEvent e){
    String numero1 = "5";
    String primerNumero = campo1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
    String segundoNumero = campo2.getText();
    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo1.setText(numero1);
    }
    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo2.setText(numero1);
    }
    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
     }       
    }       
 });  

    botonNumero6.addMouseListener(new MouseAdapter(){
    public void mouseClicked(MouseEvent e){
    String numero1 = "6";
    String primerNumero = campo1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
    String segundoNumero = campo2.getText();
    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo1.setText(numero1);
    }
    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo2.setText(numero1);
    }
    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
     }       
    }       
 });     
   
    botonNumero7.addMouseListener(new MouseAdapter(){
    public void mouseClicked(MouseEvent e){
    String numero1 = "7";
    String primerNumero = campo1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
    String segundoNumero = campo2.getText();
    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo1.setText(numero1);
    }
    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo2.setText(numero1);
    }
    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
     }       
    }       
 });  
    
    botonNumero8.addMouseListener(new MouseAdapter(){
    public void mouseClicked(MouseEvent e){
    String numero1 = "8";
    String primerNumero = campo1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
    String segundoNumero = campo2.getText();
    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo1.setText(numero1);
    }
    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo2.setText(numero1);
    }
    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
     }       
    }       
 });    
    
    botonNumero9.addMouseListener(new MouseAdapter(){
    public void mouseClicked(MouseEvent e){
    String numero1 = "9";
    String primerNumero = campo1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
    String segundoNumero = campo2.getText();
    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo1.setText(numero1);
    }
    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo2.setText(numero1);
    }
    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
     }       
    }       
 });    
    
    botonNumero0.addMouseListener(new MouseAdapter(){
    public void mouseClicked(MouseEvent e){
    String numero1 = "0";
    String primerNumero = campo1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
    String segundoNumero = campo2.getText();
    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo1.setText(numero1);
    }
    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
        campo2.setText(numero1);
    }
    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
     }       
    }       
 });
    //ACA HACEMOS QUE EL BOTON CALCULAR COMPLETE UNA ACCION, EN ESTE CASO QUE SEGUN LA OPCION DEL USUARIO SE REALICE LA OPERACION DESEADA. 
    botonCalcular.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    String seleccion = (String) comboOperaciones.getSelectedItem();       
    
    switch(seleccion){
    case "SUMAR":
        double resultadoSuma = OperacionesCalculadora.sumar(Double.parseDouble(campo1.getText()), Double.parseDouble(campo2.getText()));
        JOptionPane.showMessageDialog(null,"EL RESULTADO ES: "+ resultadoSuma,"INFO", JOptionPane.INFORMATION_MESSAGE);
    break;
    
    case "RESTAR":
        double resultadoResta = OperacionesCalculadora.restar(Double.parseDouble(campo1.getText()), Double.parseDouble(campo2.getText()));
        JOptionPane.showMessageDialog(null,"EL RESULTADO ES: "+ resultadoResta,"INFO", JOptionPane.INFORMATION_MESSAGE);
    break;
    
    case "MULTIPLICAR":
        double resultadoMultiplicacion = OperacionesCalculadora.multiplicar(Double.parseDouble(campo1.getText()), Double.parseDouble(campo2.getText()));
        JOptionPane.showMessageDialog(null,"EL RESULTADO ES: "+ resultadoMultiplicacion,"INFO", JOptionPane.INFORMATION_MESSAGE);    
    break;
    
    case "DIVIDIR":
       double numeroDividir1=Double.parseDouble(campo1.getText());
       double numeroDividir2=Double.parseDouble(campo2.getText()); 
       //HACEMOS UNA VALIDACION CUANDO EL SEGUNDO NUMERO ES 0.
       if(numeroDividir2!=0){
       double resultadoDivision = OperacionesCalculadora.dividir(numeroDividir1,numeroDividir2);
       JOptionPane.showMessageDialog(null,"EL RESULTADO ES: "+ resultadoDivision,"INFO", JOptionPane.INFORMATION_MESSAGE);    
         }else{
            JOptionPane.showMessageDialog(null, "NO SE PUEDE REALIZAR DIVISON POR 0");
       }
    break;
    }
    //LIMPIAMOS LOS CUADROS DESPUES DE HABER REALIZADO ALGUNA DE LAS OPERACIONES.
    campo1.setText("");
    campo2.setText(""); 
  }
});
    JButton botonSalir = new JButton("SALIR");
    botonSalir.setBounds(620, 550, 150, 30);
    ventana.add(botonSalir);
    
    //ACA CREAMOS UN BOTON SALIR EN DONDE CON EL METODO IMPLEMENTACION LA OPCION DE SALIR Y CERRAR LA VENTANA. 
    botonSalir.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        int confirmacion = JOptionPane.showConfirmDialog(null,"¿ESTAS SEGURO QUE QUIERES SALIR?","CONFIRMACION", JOptionPane.YES_NO_OPTION);
            if(confirmacion == JOptionPane.YES_OPTION){
            ventana.dispose();
            JOptionPane.showMessageDialog(null, "HAZ SALIDO DE LA CALCULADORA EXITOSAMENTE");  
        }else{
        JOptionPane.showMessageDialog(null, "HAZ SALIDO DE LA CALCULADORA EXITOSAMENTE");
        }    
    } 
 });
    //MOSTRAR SIEMPRE NUESTRA VENTANA AL MOMENTO DE EJECUTAR EL CODIGO. 
    ventana.setVisible(true);
    }
}
