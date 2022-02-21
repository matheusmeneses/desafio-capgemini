import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SenhaTest {

    @Test
    public void deveRetornarFalseQuandoPossuirMenosDeSeisDigitos(){
       Senha senha = new Senha("Ca3$");

       boolean valida = senha.validar();

       assertFalse(valida);
    }

    @Test
    public  void deveRetornarFalseQuandoNaoPossuirNoMinimoUmDigito(){
        Senha senha = new Senha("Esperanca$");

        boolean valida = senha.validar();

        assertFalse(valida);
    }

    @Test
    public void deveRetornarFalseQuandoNaoPossuirLetraMinuscula(){
        Senha senha = new Senha("MINUSCULA3$");

        boolean valida = senha.validar();

        assertFalse(valida);
    }

    @Test
    public void deveRetornarFalseQuandoNaoPossuirLetraMaiuscula(){
       Senha senha = new Senha("maiuscula3$");

       boolean valida = senha.validar();

       assertFalse(valida);
    }

    @Test
    public void deveRetornarFalseQuandoNaoPossuirCaracterEspecial(){
        Senha senha = new Senha("Maiuscula3");

        boolean valida = senha.validar();

        assertFalse(valida);
    }

    @Test
    public void deveRetornarTrueQuandoTodosOsCriteriosEstiveremCorretos(){
       Senha senha = new Senha("Maiuscula3$");

       boolean valida = senha.validar();

       assertTrue(valida);
    }

}
