public class Didatico extends Livro {

  private String disciplina;

  public Didatico(String disciplina) {
    this.disciplina = disciplina;
  }

  public String getDisciplina() {
    return disciplina;
  }

  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }

  public void identificarTipoDoLivro() {
    System.out.println("Esse é um livro didatico.");
  }

  public void identificarTipoDoLivro(int num) {
    System.out.println("Esse é um livro didatico de " + disciplina + " com " + num + " páginas.");
  }

}