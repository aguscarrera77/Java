//ArrayList: es que guarda elementos sin definir cuantos son desde un principio.Crece solo, se pueden borrar elementos y se pueden agregar. Tienen orden con indice.
// Array list  con string

import java.util.ArrayList;




public class arrrayList {
    public static void main(String[] args) {
        ArrayList<String> nombres= new ArrayList<>();
        nombres.add("Agustin");
        nombres.add("Gabi");
        nombres.add("Ariel");

        for(String n:nombres){
            System.out.println(n);
        }

    }
    
}
