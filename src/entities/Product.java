package entities;

public class Product {

    public String nome;
    public double preço;
    public int quantidade;

    public double valorTotalEstoque () {
        return preço * quantidade;
    }

    public void produtosAdd (int quantidade) {
        this.quantidade += quantidade;
    }

    public void produtosRemovidos (int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString () {
        return nome
              + ", R$ "
              + String.format("%.2f",preço)
              + ", "
              + quantidade
              + " unidades, Total: R$"
              + String.format("%.2f",valorTotalEstoque());
    }
}
