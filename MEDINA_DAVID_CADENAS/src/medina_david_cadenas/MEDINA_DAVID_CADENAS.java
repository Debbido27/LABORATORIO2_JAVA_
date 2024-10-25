
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
        entrada.nextLine();
                
        
   
       while(true){     
        System.out.print("BIENVENIDO A MENU EJERCICIOS\n1.Cadenas\n2.Notas\n3.Clases\n4.Salir\nIngrese una opcion porfavor: ");
        int Op = entrada.nextInt();
        switch(Op){
    
            case 1:
               char carrepet = ' ';
               int [] contador = new int[256];
               
               int i = 0;
             while(true){  
            System.out.print("Bienvenido a CADENAS\nSi quiere regresar al menu presione s. \nIngrese una palabra porfavor: ");
            String Cadena = entrada.next().toLowerCase();
            
              if (Cadena.equals("s")) {
                        break;
                    }
            while (i<Cadena.length()){
             char Caracter  = Cadena.charAt(i);
             contador[Caracter]++;
             i++;
            }
            
             
            int Maxrep = 0;
            char Carrep = ' ';
            
            i=0;
            while (i< contador.length){
                if (contador[i]>Maxrep){
                    Maxrep = contador[i];
                    Carrep= (char) i;
                          
                }
                i++;
            }
                System.out.println("El caracter mas repetidor es: "+Carrep+"Un total de "+Maxrep);
               
                    
             
                System.out.println("VOLVIENDO AL MENU....");
             }
            case 2:
                int cantidadnotas;
                
                do{
                System.out.println("Ingrese la cantidad de notas: ");
                   cantidadnotas=entrada.nextInt();
                
                   if (cantidadnotas<0){
                       System.out.println("Porfavor ingrese un valor posito.");
                   }while (cantidadnotas <= 0);

        double sumaNotas = 0;
        double notaMayor = 0; // Inicializar con 0
        double notaMenor = 100;
            for (int i = 0; i< cantidad; i++){
                double nota;
                do{
                    System.out.println("Nota."+(i+1)+":");
                    nota = entrada.nextDouble();
                    
                    if (nota<0|| nota>100){
                        System.out.println("Solo se aceptan en el rango: ");
                        
                    }
                
                
            
                
                
                
       }
    }
                }            
     
    
    


