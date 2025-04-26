package valid;

public class minus extends Thread {
    private String contraseña;

    public minus(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void run() {
        int count = 0;
        for (char c : contraseña.toCharArray()) {
            if (Character.isLowerCase(c)) count++;
        }
        if (count < 3) {
            System.out.println("La contraseña debe contener al menos tres letras minúsculas.");
        } else {
            System.out.println("Contiene suficientes letras minúsculas.");
        }
    }

    public boolean validar(String contraseña2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validar'");
    }
}

