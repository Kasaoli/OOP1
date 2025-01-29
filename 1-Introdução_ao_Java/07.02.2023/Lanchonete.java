import java.util.Scanner;
import java.util.ArrayList;

class Lanchonete {
  public static void main(String[] args) {

    ArrayList<String> items = new ArrayList();
    ArrayList<Double> precos = new ArrayList();

    Scanner input = new Scanner(System.in);

    while (true) {
      System.out.println("Escolha uma opção:");
      System.out.println("1 - Pães");
      System.out.println("2 - Queijos");
      System.out.println("3 - Carnes");
      System.out.println("4 - Verduras");
      System.out.println("5 - Molhos");
      System.out.println("6 - Outros");

      int r = input.nextInt();

      if (r == 1) {
        while (true) {
          System.out.println("Escolha uma opção de pão:");
          System.out.println("(1)Pão Francês - R$ 0,25");
          System.out.println("(2)Pão Carteira - R$ 0,30");
          System.out.println("(3)Pão de Hambúrguer - R$ 0,70");
          System.out.println("(4)Pão Árabe - R$ 1,30");

          r = input.nextInt();

          if (r == 1) {
            items.add("Pão Francês");
            precos.add(0.25);
          } else if (r == 2) {
            items.add("Pão Carteira");
            precos.add(0.30);
          } else if (r == 3) {
            items.add("Pão de Hambúrguer");
            precos.add(0.70);
          } else if (r == 4) {
            items.add("Pão Árabe");
            precos.add(1.30);
          } else {
            System.out.println("Opção Inválida!");
          }

          System.out.println("Deseja adicionar outro tipo de pão? (1) SIM / (0) NÃO");

          r = input.nextInt();

          if (r == 0)
            break;

        }

      } else if (r == 2) {
        System.out.println("Escolha uma opção de queijo");
        System.out.println("(1)Coalho - R$ 1,50");
        System.out.println("(2)Minas - R$ 1,80");
        System.out.println("(3)Muçarela - R$ 2,00");
        System.out.println("(4)Cream Cheese - R$ 3,00");
        System.out.println("(5)Gorgonzola - R$ 3,50");

        r = input.nextInt();

        if (r == 1) {
          items.add("Coalho");
          precos.add(1.50);
        } else if (r == 2) {
          items.add("Minas");
          precos.add(1.80);
        } else if (r == 3) {
          items.add("Muçarela");
          precos.add(2.00);
        } else if (r == 4) {
          items.add("Cream Cheese");
          precos.add(3.00);
        } else if (r == 5) {
          items.add("Gorgonzola");
          precos.add(3.50);
        } else {
          System.out.println("Opção Inválida!");
        }

      } else if (r == 3) {

      } else if (r == 4) {

      } else if (r == 5) {

      } else if (r == 6) {

      } else {
        System.err.println("Opção Inválida!");
      }

      System.out.println("Deseja adicionar mais items? (1) SIM / (0) NÃO");

      r = input.nextInt();

      if (r == 0)
        break;

    } // While

    double total = 0;
    for (int i = 0; i < items.size(); i++) {

      System.out.printf(items.get(i) + "......R$ %.2f %n", (precos.get(i)));
      total += precos.get(i);

    }

    System.out.printf("TOTAL: R$ %.2f %n", (total));

  }

}