
package pkg4.practica.arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class PracticaArrays {

    
    public static void main(String[] args) {
        //P1 declarar los arreglos
        int numeros[] = new int [5];
        int numeros2[] = new int [numeros.length];
        String palabras[] = new String[5];
        
        //P2. capturas datos
        int i;
        for(i=1; i<5; i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog(
                null,"ingrese el elemento de indice" + i
                                
                        )                
            );
                      
    
    }
        //P3 mostrar los datos 
        System.out.println("los datos sin orden son:");
        for(i=0; i<5; i++){
            System.out.print("["+numeros[i]+"]");
        }
        
        //P4 ordenar los datos del arreglo
        System.out.println("los elementos ordenados son:");
        Arrays.sort(numeros);
        for(i=0; i<5; i++){
            System.out.print("["+numeros[i]+"]");
        }
        
        //P5 renellar en arreglo con palabras
        System.out.println("rellenando palabras..");
        Arrays.fill(palabras, "voy a pasar la materia");
        for(i=0; i<5; i++){
            System.out.println("["+palabras[i]+"]");
        }
        
           //P6  copiar los elementoas del arreglo numeros a numeros2
           System.out.println("copiando elementos de un arrelgo a otro...");
           System.arraycopy(numeros, 0, numeros2, 0, numeros.length);
           for(i=0; i<5; i++){
               System.out.println("["+numeros2[i]+"]");
           }
           
           //P7 utilizar el equals para comparar
           System.out.println("comparar..");
           Arrays.equals(numeros, numeros2);
           for(i=0; i<5; i++){
           System.out.println("["+numeros[i]+"]");
               
             
           }
       
    }
}    

    

