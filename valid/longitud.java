package valid;

public class longitud implements validador {
    @Override
    public boolean validar(String contraseña) {
        return contraseña.length() >= 8;
    }
}

