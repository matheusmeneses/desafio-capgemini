

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EscadaTest{

    @Test
    public void deveCriarSeisDegrausQuandoAQuantidadeInformadaEh6(){
        Escada escada = new Escada(6);

        escada.criar();

        assertEquals(escada.getDegraus().size(), 6);
    }

    @Test
    public void deveInserirQuantidadeCorretaDeEspacosEAsteriscos(){
        Escada escada = new Escada(6);
        escada.criar();

        assertEquals(escada.getDegraus().get(0), "     *","Deve existir apenas 1 asterisco");
        assertEquals(escada.getDegraus().get(1), "    **", "Deve existir apenas 2 asterisco");
        assertEquals(escada.getDegraus().get(2), "   ***", "Deve existir apenas 3 asterisco");
        assertEquals(escada.getDegraus().get(3), "  ****", "Deve existir apenas 4 asterisco");
        assertEquals(escada.getDegraus().get(4), " *****","Deve existir apenas 5 asterisco");
        assertEquals(escada.getDegraus().get(5), "******", "Deve existir apenas 6 asterisco");
    }
}
