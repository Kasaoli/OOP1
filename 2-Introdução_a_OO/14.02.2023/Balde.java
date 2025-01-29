public class Balde {

  private int qtdLitrosAgua;

  public int getQtdLitrosAgua() {
    return qtdLitrosAgua;
  }

  public void encher() {

    if (qtdLitrosAgua < 10) {
      qtdLitrosAgua += 2;
    } else {
      System.err.println("Balde cheio! Esvazie o balde.");
    }

  }

  public void esvaziar() {
    qtdLitrosAgua = 0;
  }

}