//ciclo for es un bucle de progamacion que dara tantas vuelta como la condicion sea verdadera.
//sintaxis for(inicio;condicion;contador)



public class ciclofor {
    public static void main(String[] args) {
       int suma=6;
      
    for(int i=0;i<10;i++){
        System.out.println(suma +"x"+i+"="+(suma*i));
    
    }
//cuanto dinero ahorra pro semana.
    int ahorroSemanal=500;//ahorro que hace por semana y es el contador del ciclo.
    int total=0;
    for(int semana=1;semana<=12;semana++){
        total +=ahorroSemanal;
        System.out.println("Semana"+semana+ " Ahorraste: $"+ total);
    }
    System.out.println("Ahorraste en 12 semanas el total de: $"+ total);
//Simular como funciona un ascensor. 
System.out.println("El ascensor sube:");
for(int piso=1;piso<=5;piso++){
    System.out.println("Subio al piso: "+ piso);
}
System.out.println("El ascensor baja: ");
for(int piso=5;piso>=1;piso--){
    System.out.println("El ascensor baja "+ piso);
}

System.out.println("El ascensor esta en planta baja.");

//Cuantos intentos puede tener para loguearse a un perfil.Al cuarto intento se traba el logueo.
 String clave="meli1234";

for(int intento=1;intento<=3;intento++){
    System.out.println(" Itento "+ intento+" ingresando su clave.");
    if(intento<3){
        System.out.println("Clave incorrecta");
    }else{System.out.println("Clave Correcta.");}

//for controla los intentos.
// if anidado dentro del for genera la condicion del logueo.





}

}}
