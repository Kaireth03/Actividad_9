package valid;

public class minus implements validador {
    @Override
    public boolean validar(String contraseña) {
        int contador = 0;
        for (char c : contraseña.toCharArray()) {
            if (Character.isLowerCase(c)) contador++;
        }
        return contador >= 3;
    }
}

