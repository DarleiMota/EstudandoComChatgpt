package br.com.pratica2.personagens;

public class Personagem {
    private String nome;
    private int vida;
    private int forca;

    // Construtor
    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    //Get
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }

    //Metodo
    public void levarDano(int dano) {
        vida -= dano;
        if (vida < 0) {
            vida = 0;
        }
    }

    public void atacar(Personagem inimigo) {
        System.out.println(nome + " ataca " + inimigo.getNome());
        inimigo.levarDano(forca);
    }

    public void status(){
        System.out.println("Nome: " + nome );
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + forca);
        System.out.println("------------------------");
    }
}
