//metodo:en java a la funciones se les llama modulos.modulo es un blque de codigo que realiza una tarea. Que son reutilizables.


public class funcion {
    public static void saludar(){
        System.out.println("Hola a todos soy un metodo de java.");
    }
    //modulo con parametros.
    public static void saludarNombre(String nombre){
        System.out.println("hola "+ nombre +" como estas?");

    }

    public static void main(String[] args) {
        saludar();
        saludar();
        saludarNombre("Agustin");
        saludarNombre("Diego");
    }

}
