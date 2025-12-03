public class Alumno {
    private String nombre;
    private int nota;
    
    public Alumno(String nombre,int nota){
    this.nombre=nombre;
    this.nota=nota;
    }
    public String getnombre(){
    return nombre;
    }
    public int getnota(){
    return nota;
    }
    public void mostrarAlumno(){

    System.out.println("Nombre: " + nombre);
    System.out.println("Nota: " + nota);

    }

}

