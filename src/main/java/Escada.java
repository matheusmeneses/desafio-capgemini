import java.util.ArrayList;
import java.util.List;

public class Escada {

    public Escada(Integer quantidadeDegraus){

        this.quantidadeDegraus = quantidadeDegraus;

    }

    private final Integer quantidadeDegraus;

    private final List<String> degraus = new ArrayList<>();

    public List<String> getDegraus() {
        return degraus;
    }


    public void criar(){
        for( int asterisco = 1; asterisco <= this.quantidadeDegraus; asterisco++) {
            Integer espaco = this.quantidadeDegraus - asterisco;
            criarDegrau(espaco,asterisco);
        }
    }

    private void criarDegrau(Integer espaco, Integer asterisco){
        String degrau = "";

        for(int caracter = 1; caracter <= espaco; caracter++) {
            degrau = degrau + " ";
        }

        for(int caracter = 1; caracter <= asterisco; caracter++) {
            degrau = degrau + "*";
        }

        this.degraus.add(degrau);

        System.out.println(degrau);
    }



}


