/*
3. Una empresa grande paga a sus vendedores mediante comisiones. Los vendedores reciben $200 por semana, más el 
9% de sus ventas brutas durante esa semana.

Por ejemplo, un vendedor que vende $5,000 de mercancía en una semana,
recibe $200 más el 9% de 5,000, o un total de $650 en esa semana.

Del mismo modo, la empresa premia a los vendedores que cumplan los objetivos de venta con un incremento en el 
pago de la semana, de acuerdo a las siguientes categorías de vendedores:

A – incrementa el pago semanal en 5% si las ventas superan $3000, en 7% sin son entre $5000 y $7000, y 10% si 
superan los $7000.
B – incrementa el pago semanal en 7% si las ventas superan $5000, %10 si son entre %10000 y $15000, 13% si 
superan los $15000.

Si usted cuenta con el registro de ventas semanales realizadas por un vendedor almacenados en un arreglo, cuál sería 
el pago semanal en cada categoría?

 */
package Ej3;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Ej3 {
    
    public static void main(String[] args) {
        
        JTextArea salida = new JTextArea();
        salida.setText("");
        
        double [] Venta_SemanaA = new double[4];
        double [] Venta_SemanaB = new double[4];
        
        String Vendedor=JOptionPane.showInputDialog("Digite su nombre");
        
        int a=1;
        for (int i = 0; i <Venta_SemanaA.length; i++) {
            
            Venta_SemanaA[i]=Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto vendio en la semana "+a));
            Venta_SemanaB[i]=Venta_SemanaA[i];
            
            if (Venta_SemanaA[i]>3000) {
                salida.append("El pago de la semana "+a+" cumplió con los requesitos de Categoria A, y el pago es de: "+CategoriaA(Venta_SemanaA)+"\n");
            }else{
                salida.append("El pago de la semana "+a+" NO cumplió con los requesitos de la Categoria A, su pago es de: "+CategoriaA(Venta_SemanaA)+"\n");
            }
            
            if (Venta_SemanaB[i]>5000) {
                salida.append("El pago de la semana "+a+" cumplió con los requesitos de Categoria B, y el pago es de:  "+CategoriaB(Venta_SemanaB)+"\n");
            }else{
                salida.append("El pago de la semana "+a+" NO cumplió con los requesitos de la Categoria B, su pago es de: "+CategoriaA(Venta_SemanaB)+"\n");
            }
        
            a++;
        }
        
        JOptionPane.showMessageDialog(null,salida);
               
    }
    
    public static double CategoriaA(double Venta_SemanaA[]){
        
        double porcentajeA=0,porcentajeAA=0;
        
        for (int i = 0; i <Venta_SemanaA.length; i++) { 
            
            if (Venta_SemanaA[i]>3000 && Venta_SemanaA[i]<5000) {
                porcentajeA = (Venta_SemanaA[i]*0.05)+200;
                
            }else{}
                if (Venta_SemanaA[i]>=5000 && Venta_SemanaA[i]<=7000) {
                    porcentajeA = (Venta_SemanaA[i]*0.07)+200;
                }else{}
                    if (Venta_SemanaA[i]>7000) {
                        porcentajeA = (Venta_SemanaA[i]*0.1)+200;
                    }else{
                        porcentajeA = (Venta_SemanaA[i]*0.09)+200;
                    }
         
        }
         
        return porcentajeA; 
    }
    
    public static double CategoriaB(double Venta_SemanaB[]){
        
        double porcentajeB=0,porcentajeBB=0;
        
        for (int i = 0; i <Venta_SemanaB.length; i++) { 
            
            if (Venta_SemanaB[i]>5000) {
                porcentajeB = (Venta_SemanaB[i]*0.07)+200;
                
            }else{}
                if (Venta_SemanaB[i]>=10000 && Venta_SemanaB[i]<=15000) {
                    porcentajeB = (Venta_SemanaB[i]*0.1)+200;
                }else{}
                    if (Venta_SemanaB[i]>15000) {
                         porcentajeB = (Venta_SemanaB[i]*0.13)+200;
                    }else{
                        porcentajeB = (Venta_SemanaB[i]*0.09)+200;
                    }
        
        }
         
        return porcentajeB; 
    }
    
}
