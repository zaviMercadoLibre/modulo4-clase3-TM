package ejercicio1;

public class PasswordDebil extends Password{
    public PasswordDebil(String regExp) {
        super(regExp);
    }

    public static void main(String[] args) {
        String regExp = "^.{8,}";
        Password pass = new PasswordDebil(regExp);
        pass.setValue("contraseña");
    }
}
