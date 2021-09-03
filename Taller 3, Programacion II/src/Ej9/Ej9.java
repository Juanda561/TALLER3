/*
9. Un vendedor minorista en línea vende cinco productos cuyos precios de venta son los siguientes: producto 1, $2.98; 
producto 2, $4.50; producto 3, $9.98; producto 4, $4.49 y producto 5, $6.87. Escriba una aplicación que lea una serie 
de pares de números, como se muestra a continuación:
a) número del producto;
b) cantidad vendida.
Su programa debe utilizar una instrucción switch para determinar el precio de venta de cada producto. Debe calcular y 
mostrar el valor total de venta de todos los productos vendidos. Use un ciclo repetitivo para determinar cuándo debe el 
programa dejar de iterar para mostrar los resultados finales.
 */
package Ej9;

import javax.swing.JOptionPane;

public class Ej9 {
    
    public static void main(String[] args) {
        
        Menu();
        
    }
    
    public static void Menu(){
        int opcion= Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion\n"
                                        +"1) Producto 1: $2.98\n"
                                        +"2) Producto 2: $4.50\n"
                                        +"3) Producto 3: $9.98\n"
                                        +"4) Producto 4: $4.49\n"
                                        +"5) Producto 5: $6.87\n"
                                        +""));
   
                switch(opcion){
            case 1:{
                producto1();
                break;}
            case 2:
                 producto2();
                break;
            case 3:
                producto3();
                break;
            case 4:
                producto4();
                break;
            case 5:
                producto5();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Elija una opcion válida");
                break;
            }
                String continuar = JOptionPane.showInputDialog("¿Desea calcular otro producto? s/n");
                
                if (continuar.equals("s")) {
                    Menu();
                }
    }
    
    public static void producto1(){
        int cantidad_vendida=Integer.parseInt(JOptionPane.showInputDialog("\nIntroduzca la cantidad vendida de este producto 1:"));
        System.out.println("\nPrecio de esta venta: "+ cantidad_vendida*2.98);
        
    }
    public static void producto2(){
        int cantidad_vendida=Integer.parseInt(JOptionPane.showInputDialog("\nIntroduzca la cantidad vendida de este producto 2:"));
        System.out.println("\nPrecio de esta venta: "+ cantidad_vendida*4.50);
        
    }
    public static void producto3(){
        int cantidad_vendida=Integer.parseInt(JOptionPane.showInputDialog("\nIntroduzca la cantidad vendida de este producto 3:"));
        System.out.println("\nPrecio de esta venta: "+ cantidad_vendida*9.98);
        
    }
    public static void producto4(){
        int cantidad_vendida=Integer.parseInt(JOptionPane.showInputDialog("\nIntroduzca la cantidad vendida de este producto 4:"));
        System.out.println("\nPrecio de esta venta: "+ cantidad_vendida*4.49);
        
    }
    public static void producto5(){
        int cantidad_vendida=Integer.parseInt(JOptionPane.showInputDialog("\nIntroduzca la cantidad vendida de este producto 5:"));
        System.out.println("\nPrecio de esta venta: "+ cantidad_vendida*6.87);
        
    }
    
    
}
