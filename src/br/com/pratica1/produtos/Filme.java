package br.com.pratica1.produtos;

public class Filme extends Produto {
    private String diretor;


    public Filme(String nome, double preco, String diretor) {
        super(nome, preco);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }


    @Override
    public String getDescricao() {
        return super.getDescricao() + " | Diretor: " + diretor;
    }
}
