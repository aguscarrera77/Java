public class array {
    public static void main(String[] args) {
        String[] nombres={"Gabi","Lucas","Tiago","Fernando"};
        // como se que tamano tiene mi array?  length metodo que cuenta los elementos de mi array.
        System.out.println(nombres.length);
        System.out.println("Hay "+ nombres.length+ " alumnos en el curso de Java, que estan presentes.");
        //traigo uno de los valores del array. la manera que utilizo es por su indice.
        System.out.println(nombres[2]);//la manera que traigo un elemento del array nombrando su indice.
        int[]edades={10,20,30,60,86};
        System.out.println(edades[0]);
        System.out.println(edades.length);

        for(int i=0;i<nombres.length;i++){
            System.out.println("Alumno "+(i + 1)+":" + nombres[i]);
        }
        
        for(int i=0;i<edades.length;i++){
            System.out.println(edades[i]);
        }
    //buscar un valor especifico dentro del array con for.
    int [] numeros={3,7,9,11,15,21};
    int buscando=9;
    boolean encontrado=true;

    for(int i=0;i<numeros.length;i++){
        if(buscando==numeros[i]){
            encontrado=true;
            System.out.println("numero encontrado y esta en la posicion: "+ i);
        }
        
    }
    //for each lee los elementos que tiene los arrays pero no le importa la posicion que tiene cada uno o mejor dicho no le importa el indice.
    String[]prendas={"remera","buzo","pantalon","boxer","slip"};
    for(String prenda:prendas){
        System.out.println("Las prendas son: "+ prenda);
    
    }

    }
}


