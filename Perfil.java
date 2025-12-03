public class Perfil {
    private String nombre;
    private int edad;

    public Perfil(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public void mostrarPerfil(){
        System.out.println("Usuario "+ nombre + "-"+ edad);
    }
}
