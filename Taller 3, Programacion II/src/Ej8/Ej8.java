/*
8. Escriba una aplicación que pida al usuario que introduzca el tamaño del lado
de un cuadrado y que muestre un cuadrado hueco de ese tamaño, compuesto de
asteriscos. Su programa debe funcionar con cuadrados que tengan lados de 
todas las longitudes entre 1 y 20.

 */
package Ej8;

import javax.swing.JOptionPane;

public class Ej8 {
    
    public static void main(String[] args) {
        
        int x=0;

        int lado= Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del lado del cuadrado"));
        
        for (int i = 0; i <lado; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        int a=lado-2;
        
        do {
            for (int i = 0; i <1; i++) {
                System.out.print("*");
            }
            
            for (int i = 0; i <a; i++) {
                System.out.print(" ");
            }
        
            for (int i = 0; i <1; i++) {
                System.out.print("*");
            }
            
            x++;
            
            System.out.println("");
            
        } while (x<a);
        
        for (int i = 0; i <lado; i++) {
            System.out.print("*");
        }
        
    }
    
}
