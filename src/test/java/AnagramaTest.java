import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramaTest {

    @Test
    public void deveRetonarTresQuandoAPalavraEhifailuhkqq(){
        Anagrama ana = new Anagrama("ifailuhkqq");

        Integer quantidade = ana.gerar();

        assertEquals(quantidade, 3);
    }


    @Test
    public void deveRetonarDoisQuandoAPalavraEhOvo(){
        Anagrama ana = new Anagrama("ovo");

        Integer quantidade = ana.gerar();

        assertEquals(quantidade, 2);
    }
}
