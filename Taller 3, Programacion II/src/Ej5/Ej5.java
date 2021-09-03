/*
5. Los resultados de las últimas elecciones a la alcaldía de Valledupar fueron las siguientes: 

Comuna    Candidato A   Candidato B   Candidato C   Candidato D
 1             194           48          206             45
 2             180           20          320             16
 3             221           90          140             20
 4             432           50          821             14
 5             820           61          946             18

Escribe un programa en java que realice los siguientes cálculos: 
 Imprimir la tabla de votaciones, incluyendo sus cabeceras
 Calcular e imprimir el número total de votos recibidos por cada candidato y el porcentaje del total de votos 
emitidos. Indicar cuál ha sido el candidato más votado.
 Si algún candidato recibe más del 50% de los votos, el programa imprimirá un mensaje declarándole 
ganador.
 Cual fue la comuna que mayor porcentaje de votación tuvo.
 Imprima la lista de candidatos ordenada descendentemente por votación alcanzada.
 */

package Ej5;

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ej5 {
    
    public static void principal(){
        
        JTextArea salida = new JTextArea();
        salida.setText("Comuna\tCandidato A\t Candidato B\t Candidato C\t Candidato D\t\n");
        
        int f=5;
        int c=4;
        
        int contar_candidato_A=0;
        int contar_candidato_B=0;
        int contar_candidato_C=0;
        int contar_candidato_D=0;
        
        int contar_comuna_1=0;
        int contar_comuna_2=0;
        int contar_comuna_3=0;
        int contar_comuna_4=0;
        int contar_comuna_5=0;
        
        
        int [][]m= new int[f][c];
        
        //le damos los valores al vector bidimencional
        m[0][0]=194;
        m[0][1]=48;
        m[0][2]=206;
        m[0][3]=45;  
        
        m[1][0]=180;
        m[1][1]=20;
        m[1][2]=320;
        m[1][3]=16;
       
        m[2][0]=221;
        m[2][1]=90;
        m[2][2]=140;
        m[2][3]=20;
     
        m[3][0]=432;
        m[3][1]=50;
        m[3][2]=821;
        m[3][3]=14;
        
        m[4][0]=820;
        m[4][1]=61;
        m[4][2]=947;
        m[4][3]=18;
        
        int []total_votos_candidatos=new int[4];
        
        //muestra la tabla
        int a=1;
        for (int i = 0; i< f; i++) {
            salida.append(""+a+"\t");
            for (int j = 0; j <c; j++) {
                salida.append(""+m[i][j]+"\t ");
            }
                salida.append("\n");
                a++;
        }
        
        //cuenta los votos de cada candidato
        for (int i = 0; i <f; i++) {
            
            for (int j = 0; j <c; j++) {
                if (j==0) {
                    contar_candidato_A=contar_candidato_A+m[i][j];
                }else{} 
                    if (j==1) {
                        contar_candidato_B=contar_candidato_B+m[i][j];
                    }else{}
                        if (j==2) {
                            contar_candidato_C=contar_candidato_C+m[i][j];
                        }else{}
                            if (j==3) {
                                contar_candidato_D=contar_candidato_D+m[i][j];
                            }           
            }
          
        }
        
        float total_votos=contar_candidato_A+contar_candidato_B+contar_candidato_C+contar_candidato_D;
        float porcentaje_candidato_A=(contar_candidato_A*100)/total_votos;
        float porcentaje_candidato_B=(contar_candidato_B*100)/total_votos;
        float porcentaje_candidato_C=(contar_candidato_C*100)/total_votos;
        float porcentaje_candidato_D=(contar_candidato_D*100)/total_votos;

        salida.append("\n");
        salida.append("El candidato A obtuvo un total de "+contar_candidato_A+" votos, con un porcentaje del "+porcentaje_candidato_A+"%\n");
        salida.append("El candidato B obtuvo un total de "+contar_candidato_B+" votos, con un porcentaje del "+porcentaje_candidato_B+"%\n");
        salida.append("El candidato C obtuvo un total de "+contar_candidato_C+" votos, con un porcentaje del "+porcentaje_candidato_C+"%\n");
        salida.append("El candidato D obtuvo un total de "+contar_candidato_D+" votos, con un porcentaje del "+porcentaje_candidato_D+"%\n");
        salida.append("\n");
        
        if (mayor1(contar_candidato_A, contar_candidato_B)>mayor2(contar_candidato_C, contar_candidato_D)) {
            if (mayor1(contar_candidato_A, contar_candidato_B)==contar_candidato_A) {
                salida.append("Candidato A tuvo mas votos");
            }else{
                salida.append("Candidato B tuvo mas votos");
            }
        }else{
            if (mayor2(contar_candidato_C, contar_candidato_D)==contar_candidato_C) {
                salida.append("Candidato C tuvo mas votos");
            }else{
                salida.append("Candidato D tuvo mas votos");
            }
        }
        
        salida.append("\n");
        salida.append("\n");
        
        if (porcentaje_candidato_A>50) {
            salida.append("El CANDIDADO A ES EL GANADOR");
        }else{}
            if (porcentaje_candidato_B>50) {
                salida.append("El CANDIDADO B ES EL GANADOR");
            }else{}
                if (porcentaje_candidato_C>50) {
                    salida.append("El CANDIDADO C ES EL GANADOR");
                }else{}
                    if (porcentaje_candidato_D>50) {
                        salida.append("El CANDIDADO D ES EL GANADOR");
                    }
                    
        //cuenta el total de votos de las comunas            
        for (int i = 0; i <f; i++) {
            for (int j = 0; j <c; j++) {
                if (i==0) {  
                   contar_comuna_1=contar_comuna_1+m[i][j];
                }else{}
                    if (i==1) {  
                        contar_comuna_2=contar_comuna_2+m[i][j];
                    }else{}
                        if (i==2) {  
                            contar_comuna_3=contar_comuna_3+m[i][j];
                        }else{}
                            if (i==3) {  
                                contar_comuna_4=contar_comuna_4+m[i][j];
                            }else{}
                                if (i==4) {  
                                    contar_comuna_5=contar_comuna_5+m[i][j];
                                }
            }
        }
        
        //calcular el porcentaje de cada comuna
        float total_votos_comuna=contar_comuna_1+contar_comuna_2+contar_comuna_3+contar_comuna_4;
        float porcentaje_comuna_1=(contar_comuna_1*100)/total_votos_comuna;
        float porcentaje_comuna_2=(contar_comuna_2*100)/total_votos_comuna;
        float porcentaje_comuna_3=(contar_comuna_3*100)/total_votos_comuna;
        float porcentaje_comuna_4=(contar_comuna_4*100)/total_votos_comuna;
        float porcentaje_comuna_5=(contar_comuna_5*100)/total_votos_comuna;
        
        salida.append("\n");
        
        //compara el porcentaje de las comunas para calcular el mayor de todos
        if (mayor_porcentaje_comuna(porcentaje_comuna_1, porcentaje_comuna_2, porcentaje_comuna_3)>mayor_porcentaje_comuna1(porcentaje_comuna_4, porcentaje_comuna_5)) {
            if (mayor_porcentaje_comuna(porcentaje_comuna_1, porcentaje_comuna_2, porcentaje_comuna_3)==porcentaje_comuna_1) {
                salida.append("El mayor porcentaje de votación lo tuvo la comuna 1 con un "+porcentaje_comuna_1+"%");
            }else{}
                if (mayor_porcentaje_comuna(porcentaje_comuna_1, porcentaje_comuna_2, porcentaje_comuna_3)==porcentaje_comuna_2) {
                    salida.append("El mayor porcentaje de votación lo tuvo la comuna 2 con un "+porcentaje_comuna_2+"%");
                }else{
                    salida.append("El mayor porcentaje de votación lo tuvo la comuna 3 con un "+porcentaje_comuna_3+"%");  
                }
                
        }else{
            
            if (mayor_porcentaje_comuna1(porcentaje_comuna_4, porcentaje_comuna_5)==porcentaje_comuna_4) {
                salida.append("El mayor porcentaje de votación lo tuvo la comuna 4 con un "+porcentaje_comuna_4+"%");  
            }else{
                salida.append("El mayor porcentaje de votación lo tuvo la comuna 5 con un "+porcentaje_comuna_5+"%"); 
            }
        }
        
        salida.append("\n\n");
        
        //ultimo inciso
        total_votos_candidatos[0]=contar_candidato_A;
        total_votos_candidatos[1]=contar_candidato_B;
        total_votos_candidatos[2]=contar_candidato_C;
        total_votos_candidatos[3]=contar_candidato_D;
        
        salida.append("Ordenados descendentemente\n");
        
        Arrays.sort(total_votos_candidatos);//ordenar descendentemente
        for (int i = total_votos_candidatos.length-1; i>=0; i--) {
            
            //comparamos el valor que tiene el arreglo, con el total de votos del candidato, solamente para que imprima el nombre al lado de la cantidad de votos
            if (total_votos_candidatos[i]==contar_candidato_A) {
                salida.append("Candidato A: "+total_votos_candidatos[i]+" votos\n");
            }else{}
                if (total_votos_candidatos[i]==contar_candidato_B) {
                    salida.append("Candidato B: "+total_votos_candidatos[i]+" votos\n");
                }else{}
                    if (total_votos_candidatos[i]==contar_candidato_C) {
                        salida.append("Candidato C: "+total_votos_candidatos[i]+" votos\n");
                    }else{}
                        if (total_votos_candidatos[i]==contar_candidato_D) {
                            salida.append("Candidato D: "+total_votos_candidatos[i]+" votos\n");
                        }
        }
        
        JOptionPane.showMessageDialog(null, salida);
        
    }
    
    public static float mayor1(float a, float b){//calcula el mayor porcentaje de candidatos, solo 2 variable
        float mayor = b;
        
        if (a>b) {
            mayor=a;
        }
        return mayor;
    }
    
    public static float mayor2(float a, float b){//calcula el mayor porcentaje de candidatos solo 2 variables
        float mayor = b;
        
        if (a>b) {
            mayor=a;
        }
        return mayor;
    }
    
    public static float mayor_porcentaje_comuna(float a,float b, float c){
        
        float mayor =c;
        
        if (a>b&&a>c) {
            mayor=a;
        }
        
        if (b>a&&b>c) {
            mayor=b;
        }
                
        return mayor;
    }
    
    public static float mayor_porcentaje_comuna1(float a, float b){
        
        float mayor=a;
        
        if (b>a) {
            mayor=b;
        }
        
        return mayor;
    }
    
    public static void main(String[] args) {
        principal();
    }
    
}
