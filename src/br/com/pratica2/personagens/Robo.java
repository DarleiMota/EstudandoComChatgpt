package br.com.pratica2.personagens;

public class Robo extends Personagem {

    public Robo (String nome){
        super(nome, 150, 10);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(getNome() + " usa um soco hidráulico em "+inimigo.getNome());
        inimigo.levarDano(getForca());
    }
}
