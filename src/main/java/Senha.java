import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senha {

    private final String valor;

    public Senha(String valor){
        this.valor = valor;
    }

    public Boolean validar(){
        return valor.length() > 6
                && temDigito()
                && temLetraMinuscula()
                && temLetraMaiuscula()
                && temCaracterEspecial();

    }

    private Boolean temDigito(){
        Pattern pattern = Pattern.compile("[\\d]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(this.valor);

        return matcher.find();
    }

    private Boolean temLetraMinuscula(){
        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher matcher = pattern.matcher(this.valor);

        return matcher.find();
    }

    private Boolean temLetraMaiuscula(){
        Pattern pattern = Pattern.compile("[A-Z]+");
        Matcher matcher = pattern.matcher(this.valor);

        return matcher.find();
    }

    private Boolean temCaracterEspecial(){
        Pattern pattern = Pattern.compile("[!@#$%^&*()\\-+]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(this.valor);

        return matcher.find();
    }
}
