// Programacion orientada a objetos.
//Clases molde o plantilla para crear objetos.
//objeto es lo real, son los atributos con sus valores.


public class Estudiantes {
    //Atributos.ej datos del estudiantes.
    private String nombre;
    private String apellido;
    private int edad;

    //Constructor:como crear el perfil de un estudiante con sus datos. Mismo nombre que la clase.

    public Estudiantes(String nombre,String apellido,int edad){
        this.nombre=nombre;//this.nombre es este objeto tiene como atributo el nombre.
        this.apellido=apellido;
        this.edad=edad;
}
// Metodo es una accion que puede ser en este caso el estudiante.

    public void saludar(){
        System.out.println("Hola soy  " + nombre + " " + apellido + "  y tengo "+ edad);
} 
}
