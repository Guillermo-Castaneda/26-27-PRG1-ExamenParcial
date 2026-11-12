import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Examen parcial PRG1");
        System.out.println("Dígame su edad");
        int edad = scanner.nextInt();

        if (edad < 17 || edad > 70) {
            System.out.println("Edad invalidada, vuelva a poner su edad");
        } else if (edad < 18) {
            System.out.println("Usted es menor de edad");
        } else {
            System.out.println("Usted es mayor de edad");
        }

        System.out.println ("dígame el número de asginaturas en las que está matriculado");
        int numeroAsignaturas = scanner.nextInt();
        
        if (numeroAsignaturas < 1 || numeroAsignaturas > 10) {
            System.out.println("Número de asignaturas invalidado, vuelva a poner el número de asignaturas");
        } else {
            System.out.println("Usted está matriculado en " + numeroAsignaturas + " asignaturas");
        }
    }

}