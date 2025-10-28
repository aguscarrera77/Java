//operadores logicos AND OR NOT
// 1 EJERCICO SERA EL USUARIO MAYOR A 18 AÑOS Y QUE SEA ESTUDIANTE.


public class operadores {
    public static void main(String[] args) {
        int edad=15;
        boolean estudiante=false;
        
        boolean estudiante_acceso=(edad>=18 && estudiante);
        System.out.println("Usted esta autorizado a ver su perfil "+ estudiante_acceso);

        //usamos operador or ||. Comprar o usar un cupon.

        double precio=130;
        boolean cupon=true;
        boolean aplicar_Descuento=(precio>120 || cupon);
        System.out.println("Aplicar cupon "+ aplicar_Descuento);





        boolean lluvia=false;
        boolean salir=!lluvia;//lluvia arranca en false ahora en salir !lluvia es true.
        System.out.println("Puede salir? " + salir);
       
    
    
    
    
    }

    
    
}
