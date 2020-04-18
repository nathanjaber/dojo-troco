package org.codingdojo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class CaixaTest {

    static class FakeTroco implements Troco {
        public List<Nota> notas = new List<Nota>();

        @Override
        public void adicionarNota(Nota nota) {
            this.notas.add(nota);
        }
    }

    static class FakeFactory implements TrocoFactory {
        @Override
        public Troco newInstance() {
            // TODO Auto-generated method stub
            return new FakeTroco();
        }
    }

    @Test
    public void testCalcularTrocoVazio() {
        TrocoFactory fakeFactory = new CaixaTest.FakeFactory();

        Caixa caixa = new Caixa(new Dinheiro(30), new Dinheiro(30), fakeFactory);
        // List<Nota> troco = caixa.calcularTroco();
        Troco troco = caixa.calcularTroco();
        assertTrue(troco.isVazio());
    }

    @Test
    public void testCalcularTrocoUm() {
        TrocoFactory fakeFactory = new CaixaTest.FakeFactory();

        Caixa caixa = new Caixa(new Dinheiro(9), new Dinheiro(10), fakeFactory);
        Troco trocoCalculado = caixa.calcularTroco();

        //assertEquals(trocoDeExemplo, trocoCalculado);
    }
}