public class Autos {
    private String marca;
    private boolean encendido;

public Autos(String marca){
    this.marca=marca;
    this.encendido=false;}
public void encender(){
    encendido=true;
    System.out.println(marca + encendido);


}
    
}
