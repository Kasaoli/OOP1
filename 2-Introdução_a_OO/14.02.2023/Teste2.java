public class Teste2 {

  public static void main(String[] args) {

    Balde balde = new Balde();

    int x = balde.getQtdLitrosAgua();

    for (int i = 0; i < 20; i++) {
      balde.encher();
      System.out.println(balde.getQtdLitrosAgua());

      if (x >= 5) {
        balde.esvaziar();
      }
    }

    /*balde.esvaziar();
    System.out.println(balde.getQtdLitrosAgua());*/;
  }
}