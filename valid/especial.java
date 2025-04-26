package valid;

public class especial extends Thread {
    private String contraseña;

    public especial(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void run() {
        if (!contraseña.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            System.out.println("La contraseña debe contener al menos un carácter especial.");
        } else {
            System.out.println("Contiene al menos un carácter especial.");
        }
    }

    public boolean validar(String contraseña2) {
        
        throw new UnsupportedOperationException("Unimplemented method 'validar'");
    }
}

