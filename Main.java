public class Main {
    public static void main(String[] args) {
        String[] contraseñas = {
            "Abc123!@#", "AAaa11@@", "Short1!", "Aa1!", "ABCdef12#", "aA1!", "AAabc123@", "Valid1!Password"
        };

        for (String contraseña : contraseñas) {
            Thread validador = new Validador(contraseña);
            validador.start();
        }
    }
}
