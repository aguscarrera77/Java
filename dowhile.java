//do while....do te asegura que el bloque de codigo al menos se una vez. Primero esta el do y luega condicion.
// Menu de codigo y luego con las opciones generamos alguna respuesta.

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System .in);
        int opcion;
        do{
            System.out.println("1. Opcion A");
            System.out.println("2. Opcion B");
            System.out.println("3. Opcion C");
            System.out.println("4. Salir.");
            System.out.println("Elegi una opcion:");
            opcion=sc.nextInt();
        }while(opcion!=4);            
        System.out.println("SU MENU FUE CARGADO.FINALIZAR LA COMPRA.");
        }


        
    }
    

