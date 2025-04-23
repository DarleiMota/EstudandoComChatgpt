package br.com.pratica1.principal;

import br.com.pratica1.carrinho.CarrinhoDeCompras;
import br.com.pratica1.produtos.Filme;
import br.com.pratica1.produtos.Livro;

public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Clean Code", 120.0, "Robert C. Martin");
        Filme filme1 = new Filme("Matrix", 80.0, "Wachowski");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarProduto(livro1);
        carrinho.adicionarProduto(filme1);

        carrinho.listarProdutos();
        System.out.println("\nTotal da compra: R$ " + carrinho.calculaTotal());
    }
}