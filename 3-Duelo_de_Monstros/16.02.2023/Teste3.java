public class Teste3 {

  public static void main(String[] args) {

    Arena arena = new Arena();
    Monstro m1 = new Monstro("Charmander", 30);
    Monstro m2 = new Monstro("Squirtle", 30);

    arena.comecarLuta(m1, m2);

  }
}