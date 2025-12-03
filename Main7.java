import java.util.Scanner;
import java.util.ArrayList;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Libro>libros=new ArrayList<>();
        libros.add(new Libro("Java para principiantes","Gonzales",1999));
        libros.add(new Libro("Java facilongo","Carrera",2025));
        libros.add(new Libro("Java","Fangio",1989));

        System.out.println("Ingrese el nombre del autor");
        String guardarAutor=sc.nextLine().trim().toLowerCase();

        System.out.println("El autor tiene los siguientes resultados:");
        for(Libro l : libros){
            if(l.getautor().equalsIgnoreCase(guardarAutor)){
                l.mostrarInfo();
            }
        }





        




    }
    
}
