package EjerciciosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {
        List<String> estudiante = new ArrayList<>();
        estudiante.add("Marcos");
        estudiante.add("Facundo");
        estudiante.add("Jose");
        estudiante.add("Fabrizio");
        estudiante.add("Mariana");
        estudiante.add("Aldana");
        estudiante.add("Marcelo");
        estudiante.add("Macarena");
        estudiante.add("Maria");
        estudiante.add("Juan carlos");
        estudiante.add("Jose");
        estudiante.add("Lorena");

        List<String> clase1 = estudiante.subList(0, 4);
        List<String> clase2 = estudiante.subList(4, 8);
        List<String> clase3 =estudiante.subList(8, 12);

        System.out.println(".............................");
        System.out.println("Clase 1");
        System.out.println(".............................");

        for (String cl1 : clase1) {

            System.out.println(cl1);

        }

        System.out.println(".............................");
        System.out.println("Clase 2");
        System.out.println(".............................");

        for (String cl2 : clase2) {

            System.out.println(cl2);

        }


        System.out.println(".............................");
        System.out.println("Clase 3");
        System.out.println(".............................");

        for (String cl3 : clase3) {

            System.out.println(cl3);
        }
    }
}
