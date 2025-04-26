package valid;

import java.util.regex.*;

public class especial implements validador{
    @Override
    public boolean validar(String contraseña) {
        Pattern p = Pattern.compile("[^a-zA-Z0-9]");
        Matcher m = p.matcher(contraseña);
        return m.find();
    }
}

