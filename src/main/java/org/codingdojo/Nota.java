package org.codingdojo;

public class Nota {

    private int valor;

    public Nota(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object outraNota) {
        if (outraNota instanceof Nota)
            return this.valor == ((Nota)outraNota).valor;
        return false;
    }

    @Override
    public String toString() {
        return Integer.toString(this.valor);
    }
}