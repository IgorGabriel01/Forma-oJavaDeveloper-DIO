public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String s) {
        super("O segundo parâmetro deve ser maior que o primeiro.");
    }
}
