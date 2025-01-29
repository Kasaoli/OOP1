public class Infantil extends Livro {

  private int faixaEtaria;

  public Infantil(int faixaEtaria) {
    this.faixaEtaria = faixaEtaria;
  }

  public int getFaixaEtaria() {
    return faixaEtaria;
  }

  public void setFaixaEtaria(int faixaEtaria) {
    this.faixaEtaria = faixaEtaria;
  }

  public void identificarTipoDoLivro() {
    System.out.println("Esse é um livro infantil.");
  }

  public void identificarTipoDoLivro(boolean figuras) {
    if (figuras) {
      System.out.println("Esse é um livro infantil com figuras " + "para crianças acima de " + faixaEtaria + " anos;");
    } else {
      System.out.println("Esse é um livro infantil sem figuras " + "para crianças acima de " + faixaEtaria + " anos;");
    }
  }

}