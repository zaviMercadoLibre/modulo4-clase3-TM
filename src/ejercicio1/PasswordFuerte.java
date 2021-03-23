package ejercicio1;

public class PasswordFuerte extends Password {

    public PasswordFuerte(String regExp) {
        super(regExp);
    }

    public static void main(String[] args) {

        String regExp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])([A-Za-z\\d$@$!%*?&]|[^ ]){8,15}$";

        Password pass = new PasswordFuerte(regExp);
        pass.setValue("Argentin@2021");
    }
}