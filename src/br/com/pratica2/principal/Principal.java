package br.com.pratica2.principal;


import br.com.pratica2.personagens.Personagem;
import br.com.pratica2.acão.Batalha;
import br.com.pratica2.personagens.Alien;
import br.com.pratica2.personagens.Robo;
import br.com.pratica2.personagens.Soldado;

public class Principal {
    public static void main(String[] args) {
        // Criando personagens
        Personagem soldado = new Soldado("Rambo");
        Personagem alien = new Alien("Xenomorfo");
        Personagem robo = new Robo("Exterminador");

        // Criando a batalha
        Batalha batalha = new Batalha();

        // Iniciando o duelo
        batalha.iniciarDuelo(soldado, alien);
        batalha.iniciarDuelo(robo, soldado);
    }
}

