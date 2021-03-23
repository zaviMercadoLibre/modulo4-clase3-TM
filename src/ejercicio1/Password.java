package ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    public String password;
    private String regexExpression;

    public Password(String regexExpression){
        super();

        this.regexExpression = regexExpression;
    }

    public void setValue(String password) {
        Pattern p = Pattern.compile(this.regexExpression);
        Matcher m = p.matcher(password);
        try {
            if (m.matches()) {
                this.password= password;
                System.out.println("contraseña creada correctamente");

                //System.out.println("La contraseña no cumple con los requerimientos necesarios");
            }else {
                throw new Exception();
            }
            }catch(Exception ex){
                ex.printStackTrace();
            }

        }
}
