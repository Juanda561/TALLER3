/*
6. Desarrolle un aplicativo en Java que dada un cantidad en binario (0 y 1) lo 
transforme a decimal, y viceversa
 */
package Ej6;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ej6 {
    
    public static void main(String[] args) {
        
        JTextArea salida = new JTextArea();
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que quiere convertir a binario"));
 
        long binario = decimalABinario(numero);
        salida.append(numero + " en binario es: " + binario+"\n");
 
        int decimal = binarioADecimal(binario);
        salida.append(binario + " en decimal es: " + decimal);
        
        JOptionPane.showMessageDialog(null,salida);
    }
    
    public static long decimalABinario(int decimal) {
        long binario = 0;
        int digito;
        final int divisor = 2;
        
        for (int i = decimal, j = 0; i > 0; i /= divisor, j++) {
            digito = i % divisor;
            binario += digito * Math.pow(10, j);
        }
        return binario;
    }
    
    public static int binarioADecimal(long binario) {
 
        int decimal = 0;
        int digito;
        final long divisor = 10;
    
        for (long i = binario, j = 0; i > 0; i /= divisor, j++) {
            digito = (int) (i % divisor);
        
            if (digito != 0 && digito != 1) {
                return -1;
            }
            decimal+=digito * Math.pow(2, j);
        }
    
        return decimal;
    }
}
