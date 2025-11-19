// Ingresar 5 notas mostramos quien aprobo y quien no.
//array vacio ingreso por scanner de 5 notas.
import java.util.Scanner;

public class arrayifor {
    public static int[] contarAprobados(int[] notas){
        int aprobados=0;
        int desaprobados=0;
        for(int nota : notas){
            if(nota>=70){
                aprobados++;
            }
            else{desaprobados++;};
        }
    return new int[]{aprobados,desaprobados};
    
    

}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int[]notas=new int[5];
    for(int i=0;i<5;i++){
        System.out.println("INGRESE SU NOTA AQUI: "+(i+1));
        notas[i]=sc.nextInt();}

        int[] resultados= contarAprobados(notas);
        int aprobados=resultados[0];
        int desaprobados=resultados[1];



    System.out.println("Aprobados: "+ aprobados);
    System.out.println("Desaprobados: "+ desaprobados);

}


    
}
