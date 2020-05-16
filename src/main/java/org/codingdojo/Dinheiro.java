package org.codingdojo;

import java.util.ArrayList;
import java.util.List;

public class Dinheiro {
	private int valor;
	
	private static final int valoresPossiveis[] = new int[] { 10, 5, 2, 1 };

	public Dinheiro(int valor) {
		this.valor = valor;
	}

	public Dinheiro subtrair(Dinheiro outroDinheiro) {
		if (this.valor < outroDinheiro.valor)
			throw new RuntimeException("Quantidade inválida");
        return new Dinheiro(this.valor - outroDinheiro.valor);
	}

	public List<Nota> converterParaNotas() {
		ArrayList<Nota> notas = new ArrayList<>();

		int restante = this.valor;
		for (int i: valoresPossiveis) {
			while (i <= restante) {
				notas.add(new Nota(i));
				restante -= i;
			}
		}

		return notas;
	}

	@Override
	public boolean equals(Object outroDinheiro) {
		if (outroDinheiro instanceof Dinheiro) {
			Dinheiro d = (Dinheiro)outroDinheiro;
			return this.valor == d.valor;
		}
		return false;
	}
}
