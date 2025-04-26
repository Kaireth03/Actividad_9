package valid;

public class num extends Thread {
    private String contraseña;

    public num(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void run() {
        if (!contraseña.matches(".*\\d.*")) {
            System.out.println("La contraseña debe contener al menos un número.");
        } else {
            System.out.println("Contiene al menos un número.");
        }
    }

    public boolean validar(String contraseña2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validar'");
    }
}

