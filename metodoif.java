// voy a pedir al usuario que ingrese un numero entero. Genero un Scanner para que ingrese ese numero. Metodo static que devuelva un booleano.
import java.util.Scanner;

public class metodoif {
    public static String esPar(int number){
        if(number%2==0){
            return "El numero "+ number + " es par";
            
        }else{
           return  "El numero "+number+ " es impar";
        }
        
          
    }//nombre de la funcion buscando si es par o no.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero entero al azar: ");
        int n=sc.nextInt();
        System.out.println("Ingrese un numero entero:");
        int n1=sc.nextInt();

        System.out.println(esPar(n));
        System.out.println(esPar(n1));

       
        sc.close();
    }

}
