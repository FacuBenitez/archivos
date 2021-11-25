package EjerciciosComplementariosLevel3;
import java.util.*;
import java.time.*;

public class Ejercicio5{
    public String apellido;
    public String nombre;
    public LocalDate fechaDeNacimiento;
   
   
   public Ejercicio5(String apellido, String nombre, LocalDate fechaDeNacimiento) {
       this.apellido = apellido;
       this.nombre = nombre;
       this.fechaDeNacimiento = fechaDeNacimiento;
   }
   
       //Metodo Main
      public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         String nombre;
   
         Ejercicio5 a1= new Ejercicio5("Ryan", "Reynolds", LocalDate.of(1987, 03, 15));
         Ejercicio5 a2= new Ejercicio5("Tom", "Holland", LocalDate.of(1984, 06, 25));
         Ejercicio5 a3= new Ejercicio5("Facundo", "Benitez", LocalDate.of(1990, 03, 18));
         Ejercicio5 a4= new Ejercicio5("Toby", "Maguire", LocalDate.of(1984, 12, 15));
         Ejercicio5 a5= new Ejercicio5("Andrew", "Garfield", LocalDate.of(1980, 07, 17));
   
         
          Map<String,LocalDate> alumnos = new HashMap<String,LocalDate>();
          
   
          alumnos.put(a1.apellido+" "+a1.nombre, a1.fechaDeNacimiento);
          alumnos.put(a2.apellido+" "+a2.nombre, a2.fechaDeNacimiento);
          alumnos.put(a3.apellido+" "+a3.nombre, a3.fechaDeNacimiento);
          alumnos.put(a4.apellido+" "+a4.nombre, a4.fechaDeNacimiento);
          alumnos.put(a5.apellido+" "+a5.nombre, a5.fechaDeNacimiento);
   
          System.out.println("Digite el apellido y nombre del alumno:");
          nombre = scan.nextLine();
   
          System.out.println(nombre+": "+alumnos.get(nombre));
      }
   }