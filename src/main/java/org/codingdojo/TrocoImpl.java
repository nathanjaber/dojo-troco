package org.codingdojo;

public class TrocoImpl implements Troco {
    private List<Nota> notas = new LinkedList<Nota>();

    public boolean isVazio() {
        return true;
    }

    public void adicionarNota(Nota nota) {
        this.notas.add(nota);
    }
}