/*
10. Un estacionamiento cobra una cuota mínima de $2.00 por estacionarse hasta tres horas. El estacionamiento cobra 
$0.50 adicional por cada hora o fracción que se pase de tres horas. El cargo máximo para cualquier periodo dado de 
24 horas es de $10.00. Suponga que ningún auto se estaciona durante más de 24 horas a la vez. Escriba una aplicación 
que calcule y muestre los cargos por estacionamiento para cada cliente que se haya estacionado ayer.

 */
package Ej10;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ej10 {
    
    public static void main(String[] args) {
        double total=0;
        double horas= Double.parseDouble(JOptionPane.showInputDialog("Introduzca las horas del coche"));
        
        
        System.out.println("El cargo para el usuario es de: "+cargo(horas));    
        
    }
    
    public static double cargo(double x){
        
        double cargo=0;
        
        if (x<=3) {
            cargo= 20;
        }
        
        if (x>3) {
            cargo = 20+(5*(x-3));
        }
        if (cargo>50) {
            cargo=50;
        }
        
        
       return cargo;
    }
    
}
