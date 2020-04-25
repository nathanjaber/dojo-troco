package org.codingdojo;

import java.util.LinkedList;
import java.util.List;

public class Troco{

    private List<Nota> notas = new LinkedList<Nota>();

    public boolean isVazio() {
        return true;
    }

    public void adicionarNota(Nota nota) {
        this.notas.add(nota);
    }

    public boolean equals(Troco outroTroco) {
        for (int i = 0; i < this.notas.size(); i++)
            if (!this.notas.get(i).equals(outroTroco.notas.get(i)))
                return false;
        return true;
    }
}