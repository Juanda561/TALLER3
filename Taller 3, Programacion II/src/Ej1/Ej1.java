/*
1. Un vendedor minorista en línea requiere un informe de las ventas del día. Para ello cuenta con tres arreglos de n 
elementos cada uno: A, B y C. El primero almacena el código de los productos vendidos en el día, El segundo almacena 
el valor de venta de cada producto, y el tercero la cantidad de unidades vendidas de cada producto.
 Requiere un aplicativo que le calcule rápidamente los siguientes datos: 
 Total productos vendidos en el día.
 Total ingresos por ventas del día.
 El producto más vendido.
 El producto más costoso vendido.
 */

package Ej1;

public class Ej1 {

   
    public static void main(String[] args) {

        //Arreglos
        int []A={34453,32424,65564,33453};//Codigo de producto
        float []B={15000,80000,35500,42000};//precio de producto
        int[]C={5,7,15,9};//cantidad de cada producto
        
        int a=0,np=0;
        float b=0, npmcv=0;
        
        
        //suma el total de productos vendidos
        for (int i = 0; i<B.length; i++) {
            b=b+B[i];
        }
        
        //
       
        
        //suma el total de ingresos de los productos vendidos
        for (int i = 0; i<C.length; i++) {
            a=a+C[i];
        }
        
        
        int pmv=C[1];//asignamos lo que hay en la posicion 1 del vetor, a la variable
        float pmcv=B[1];//asignamos lo que hay en la posicion 1 del vetor, a la variable

        for (int i = 0; i < C.length; i++) {
            if (C[i]>pmv) {//comparamos lo que hay en la variable, con lo que hay dentro del vector en ese posicion
                pmv=C[i];//asignamos lo que hay en esa posicion del vector, a la variable pmv
                np=A[i];//a su vez le asignamos lo que contiene el otro vector codigo, en la posicion.
            }
            
            if (B[i]>pmcv) {
                pmcv=B[i];
                npmcv=A[i];

            }
        }
        
        System.out.println("Se vendieron: "+a+" productos en total");
        System.out.printf("Los ingresos por venta: $"+b+"\n");
        System.out.println("Producto mas vendido fue el del codigo: "+np+" con una cantidad de "+pmv);
        System.out.println("Producto mas costoso vendido fue de "+pmcv);
    }
    
}
