import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.print("Ingrese una contraseña a validar: ");
            String contraseña = scanner.nextLine();

            Thread validador = new Validador(contraseña);
            validador.start();

            try {
                validador.join(); // Espera a que el hilo termine antes de continuar
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print("\n¿Desea ingresar otra contraseña? (s/n): ");
            respuesta = scanner.nextLine().toLowerCase();
        } while (respuesta.equals("s"));

        System.out.println("Gracias por usar el validador de contraseñas.");
        scanner.close();
    }
}
