import java.util.Scanner;

import valid.especial;
import valid.longitud;
import valid.mayus;
import valid.minus;
import valid.num;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la contraseña a validar: ");
        String password = scanner.nextLine();

        Thread validador1 = new longitud(password);
        Thread validador2 = new especial(password);
        Thread validador3 = new mayus(password);
        Thread validador4 = new minus(password);
        Thread validador5 = new num(password);

        validador1.start();
        validador2.start();
        validador3.start();
        validador4.start();
        validador5.start();

        try {
            validador1.join();
            validador2.join();
            validador3.join();
            validador4.join();
            validador5.join();
        } catch (InterruptedException e) {
            System.out.println("Error al esperar los hilos: " + e.getMessage());
        }

        System.out.println("\nValidación completa.");
    }
}
