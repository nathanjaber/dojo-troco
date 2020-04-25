package org.codingdojo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NotaTest {

    @Test
    public void testEquals() {
        Nota nota1 = new Nota(1);
        Nota nota2 = new Nota(1);
        assertTrue(nota1.equals(nota2));
    }
}