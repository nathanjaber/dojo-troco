package org.codingdojo;


public class Caixa {

    private Dinheiro preco;
    private Dinheiro valorPago;

    public Caixa(Dinheiro preco, Dinheiro valorPago) {
        this.preco = preco;
        this.valorPago = valorPago;
    }

    /**
     * método calcularTroco
     */
    public Troco calcularTroco() {
        Dinheiro diferenca = this.valorPago.subtrair(this.preco);

        Troco troco = new Troco();
        diferenca.converterParaNotas().forEach((nota) -> troco.adicionarNota(nota));
        return troco;
    }
}