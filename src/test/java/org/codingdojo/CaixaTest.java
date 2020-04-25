package org.codingdojo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

import org.junit.Ignore;

/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class CaixaTest {

    @Test
    public void testCalcularTrocoVazio() {
        Caixa caixa = new Caixa(new Dinheiro(30), new Dinheiro(30));
        Troco troco = caixa.calcularTroco();
        assertTrue(troco.isVazio());
    }

    @Test
    public void testCalcularTrocoUmaNotaDeUm() {
        Troco trocoExemplo = new Troco();
        trocoExemplo.adicionarNota(new Nota(1));

        Caixa caixa = new Caixa(new Dinheiro(9), new Dinheiro(10));
        Troco trocoCalculado = caixa.calcularTroco();

        assertTrue(trocoExemplo.equals(trocoCalculado));
    }

    @Test
    public void testCalcularTrocoUmaNotaDeDois() {
        Troco trocoExemplo = new Troco();
        trocoExemplo.adicionarNota(new Nota(2));

        Caixa caixa = new Caixa(new Dinheiro(8), new Dinheiro(10));
        Troco trocoCalculado = caixa.calcularTroco();

        assertTrue(trocoExemplo.equals(trocoCalculado));
    }
}