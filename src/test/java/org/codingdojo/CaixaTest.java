package org.codingdojo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class CaixaTest {
    @Test
    public void testCalcularTrocoVazio() {
        Caixa caixa = new Caixa(new Dinheiro(30), new Dinheiro(30));
        // List<Nota> troco = caixa.calcularTroco();
        Troco troco = caixa.calcularTroco();
        assertTrue(troco.isVazio());
    }
}