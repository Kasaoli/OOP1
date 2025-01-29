public class Gato extends AnimalEstimacao {

  public Gato(String nome, int idade) {
    super(nome, idade);
  }

  public void fazerSom() {
    System.out.println("Miaaaauuu...");
  }

  public void brincar() {
    System.out.println("Brincando com novelo de lã");
  }

}