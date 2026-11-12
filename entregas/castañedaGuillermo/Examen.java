import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Examen parcial PRG1:");
        System.out.println("Dígame su edad");
        int edad = scanner.nextInt();

        if (edad < 17 || edad > 70) {
            System.out.println("Edad invalidada, vuelva a poner su edad");
        } else if (edad < 18) {
            System.out.println("Usted es menor de edad");
        } else {
            System.out.println("Usted es mayor de edad");
        }

        System.out.println ("Dígame el número de asginaturas en las que está matriculado");
        int numeroAsignaturas = scanner.nextInt();
        
        if (numeroAsignaturas < 1 || numeroAsignaturas > 10) {
            System.out.println("Número de asignaturas invalidado, vuelva a poner el número de asignaturas");
        } else {
            System.out.println("Usted está matriculado en " + numeroAsignaturas + " asignaturas");
        }
        System.out.println("Nota de asignatura 1:");
        int notaAsignatura1 = scanner.nextInt();
        System.out.println("Nota de asignatura 2:");
        int notaAsignatura2 = scanner.nextInt();
        System.out.println("Nota de asignatura 3:");
        int notaAsignatura3 = scanner.nextInt();
        System.out.println("Nota de asignatura 4:");
        int notaAsignatura4 = scanner.nextInt();
        System.out.println("Nota de asignatura 5:");
        int notaAsignatura5 = scanner.nextInt();
        System.out.println("Nota de asignatura 6:");
        int notaAsignatura6 = scanner.nextInt();
        System.out.println("Nota de asignatura 6:");
        int notaAsignatura7 = scanner.nextInt();
        System.out.println("Nota de asignatura 8:");
        int notaAsignatura8 = scanner.nextInt();
        System.out.println("Nota de asignatura 9:");
        int notaAsignatura9 = scanner.nextInt();
        System.out.println("Nota de asignatura 10:");
        int notaAsignatura10 = scanner.nextInt();
    }

}