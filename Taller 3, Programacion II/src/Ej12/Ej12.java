/*
12. Una agencia de autos que distribuye 5 modelos de vehículos y mantiene 
en su personal a 5 vendedores. Desea un programa que registre las ventas 
mensuales por vendedor y modelo, así:

sí mismo, desea imprimir un informe con los siguientes datos:

 El total de automóviles vendidos por cada vendedor
 El total de vehículos vendidos por modelo
 Cuál ha sido el vendedor con mayor venta en el mes.
 */
package Ej12;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ej12 {
    
    public static void main(String[] args) { 
        
        JTextArea salida = new JTextArea();
        salida.setText("VENDEDOR \tMODELO 1\t MODELO 2\t MODELO 3\t MODELO 4\t MODELO 5\n");
        
        int f=5;
        int c=5;
        
        int contar_vendedor_1=0;
        int contar_vendedor_2=0;
        int contar_vendedor_3=0;
        int contar_vendedor_4=0;
        int contar_vendedor_5=0;
        
        int contar_modelo_1=0;
        int contar_modelo_2=0;
        int contar_modelo_3=0;
        int contar_modelo_4=0;
        int contar_modelo_5=0;
       
        
        int [][]m= new int[f][c];
        
        //le damos los valores al vector bidimencional
        m[0][0]=4;
        m[0][1]=8;
        m[0][2]=1;
        m[0][3]=4;  
        m[0][4]=4;  
        
        m[1][0]=12;
        m[1][1]=4;
        m[1][2]=25;
        m[1][3]=1;
        m[1][4]=1;
       
        m[2][0]=15;
        m[2][1]=3;
        m[2][2]=4;
        m[2][3]=2;
        m[2][4]=2;
     
        m[3][0]=4;
        m[3][1]=5;
        m[3][2]=8;
        m[3][3]=1;
        m[3][4]=1;
        
        m[4][0]=8;
        m[4][1]=6;
        m[4][2]=9;
        m[4][3]=1;
        m[4][4]=1;
        
        int a=1;
        for (int i = 0; i< f; i++) {
            salida.append(""+a+"\t");
            for (int j = 0; j <c; j++) {
                salida.append(""+m[i][j]+"\t ");
            }
                salida.append("\n");
                a++;
        }
        
        for (int i = 0; i <f; i++) {
            for (int j = 0; j <c; j++) {
                if (i==0) {  
                   contar_vendedor_1=contar_vendedor_1+m[i][j];
                }else{}
                    if (i==1) {  
                        contar_vendedor_2=contar_vendedor_2+m[i][j];
                    }else{}
                        if (i==2) {  
                            contar_vendedor_3=contar_vendedor_3+m[i][j];
                        }else{}
                            if (i==3) {  
                                contar_vendedor_4=contar_vendedor_4+m[i][j];
                            }else{}
                                if (i==4) {  
                                    contar_vendedor_5=contar_vendedor_5+m[i][j];
                                }
            }
        }
        
        salida.append("\n");
        salida.append("El vendedor 1, vendió "+contar_vendedor_1+" vehículos en total este mes\n");
        salida.append("El vendedor 2, vendió "+contar_vendedor_2+" vehículos en total este mes\n");
        salida.append("El vendedor 3, vendió "+contar_vendedor_3+" vehículos en total este mes\n");
        salida.append("El vendedor 4, vendió "+contar_vendedor_4+" vehículos en total este mes\n");
        salida.append("El vendedor 5, vendió "+contar_vendedor_5+" vehículos en total este mes\n");
        
        for (int i = 0; i <f; i++) {
            
            for (int j = 0; j <c; j++) {
                if (j==0) {
                    contar_modelo_1=contar_modelo_1+m[i][j];
                }else{} 
                    if (j==1) {
                        contar_modelo_2=contar_modelo_2+m[i][j];
                    }else{}
                        if (j==2) {
                            contar_modelo_3=contar_modelo_3+m[i][j];
                        }else{}
                            if (j==3) {
                                contar_modelo_4=contar_modelo_4+m[i][j];
                            }else{} 
                                if (j==4) {
                                    contar_modelo_5=contar_modelo_5+m[i][j];
                                }
            }  
        }
        salida.append("\n");
        salida.append("Se vendieron "+contar_modelo_1+" vehiculos modelo 1\n");
        salida.append("Se vendieron "+contar_modelo_2+" vehiculos modelo 2\n");
        salida.append("Se vendieron "+contar_modelo_3+" vehiculos modelo 3\n");
        salida.append("Se vendieron "+contar_modelo_4+" vehiculos modelo 4\n");
        salida.append("Se vendieron "+contar_modelo_5+" vehiculos modelo 5\n\n");
        
        if (mayor_ventas1(contar_vendedor_1, contar_vendedor_2, contar_vendedor_3)>mayor_ventas2(contar_vendedor_4, contar_vendedor_5)) {
            if (mayor_ventas1(contar_vendedor_1, contar_vendedor_2, contar_vendedor_3)==contar_vendedor_1) {
                salida.append("El vendedor 1 tuvo mayor ventas este mes");
            }else{}
                if (mayor_ventas1(contar_vendedor_1, contar_vendedor_2, contar_vendedor_3)==contar_vendedor_2) {
                    salida.append("El vendedor 2 tuvo mayor ventas este mes");
                }else{}
                    if (mayor_ventas1(contar_vendedor_1, contar_vendedor_2, contar_vendedor_3)==contar_vendedor_3) {
                        salida.append("El vendedor 3 tuvo mayor ventas este mes");
                    }
        }else{
            if (mayor_ventas2(contar_vendedor_4, contar_vendedor_5)==contar_vendedor_4) {
                salida.append("El vendedor 4 tuvo mayor ventas este mes");
            }else{
                salida.append("El vendedor 5 tuvo mayor ventas este mes");
             }
         }
            
        
        
        
        JOptionPane.showMessageDialog(null, salida);
    }
    
    public static float mayor_ventas1(float a,float b, float c){
        
        float mayor =c;
        
        if (a>b&&a>c) {
            mayor=a;
        }
        
        if (b>a&&b>c) {
            mayor=b;
        }
                
        return mayor;
    }
    
    public static float mayor_ventas2(float a, float b){
        
        float mayor=a;
        
        if (b>a) {
            mayor=b;
        }
        
        return mayor;
    }
    
}
