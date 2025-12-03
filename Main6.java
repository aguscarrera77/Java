import java.util.ArrayList;
import java.util.Scanner;



public class Main6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Alumno>listado=new ArrayList<>();
        listado.add(new Alumno("Carlos",80));
        listado.add(new Alumno("Roberto",40));
        listado.add(new Alumno("Gerardo",35));
        listado.add(new Alumno("Mirtha",90));
    //ahora armo el scanner que permite la busqueda dentro del arraylist.
        System.out.println("Ingrese el nombre del alumno que deseo buscar: ");
        String buscado=sc.nextLine();
        boolean encontrado=false;

        for(Alumno a : listado){
            if(a.getnombre.equals(buscado)){
                System.out.println("Alumno Encontrado.");
                a.mostrarAlumno();
                encontrado=true;
        }
    }   if(!encontrado){
        System.out.println("Alumno no existe en la lista.");


    }






          
    }

}
