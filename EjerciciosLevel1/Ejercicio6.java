import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        int base;
        int exponente;
        int resultado = 1;

        Scanner potencia = new Scanner(System.in);
        System.out.println("Introduzca la base: ");
        base = potencia.nextInt();
        potencia.nextLine();
        System.out.println("Introduzca el exponente: ");
        exponente = potencia.nextInt();
        potencia.nextLine();
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        System.out.println(resultado);
    }

}
