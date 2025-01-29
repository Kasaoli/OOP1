public class Cachorro {

  private int energia = 5;

  public void latir() {
    System.out.println("Cachorro latiu e perdeu 2 pontos de energia.");
    energia -= 2;
  }

  public int getEnergia() {
    return energia;
  }

  public void setEnergia(int energia) {
    this.energia = energia;
  }

  public void andar() {
    System.out.println("Cachorro andou e perdeu 1 ponto de energia.");
    energia -= 1;
  }

  public void pular() {
    System.out.println("Cachorro pulou e perdeu 3 pontos de energia.");
    energia -= 3;
  }

  public void ficar() {
    System.out.println("Cachorro ficou e ganhou 1 ponto de energia.");
    energia += 1;
  }

  public void sentar() {
    System.out.println("Cachorro sentou e ganhou 2 pontos de energia.");
    energia += 2;
  }

  public void receberRecompensa(int x) {
    System.out.println("Cachorro ganhou " + x + " ponto(s) de energia.");
    energia += x;
  }

}