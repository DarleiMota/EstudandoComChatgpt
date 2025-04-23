package br.com.pratica1.produtos;

public class Livro extends Produto {
    private String autor;


    public Livro(String nome, double preco, String autor) {
        super(nome, preco); // chama o construtor da classe produto
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }


    @Override
    public String getDescricao() {
        return super.getDescricao() + " | Autor: "+ autor;
    }
}
