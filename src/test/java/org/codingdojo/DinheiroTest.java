package org.codingdojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DinheiroTest {
    
    @Test
    public void testSubtrair() {
        Dinheiro diferenca = new Dinheiro(11).subtrair(new Dinheiro(11));
        assertTrue(diferenca.equals(new Dinheiro(0)));
    }
}