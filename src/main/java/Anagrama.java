
import java.util.HashSet;
import java.util.Set;

public class Anagrama {

    private final char [] palavra;


    public Anagrama(String palavra) {
        this.palavra = palavra.toCharArray();
    }

    public Integer gerar(){

        Set<Integer> posicaoCaracterRepetido = new HashSet<>();

        int contadorAnagrama = 0;

        for(int aux = 0; aux < this.palavra.length; aux++){
            for (int i = 0; i < this.palavra.length; i ++){

                boolean caracterRepetido = aux != i && this.palavra[aux] == this.palavra[i];

                if (caracterRepetido && !posicaoCaracterRepetido.contains(i)){

                    // Caso a lista com caracteres repetidos esteja vazia ou o caracter ainda esteja presente nela
                    // significa que podemos conta-ló como caracter repetido então adiconamos um na contagem
                    // de anagramas pares.
                    if (posicaoCaracterRepetido.isEmpty()) {
                        contadorAnagrama++;
                    } else {
                        for(Integer posicao : posicaoCaracterRepetido){
                            if (! (this.palavra[posicao] == this.palavra[i])){
                                contadorAnagrama++;
                                break;
                            }
                        }
                    }

                    posicaoCaracterRepetido.add(aux);
                    posicaoCaracterRepetido.add(i);

                    boolean temCaracteresEntreIndicesCaracteresRepetido = (aux - i) > 1 || (i-aux) > 1;

                    if (temCaracteresEntreIndicesCaracteresRepetido) {
                        contadorAnagrama++;
                    }

                }
            }
        }


        return contadorAnagrama;
    }
}
