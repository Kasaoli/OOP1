public class Ficcao extends Livro {

  private String genero;

  public Ficcao(String genero) {
    this.genero = genero;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public void identificarTipoDoLivro() {
    System.out.println("Esse é um livro de Ficção.");
  }

  public void identificarTipoDoLivro(String autor) {
    System.out.println("Esse é um livro de Ficção de " + genero + " escrito por " + autor + ".");
  }

}