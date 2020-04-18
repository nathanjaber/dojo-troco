package org.codingdojo;

public class Caixa {
    private final TrocoFactory factory;

    private Dinheiro preco;
    private Dinheiro valorPago;

    public Caixa(Dinheiro preco, Dinheiro valorPago, TrocoFactory factory) {
        this.preco = preco;
        this.valorPago = valorPago;
        this.factory = factory;
    }

    /**
     * método calcularTroco
     */
    public Troco calcularTroco() {
        Troco troco = this.factory.newInstance();
        return troco;
    }
}