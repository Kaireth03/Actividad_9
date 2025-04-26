public class Validador extends Thread {
    private final String contraseña;

    public Validador(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void run() {
        boolean valida = new LongitudValidador().validar(contraseña)
                        && new EspecialValidador().validar(contraseña)
                        && new MayusculasValidador().validar(contraseña)
                        && new MinusculasValidador().validar(contraseña)
                        && new NumerosValidador().validar(contraseña);

        System.out.println("Contraseña: \"" + contraseña + "\" es " + (valida ? "válida ✅" : "inválida ❌"));
    }
}

