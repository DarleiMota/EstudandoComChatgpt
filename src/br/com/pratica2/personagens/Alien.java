package br.com.pratica2.personagens;

public class Alien extends Personagem {

    public Alien(String nome) {
        super(nome, 120, 15); // vida = 120, força = 15
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(getNome() + " lança raio ácido em " + inimigo.getNome());
        inimigo.levarDano(getForca());
    }
}