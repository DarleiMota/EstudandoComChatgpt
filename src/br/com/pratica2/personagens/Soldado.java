package br.com.pratica2.personagens;

public class Soldado extends Personagem {

    public Soldado(String nome){
        super(nome, 100,20);
    }

    @Override
    public void atacar(Personagem inimigo){
        System.out.println(getNome() + " dispara rajadas de metralhadora em "+ inimigo.getNome());
        inimigo.levarDano(getForca());
    }
}
