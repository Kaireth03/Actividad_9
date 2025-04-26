import valid.especial;
import valid.longitud;
import valid.mayus;
import valid.minus;
import valid.num;

public class Validador extends Thread {
    private final String contraseña;

    public Validador(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void run() {
        boolean valida = new longitud(contraseña).validar(contraseña)
                        && new especial(contraseña).validar(contraseña)
                        && new mayus(contraseña).validar(contraseña)
                        && new minus(contraseña).validar(contraseña)
                        && new num(contraseña).validar(contraseña);

        System.out.println("Contraseña: \"" + contraseña + "\" es " + (valida ? "valida " : "invalida "));
    }
}

