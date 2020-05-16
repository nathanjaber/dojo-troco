package org.codingdojo;

import static org.junit.Assert.*;

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


}