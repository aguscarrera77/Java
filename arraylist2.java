//Ejercicio donde arranca de un arraylist vacio y voy cargando nombres segun la cantidad que necesito.
// el primer scanner define el numero a cargar y el segundo carga los elemenos.


import java.lang.classfile.Signature.ArrayTypeSig;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<Perfil> names= new ArrayList<>();
        System.out.println("Cuantos perfiles vas a cargar?");
        int cantidad=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<cantidad;i++){
            System.out.println("Ingrese un Nombre: ");
            String nombres=sc.nextLine();
            System.out.println("Edad: ");
            int edad=sc.nextInt();
            sc.nextLine();
            names.add(new Perfil(nombres,edad));
        }

        System.out.println("\nLista de perfiles: ");
        for ( Perfil name:names) {
            name.mostrarPerfil();
        }







    }







}