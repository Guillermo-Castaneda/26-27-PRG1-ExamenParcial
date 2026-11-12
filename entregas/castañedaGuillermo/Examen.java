import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Examen parcial PRG1");
        System.out.println("Dígame su edad");
        int edad = scanner.nextInt();

        if (  edad < 18) {
            System.out.println("Usted es menor de edad");
        } else {
            System.out.println("Usted es mayor de edad");
        }

    }
}