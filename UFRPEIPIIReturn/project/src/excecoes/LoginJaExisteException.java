package exceptions;

public class LoginJaExisteException extends Exception {

    private String login;

    public LoginJaExisteException(String login) {
        super("Login J� Existe");
        this.login = login;
    }

}