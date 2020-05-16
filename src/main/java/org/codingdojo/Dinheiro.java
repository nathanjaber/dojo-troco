package org.codingdojo;

import java.util.ArrayList;
import java.util.List;

public class Dinheiro {
    private int valor;

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

		// array de verificação, validando a regra de negócio
		ArrayList<Integer> valoresPossiveis = new ArrayList<Integer>();
		valoresPossiveis.add(10);
		valoresPossiveis.add(5);
		valoresPossiveis.add(2);
		valoresPossiveis.add(1);

		int restante = this.valor;
		for (int i: valoresPossiveis) {
			while (i <= restante) {
				notas.add(new Nota(i));
				restante -= i;
			}
		}

		return notas;
	}

	public boolean equals(Dinheiro outroDinheiro) {
		return this.valor == outroDinheiro.valor;
	}
}

/*
    regra = 1, 2, 5, 10;
    array[2, 1]
    3 - 1 = 2;
    2 - 1 = 1;
    1 - 1 = 0;
*/