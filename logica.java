//if(!permiso) //si no tiene permiso.
//if(!activo) // si no esta activo.
//if(!aprobado) // si no esta aprobado.

// armar un loggeo en donde sino acepta los terminos no puedo entrar al perfil.
public class logica {

    public static void main(String[] args) {
        boolean acepto_condiciones=false;// no acepta las condicones.
        if(!acepto_condiciones){//si no acepta las condiciones.
            System.out.println("Sino acepta las condiciones no puedo entrar al sitio.");}
        else{
            System.out.println("Bienvenido.");
        }

        //voy a ejecutar un programa cuanto el usuario no esta conectado.

        boolean conectado=true; //no esta conectado.
        if(!conectado){
            //si no esta conectado....
            System.out.println("Ejecuto el programa");

        }

        //el usuario entra a su perfil si tiene permiso o esta logueado. 

        boolean tienePermiso=true;//tiene permiso.
        boolean logueado=true;//no esta logueado.
        if(!tienePermiso || !logueado){
            //si no tiene permiso o no esta logueado.
         System.out.println("Acceso denegado.");
        }
        else{System.out.println("Acceso admitido.");}

        // Registro de un usuario. Tiene que ser mayor a 18 y aceptar los terminos.
        // Condicion1= edad > 18 anos.
        //Condicion2= aceptarTerminos....true
        // para que las dos condiciones se cumplan uso el conector and.

        int edad= 17;
        boolean aceptarTerminos=true;

        if(edad>=18 && aceptarTerminos){
            System.out.println("Usted esta registrado");}
        else if(edad<18 && aceptarTerminos  ){
            System.out.println("Debes ser mayor a 18.");
        }
        else{System.out.println("Debe aceptar las condiciones.");}
       //App de compras: usuario solo puede puede prendas que estan en stock.
       //si es miembro de la comunidad tiene descuento.
    //Condicion1: stock>0.
    //condicio2: que sea miembro booleano true.

    int stock=10;
    boolean miembro=false;

    if(stock>0){
        System.out.println("Puede terminar la compra.");
    
        if(miembro){
            System.out.println("Se aplica descuento por membresia.");
        }
        else{System.out.println("Se pierde un descuento por no ser miembro.");}
    }else{
        System.out.println("No hay stock.");
    }






        
    }
}