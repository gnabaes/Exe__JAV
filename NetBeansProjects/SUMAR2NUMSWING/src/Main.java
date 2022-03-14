

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
       String strNum1;
       String strNum2;
       int intNum1;
       int intNum2;
       strNum1 = JOptionPane.showInputDialog("ingrese el numero entero 1:  ");
       strNum2 = JOptionPane.showInputDialog("ingrese el numero entero 2:  ");
       
       // Pasar cadenas para enteros
       
       intNum1 = Integer.parseInt(strNum1);
       intNum2 = Integer.parseInt(strNum2);
       
       int suma = intNum1 + intNum2;
       
       JOptionPane.showMessageDialog(null,"la suma es: "+ suma,"Resultado",JOptionPane.PLAIN_MESSAGE);
    }
    
}
