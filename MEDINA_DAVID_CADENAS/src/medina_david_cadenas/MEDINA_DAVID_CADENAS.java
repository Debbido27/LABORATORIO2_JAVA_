
package medina_david_cadenas;

import java.util.Scanner;

/**
Menú

Crear un menú que permita tener referencias de los ejercicios, y permita ingresar a cada uno y volver a retornar al menú hasta que indique la opción de salir.

1. CADENA 

Se ingresa una cadena del teclado y al final se imprime cuál es el carácter que más veces se repite en dicha cadena.

La salida de pantalla debe mostrar el carácter y la cantidad de veces que se repite. Usar While
 */
public class MEDINA_DAVID_CADENAS {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        
        while(true){
            
        System.out.print("BIENVENIDO A MENU EJERCICIOS\n1.Cadenas\n2.Notas\n3.Clases\n4.Salir\nIngrese una opcion porfavor: ");
        int Op1 = entrada.nextInt();
        
        switch(Op1){
    //Se necesita encontrar la cantidad de palabras
            case 1:
               char carrepet = ' ';
               int contador = 0;
               int i = 0;
               
            System.out.print("Bienvenido a CADENAS\nSi quiere regresar al menu presione s. \nIngrese una palabra porfavor: ");
            String Cadena = entrada.next();
            
            break;

            
             case 2:
             System.out.println("Bienvenido a clases\nIngrese las notas que desea promediar\nNota parcial 1: ");
             System.out.println("Nota parcial 2: ");
             int Nota1 = entrada.nextInt();
             
             System.out.println("Nota parcial 2: ");
             int Nota2 = entrada.nextInt();

             System.out.println("Nota parcial 3: ");
             int Nota3 = entrada.nextInt();

             
             
                break;
                
              case 3:
                
      
            }
            
        
    }
      
    }
    
}
}