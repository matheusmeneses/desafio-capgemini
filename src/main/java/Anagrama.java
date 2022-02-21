import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Anagrama {

    private final char [] palavra;


    public Anagrama(String palavra) {
        this.palavra = palavra.toCharArray();
    }

    public Integer gerar(){
        /**
         * Banana
         * [B,a,n,a,n,a]
         */
        Set<String> anagramas = new HashSet<>();

        int contadorAnagrama = 0;

        for(int aux = 0; aux < this.palavra.length; aux ++){
            for (int i = 0; i < this.palavra.length; i ++){
                if (aux != i && this.palavra[aux] == this.palavra[i]){
                    // Toda vez que temos um caracter repetido adiciona 1 anagrama.
                    contadorAnagrama += contadorAnagrama + 1;
                    anagramas.add(String.valueOf(this.palavra[aux]));
                    anagramas.add(String.valueOf(this.palavra[i]));

                    if (aux < i){
                        String.valueOf(this.palavra).substring(aux, i);
                    }
                }
            }
        }


        return contadorAnagrama;
    }
}
