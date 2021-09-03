/*
11. Escriba un método que tome un valor entero y devuelva el número con sus dígitos invertidos. Por ejemplo, para el 
número 7631, el método debe regresar 1367. Incorpore el método en una aplicación que reciba como entrada un 
valor del usuario y muestre el resultado.
 */
package Ej11;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ej11 {
    
    static void invertido(){
        
        JTextArea salida = new JTextArea();
        
        int numeros=0,div,inv=0;
        
        numeros= Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        
        int numerocap=numeros;
        
        int numero []=new int [numeros];
        
        while(numeros>0){
            
           div=numeros%10;
           inv=inv*10+div;
           numeros/=10; 
           
        }
     
        salida.append("El numero invertido de "+numerocap+" es: "+inv);
            
        JOptionPane.showMessageDialog(null, salida);
                        
    } 
 
    public static void main(String[] args) {
        invertido();
    }

}
    
   
