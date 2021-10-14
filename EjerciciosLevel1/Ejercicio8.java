
import java.util.Scanner;

public class Ejercicio8 {
   public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        byte edad = entrada.nextByte();
        entrada.nextLine();
        System.out.println("¿Cual es su direccion?: ");
        String direccion = entrada.nextLine();
        System.out.println("¿Cual es su ciudad?: ");
        String ciudad = entrada.nextLine();

        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombre);
    }
}