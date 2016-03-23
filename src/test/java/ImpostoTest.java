//import br.com.caelum.blog.jenkins.Imposto;
//import br.com.caelum.blog.jenkins.Orcamento;
import static org.junit.Assert.*;
//package br.com.caelum.blog.jenkins;
//import static org.junit.Assert.assertEquals;

/**
 *
 * @author RODOLFO ROCHA
 */
import org.junit.Test;

import src.jenkins.Imposto;
import src.jenkins.Orcamento;

public class ImpostoTest {

    @Test
    public void deveCalcularImpostoDeDezPorCento() {
        Orcamento orcamento = new Orcamento(100.0);
        Imposto imposto = new Imposto();
        assertEquals(10.0, imposto.calcula(orcamento), Double.MIN_VALUE);
    }
}
