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
        boolean valida = new longitud().validar(contraseña)
                        && new especial().validar(contraseña)
                        && new mayus().validar(contraseña)
                        && new minus().validar(contraseña)
                        && new num().validar(contraseña);

        System.out.println("Contraseña: \"" + contraseña + "\" es " + (valida ? "válida ✅" : "inválida ❌"));
    }
}

