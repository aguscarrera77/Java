public class Perfiles {
    private String nombre;
    private String apellido;
    private int nota;
    
    public Perfiles(String nombre,String apellido,int nota){
        this.nombre=nombre;
        this.apellido=apellido;
        this.nota=nota;
    }
    public void mostrarNota(){
        System.out.println("Nombre: "+nombre+"-Apellido: "+apellido+ "-Nota: "+nota);
    }

}
