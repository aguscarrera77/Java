public class array {
    public static void main(String[] args) {
        String[] nombres={"Gabi","Lucas","Tiago","Fernando"};
        // como se que tamano tiene mi array?  length metodo que cuenta los elemenos de mi array.
        System.out.println(nombres.length);
        System.out.println("Hay "+ nombres.length+ " alumnos en el curso de Java, que estan presentes.");
        //traigo uno de los valores del array. la manera que utilizo es por su indice.
        System.out.println(nombres[2]);
        int[]edades={10,20,30,60,86};
        System.out.println(edades.length);

        
    }
}
