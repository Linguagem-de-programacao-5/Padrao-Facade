import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    void deveRetornarClienteComInviviabilidadeSerasa(){
        Cliente cliente = new Cliente("Junior", "213.234.332-33");
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setCliente(cliente);
        Serasa.getSerasa().addClienteInadimplente(cliente);

        assertEquals("Cliente possui inviabilidade no Serasa!", contaBancaria.validarCliente());
    }

    @Test
    void deveRetornarClienteComInviviabilidadeSpc(){
        Cliente cliente = new Cliente("Junior", "213.234.332-33");
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setCliente(cliente);
        SPC.getSpc().addClienteInadimplente(cliente);

        assertEquals("Cliente possui inviabilidade no SPC!", contaBancaria.validarCliente());
    }

    @Test
    void deveRetornarClienteAdimplente(){
        Cliente cliente = new Cliente("Junior", "213.234.332-33");
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setCliente(cliente);

        assertEquals("Cliente adimplente nas bases do SPC e Serasa!", contaBancaria.validarCliente());
    }
}