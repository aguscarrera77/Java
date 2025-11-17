import java.util.Scanner;

public class nombre {
    public static void main(String[] args) {
        String[]nombres={"Ana","Carlos","Roberto","Mateo","Julieta"};
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un nombre completo: ");
        String buscado=sc.nextLine();
        boolean encontrado= false;
        for(int i=0; i<nombres.length;i++){
            if(nombres[i].equalsIgnoreCase(buscado)){
                encontrado=true;
                break;
               }
        }
        if(encontrado){
            System.out.println("Coincide el nombre ingresado con el guardado.");

        }else{System.out.println("Nombre no encontrado.");}





        
    }
}
