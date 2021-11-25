package EjerciciosLevel1;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int factorial = 1;

        System.out.println("Ingrese dos digitos:");


        numero = scanner.nextInt();
        int numero1 = numero;

        while( numero != 0){

            factorial *= numero;

            numero --;


        }

        System.out.println("El factorial del numero "+numero1 +" 5es "+factorial);



    }
}
