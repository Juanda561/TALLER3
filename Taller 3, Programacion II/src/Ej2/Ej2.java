/*
2. Desarrolle una aplicación en Java que determine si alguno de los clientes de una tienda de departamentos se ha 
excedido del límite de crédito en una cuenta. Para cada cliente se tienen los siguientes datos: 
a) el saldo al inicio del mes.
b) el total de abonos en el mes.
c) el total de créditos aplicados a la cuenta del cliente en el mes.
d) el límite de crédito permitido.
 */
package Ej2;

import javax.swing.JOptionPane;




public class Ej2 {

    public static void main(String[] args) {
        
        
    int Saldo_Inicial,Total_Abonos,Total_Creditos,Limite_Creditos;
    
    Saldo_Inicial= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el saldo inicial"));
    Total_Abonos= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el total de abonos en el mes"));
    Total_Creditos= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el total de creditos aplicados en el mes"));
    Limite_Creditos= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el limite de creditos permitidos"));
    
    int x = Calculo(Saldo_Inicial, Total_Abonos, Total_Creditos);
    
        if (x-Limite_Creditos>0) {
            System.out.println("Se excedió el límite de creditos de la cuenta");
        }else{
            System.out.println("No ha excedido500 el límite de creditos de la cuenta");
        }
        
    }
    
    public static int Calculo(int a, int b, int c){
        return a+b-c;
    }
    
}
