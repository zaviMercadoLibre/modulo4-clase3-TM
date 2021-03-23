package ejercicio1;

public class PasswordMedio extends Password{
    public PasswordMedio(String regExp) {
        super(regExp);
    }

    public static void main(String[] args) {
        String regExp = "^(?=.*[a-zA-Z]).{8,}";
        Password pass = new PasswordMedio(regExp);
        pass.setValue("Lalala1234");
    }
}
