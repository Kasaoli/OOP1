public class Teste1 {

  public static void main(String[] args) {
    Pizza p1 = new Pizza();
    Pizza p2 = new Pizza();

    p1.setNome("Frango");
    p2.setNome("Calabresa");

    exibirPizza(p1);
    exibirPizza(p2);
  }

  public static void exibirPizza(Pizza p) {
    System.out.println(p.getNome());
    p.preparar(p.getNome());
  }

}