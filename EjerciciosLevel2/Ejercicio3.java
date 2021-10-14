package EjerciciosLevel2;

import java.util.ArrayList;

import java.util.Collections;

public class Ejercicio3 {
    public static void main(String [] args){
        ArrayList cartasArray = new ArrayList();
        cartasArray.add("2");
        cartasArray.add("3");
        cartasArray.add("4");
        cartasArray.add("5");
        cartasArray.add("6");
        cartasArray.add("7");
        cartasArray.add("8");
        cartasArray.add("9");
        cartasArray.add("10");
        cartasArray.add("J");
        cartasArray.add("Q");
        cartasArray.add("K");
        cartasArray.add("A");
        System.out.println("Inicio ordenado");
        for (int k = 0; k <cartasArray.size() ; k++) {
            System.out.println(cartasArray.get(k));
        }
        System.out.println("Fin ordenado");
        System.out.println("Inicio reverso");
        Collections.reverse(cartasArray);
        for (int i = 0; i <cartasArray.size() ; i++) {
            System.out.println(cartasArray.get(i));
        }
        System.out.println("Fin reverso");
        System.out.println("Inicio mezclado");
        Collections.shuffle(cartasArray);

        for (int j = 0; j <cartasArray.size() ; j++) {
            System.out.println(cartasArray.get(j));
        }
        System.out.println("Fin mezclado");

    }
}