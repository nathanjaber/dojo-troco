package org.codingdojo;

import java.util.ArrayList;
import java.util.List;

public class Dinheiro {
    private int valor;

	public Dinheiro(int valor) {
		this.valor = valor;
		System.out.println(valor);
	}

	public Dinheiro subtrair(Dinheiro outroDinheiro) {
        return new Dinheiro(this.valor - outroDinheiro.valor);
	}

	public List<Nota> converterParaNotas() {
		ArrayList<Nota> notas = new ArrayList<>();
		notas.add(new Nota(1));
		return notas;
	}

	public boolean equals(Dinheiro outroDinheiro) {
		return this.valor == outroDinheiro.valor;
	}
}
