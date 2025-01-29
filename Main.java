public class Main {

  public static void main(String[] args) {

    int d = 0;
    float r = 0;

    try {
      r = 1 / d;
    } catch (ArithmeticException e) {
      System.err.println("ERRO");
      e.printStackTrace();
    } catch () {
      
    } finally {
      System.out.println("Terminou");
    }

    System.out.println("Continua...");
    System.out.println(r);

  }

}