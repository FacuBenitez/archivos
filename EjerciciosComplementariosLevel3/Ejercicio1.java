package EjerciciosComplementariosLevel3;

import java.util.*;
public class Ejercicio1 {
    
    public static void main(String[] args) {

        List<String> palabras = new ArrayList<>();
        palabras.add("Buenos dias");
        palabras.add("Buenas tardes");
        palabras.add(null);
        palabras.add("Hola mundo");

    
        System.out.println(palabras);
        palabras.removeAll(Arrays.asList("", null));
        System.out.println(palabras);

    }
}