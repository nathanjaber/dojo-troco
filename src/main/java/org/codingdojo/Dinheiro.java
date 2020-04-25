package org.codingdojo;

import java.util.ArrayList;
import java.util.List;

public class Dinheiro {
    private int valor;

	public Dinheiro(int valor) {
		this.valor = valor;
	}

	public Dinheiro subtrair(Dinheiro outroDinheiro) {
        return new Dinheiro(this.valor - outroDinheiro.valor);
	}

	public List<Nota> converterParaNotas() {
		ArrayList<Nota> notas = new ArrayList<>();
		notas.add(new Nota(this.valor));
		return notas;
	}

	public boolean equals(Dinheiro outroDinheiro) {
		return this.valor == outroDinheiro.valor;
	}
}
