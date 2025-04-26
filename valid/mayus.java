package valid;

public class mayus implements validador {
    @Override
    public boolean validar(String contraseña) {
        int contador = 0;
        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) contador++;
        }
        return contador >= 2;
    }
}

