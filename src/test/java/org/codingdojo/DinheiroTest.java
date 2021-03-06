package org.codingdojo;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class DinheiroTest {

    @Test
    public void testSubtrairRetornandoZero() {
        Dinheiro diferenca = new Dinheiro(11).subtrair(new Dinheiro(11));
        assertTrue(diferenca.equals(new Dinheiro(0)));
    }

    @Test(expected = RuntimeException.class)
    public void testSubtrairFalhandoAoRetornarNegativo() {
        new Dinheiro(11).subtrair(new Dinheiro(12));
    }

    @Test
    public void testSubtrairRetornandoMaiorQueZero() {
        Dinheiro diferenca = new Dinheiro(12).subtrair(new Dinheiro(11));
        assertTrue(diferenca.equals(new Dinheiro(1)));
    }

    @Test
    public void testConverterParaUmaNotaDeUm () {
        List<Nota> notas = new Dinheiro(1).converterParaNotas();
        assertTrue(notas.get(0).equals(new Nota(1)));
        assertTrue(notas.size() == 1);
    }

    @Test
    public void testConverterParaUmaNotaDeDois () {
        List<Nota> notas = new Dinheiro(2).converterParaNotas();
        assertTrue(notas.get(0).equals(new Nota(2)));
        assertTrue(notas.size() == 1);
    }

    @Test
    public void testConverterParaUmaNotaDeCinco() {
        List<Nota> notas = new Dinheiro(5).converterParaNotas();
        assertTrue(notas.get(0).equals(new Nota(5)));
        assertTrue(notas.size() == 1);
    }

    @Test
    public void testConverterParaUmaNotaDeDez() {
        List<Nota> notas = new Dinheiro(10).converterParaNotas();
        assertTrue(notas.get(0).equals(new Nota(10)));
        assertTrue(notas.size() == 1);
    }

    @Test
    public void testConverterTresDinheirosEmNotas() {
        List<Nota> notas = new Dinheiro(3).converterParaNotas();
        assertTrue(notas.size() == 2);
        assertTrue(notas.contains(new Nota(1)));
        assertTrue(notas.contains(new Nota(2)));
    }
}