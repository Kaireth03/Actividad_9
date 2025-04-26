package valid;

public class longitud extends Thread {
    private String contraseña;

    public longitud(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void run() {
        if (contraseña.length() < 8) {
            System.out.println("La contraseña es muy corta. Debe tener al menos 8 caracteres.");
        } else {
            System.out.println("Longitud válida.");
        }
    }

    public boolean validar(String contraseña2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validar'");
    }
}

