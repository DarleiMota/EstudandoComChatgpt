package br.com.pratica2.acão;

import br.com.pratica2.personagens.Personagem;

public class Batalha {
    public void iniciarDuelo(Personagem p1, Personagem p2){
        System.out.println("A batalha começou entre " + p1.getNome() + " e " + p2.getNome() + "!\n");

        while ((p1.getVida() > 0 && p2.getVida() > 0)){
            // primeiro ataque
            p1.atacar(p2);
            if (p2.getVida() <= 0){
                System.out.println(p2.getNome() + " foi derrotado!");
                break;
            }
            p2.atacar(p1);
            if (p1.getVida() <= 0){
                System.out.println(p1.getNome() + " foi derrotado!");
                break;
            }
        }

        System.out.println("Batalha finalizada!");
    }
}
