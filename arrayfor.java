//Voy a pedirle al usuario que me ponga 5 numeros. Los guardo en un array y saco promedio.
import java.util.Scanner;
public class arrayfor {
    public static double calcularPromedio(int[]array){
        int suma=0;
        for(int i=0;i<array.length;i++){
        suma+=array[i];
        }
        return (double)suma/array.length;


    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] number= new int[5];
    for(int i=0;i<5;i++){
        System.out.println("Ingreso numero: "+(i + 1));//uso for para que me muestre tantas veces el mensaje como numeros que va ingresando.
        number[i]=sc.nextInt();//variable number vacia suma los valores del scanner.
         }
       double prom= calcularPromedio(number);
       System.out.println("El promedio del usuario es: "+ prom);
       

}

    

    
}
