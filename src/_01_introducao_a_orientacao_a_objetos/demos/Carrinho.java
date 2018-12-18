package _01_introducao_a_orientacao_a_objetos.demos;

public class Carrinho {
    public static final int CAPACIDADE = 10;
    public Produto[] produtos = new Produto[CAPACIDADE];
    public int quantidade = 0;

    public double calcularPrecoTotal() {
        double total = 0.0;
        for (int i = 0; i < quantidade; i++) {
            total += produtos[i].preco;
        }
        return total;
    }

    public double calcularPesoTotal() {
        double total = 0.0;
        for (int i = 0; i < quantidade; i++) {
            total += produtos[i].peso;
        }
        return total;
    }

    public void adicionar(Produto produto) {
        if (quantidade != CAPACIDADE) {
            produtos[quantidade] = produto;
            quantidade++;
        }
    }
}
