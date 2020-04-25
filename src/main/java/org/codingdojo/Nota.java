package org.codingdojo;

public class Nota {

    private int valor;

    public Nota(int valor) {
        this.valor = valor;
    }

    public boolean equals(Nota outraNota) {
        return this.valor == outraNota.valor;
    }
}