package EjerciciosLevel1;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.print("Digite un numero:");

        num =scan.nextInt();
        scan.close();
        
        for (int i = 0; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(""+j);

            }

            System.out.println();
        }


    }


}
