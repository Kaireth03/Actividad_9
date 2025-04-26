package valid;

public class num implements validador {
    @Override
    public boolean validar(String contraseña) {
        return contraseña.matches(".*\\d.*");
    }
}

