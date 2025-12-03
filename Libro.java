public class Libro {
    private String titulo;
    private String autor;
    private int edicion;

    public Libro(String titulo,String autor,int edicion){
        this.titulo=titulo;
        this.autor=autor;
        this.edicion=edicion;
    }

    public String getautor(){
        return autor;
    }
    public void mostrarInfo(){
        System.out.println(titulo+"("+autor+")");
    }
    
}
