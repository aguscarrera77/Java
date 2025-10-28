import java.util.Scanner;


public class consulta {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int number1=sc.nextInt();
        System.out.println("Ingrese un segundo numero");
        int number2=sc.nextInt();
        int suma=number1 + number2;
        System.out.print("La suma es: "+ suma);
        sc.close();
        
    }
}

