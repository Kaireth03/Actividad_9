package valid;

public class mayus extends Thread {
    private String contraseña;

    public mayus(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void run() {
        int count = 0;
        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) count++;
        }
        if (count < 2) {
            System.out.println("La contraseña debe contener al menos dos letras mayúsculas.");
        } else {
            System.out.println("Contiene suficientes letras mayúsculas.");
        }
    }

    public boolean validar(String contraseña2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validar'");
    }
}

