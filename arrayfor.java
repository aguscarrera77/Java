//Voy a pedirle al usuario que me ponga 5 numeros. Los guardo en un array y saco promedio.

public class arrayfor {
    public static double calcularPromedio(int[]array){
        int suma=0;
        for(int i=0;i<=array.length;i++){
        suma+=array[i];
        }
        return (double)suma/array.length;


    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] number= new int[5];
}

    

    
}
