public class Adestrador {

  private Cachorro cachorro;

  public Adestrador(Cachorro cachorro) {
    this.cachorro = cachorro;
  }

  public void iniciarTreinamento(int... comando) {

    for (int i : comando) {

      if (i == 1) {
        cachorro.andar();
      } else if (i == 2) {
        cachorro.pular();
      } else if (i == 3) {
        cachorro.ficar();
      } else if (i == 4) {
        cachorro.sentar();
      }

      if (cachorro.getEnergia() <= 0) {
        cachorro.receberRecompensa(5);
      }

    }

    System.out.println("Cachorro ficou com " + cachorro.getEnergia() + " pontos.");

  }

}