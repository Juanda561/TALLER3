/*
4. Desarrolle una aplicación en Java que determine el sueldo bruto para un conjunto de empleados. La empresa paga la 
cuota normal en las primeras 40 horas de trabajo de cada empleado, y cuota y media en todas las horas trabajadas 
que excedan de 40. 

Usted recibe un arreglo E con los empleados de la empresa, un arreglo H con el número de horas que trabajó cada 
uno la semana pasada y otro T con la tarifa por horas normal de cada empleado. 

Con estos datos el programa debe determinar y mostrar el sueldo bruto de cada trabajador.
 */
package Ej4;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ej4 {
    
    public static void main(String[] args) {
        
        JTextArea salida=new JTextArea();
        salida.setText(" \n");
        
        double []Sueldo_Bruto= new double[10];
        String []Empleados=new String[10];
        int []Horas_Trabajadas=new int[10];
        double []TarifaXHora=new double[10];
        String opcion;
        
        do {
            
            for (int i = 0; i<1; i++) {
                Empleados[i]= JOptionPane.showInputDialog("Nombre del empleado");
                Horas_Trabajadas[i]= Integer.parseInt(JOptionPane.showInputDialog("Horas trabajadas de "+Empleados[i]));
                TarifaXHora[i]= Double.parseDouble(JOptionPane.showInputDialog("Tarifa por hora del empleado "+Empleados[i]));
                
                if ( 40 >= Horas_Trabajadas[i]){
                    Sueldo_Bruto[i] = Horas_Trabajadas[i]*TarifaXHora[i];
                    salida.append("El sueldo bruto de "+Empleados[i]+" Es de $"+Sueldo_Bruto[i]+"\n");
                    
                }else{
                        Sueldo_Bruto[i] = 40*TarifaXHora[i] + (Horas_Trabajadas[i] - 40)*(TarifaXHora[i] + TarifaXHora[i]/2);
                        salida.append("El sueldo bruto de "+Empleados[i]+" Es de $"+Sueldo_Bruto[i]+"\n");

                    }
            }
       
            opcion = JOptionPane.showInputDialog("¿Desea agregar otro empleado? S/N");
        } while (opcion.equals("s")||opcion.equals("S"));
        
        JOptionPane.showMessageDialog(null, salida);
   
    }
    
}
