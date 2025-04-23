package br.com.pratica1.carrinho;

import br.com.pratica1.produtos.Produto;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        System.out.println("Adicionando produto: " + produto.getDescricao());
        produtos.add(produto);
    }

    public double calculaTotal(){
        double total = 0 ;
        for (Produto p : produtos){
            total+= p.getPreco();
        }
        return total;
    }

    public void listarProdutos(){
        System.out.println("\nProdutos no carrinho");
        for (Produto p : produtos){
            System.out.println(p.getDescricao());
        }
    }
}
