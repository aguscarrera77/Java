import java.util.Scanner;


public class logueo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String clave="1234";
        
        //declaro con el for la cantidad de veces que intentara loguearse.
        for(int intento=1;intento<=3;intento++){
            System.out.println("  Intento "  + intento +" Ingrese su clave correcta ");
            String claveIngresada=input.nextLine();
        if(claveIngresada.equals(clave)){
            System.out.println("Usted Ingreso a su perfil.");
           break; 
        }else{
            System.out.println("Clave incorrecta. Le quedan intentos " + (intento-3));
        }






        }


        input.close();






    }
}
