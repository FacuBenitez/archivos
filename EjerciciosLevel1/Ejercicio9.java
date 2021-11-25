package EjerciciosLevel1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[]arg){
        Scanner countText = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String texto = countText.nextLine();
        System.out.println("¿Qué caracter desea encontrar en el texto?: ");
        String encontrarText = countText.nextLine();
        System.out.println("La cantidad de "+ " '" + encontrarText + "'"+ " presentes en la palabra es");
        System.out.println(texto.split(encontrarText, -1).length-1);
    }

}