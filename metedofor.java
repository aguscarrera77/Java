import java.util.Scanner;

public class metedofor {
    public static void mostrarTabla(int n){// void solo imprime no retorna resultados.
        for(int i=0;i<=10;i++){
            System.out.println(n+"x"+i+"="+ (n*i));}}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Ingrese un numero ");
    int numero=sc.nextInt();
    mostrarTabla(numero);
    sc.close();
}

        }
