import java.util.Random;

public class Monstro {

  Random r = new Random();
  private String nome;
  private int vida;

  public Monstro(String nome, int vida) {
    this.nome = nome;
    this.vida = vida;
  }

  public int atacar() {
    return r.nextInt(30);
  }

  public int defender() {
    return r.nextInt(30);
  }

  public void sofrerImpacto(int dano){
    vida -= dano;
  }

  public void setVida(int vida) {
    this.vida = vida;
  }

  public int getVida() {
   return vida; 
  }

  public String getNome() {
    return nome;
  }
  
}