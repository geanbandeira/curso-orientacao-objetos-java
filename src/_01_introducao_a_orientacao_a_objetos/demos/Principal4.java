package _01_introducao_a_orientacao_a_objetos.demos;

public class Principal4 {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.preco = 10.00;
        p1.peso = 0.5;

        Produto p2 = new Produto();
        p2.preco = 3.33;
        p2.peso = 1.0;

        Produto p3 = new Produto();
        p3.preco = 22.20;
        p3.peso = 20.0;

        Produto p4 = new Produto();
        p4.preco = 30.10;
        p4.peso = 3.2;

        Carrinho carrinho = new Carrinho();
        carrinho.adicionar(p1);
        carrinho.adicionar(p2);
        carrinho.adicionar(p3);
        carrinho.adicionar(p4);

        System.out.println(carrinho.calcularPrecoTotal());
        System.out.println(carrinho.calcularPesoTotal());
    }
}
