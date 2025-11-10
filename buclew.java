//while bucle que se repite mientras la condicion sea true.
import java.util.Scanner;



public class buclew {
    public static void main(String[] args) {
        int i=1;
        while(i<=5){
            System.out.println("Numero i:"+i);i++;
        }
    Scanner sc= new Scanner(System .in);
    String password="";
    while (!password.equals("1234")) {
        System.out.println("Ingresa el password correcto");
        password=sc.nextLine();}
        System.out.println("Bienvenido al sitio");
    //que suma undidades hasta que el usuario ponga 0.

    Scanner scanner= new Scanner(System .in);
    int numero,suma=0;
        System.out.println("Ingrese un numero");
        numero=scanner.nextInt();
        while(numero!=1){
            suma+=numero;
            numero=scanner.nextInt();
        }

        System.out.println("El numero total es: "+ suma);







    }
}
