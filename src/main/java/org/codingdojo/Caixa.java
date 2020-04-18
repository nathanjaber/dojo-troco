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
        Troco troco = new Troco();
        return troco;
    }
}