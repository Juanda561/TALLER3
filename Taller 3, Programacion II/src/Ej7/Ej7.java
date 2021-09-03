/*
7. Escriba un programa en Java que reciba como entrada una serie de 10 números enteros, y que determine e imprima 
el mayor de los números. Su programa debe utilizar cuando menos las siguientes tres variables:
a) contador: Un contador para contar hasta 10 (para llevar el registro de cuántos números se han introducido, y para 
determinar cuándo se hayan procesado los 10 números).
b) número: El entero más reciente introducido por el usuario.
c) mayor: El número más grande encontrado hasta ahora
 */
package Ej7;

import javax.swing.JOptionPane;

public class Ej7 {

    public static void main(String[] args) {
        
        int contador=1;
        
            int mayor= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            int ultimo_numero=0;
            
            while (10>contador) {
                int numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            
                if (numero>mayor) {
                    mayor=numero;
                    System.out.println("el numero mas grande hasta ahora es: "+mayor);
                }
            
                ultimo_numero=numero;
                
                contador++;
            }
        
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("Ultimo número ingresado: "+ultimo_numero);
    }    
    
}