public class Teste3_1 {

  public static void main(String[] args) {

    Bolo bolo = new Bolo();

    Massa m1 = new Massa("Chocolate", "Trigo", true, 10);
    Recheio r1 = new Recheio("Doce de Leite", 10, 2);

    bolo.addCamada(m1);
    bolo.addRecheio(r1);
    bolo.addCamada(new Massa("Morango", "Trigo", true, 7.5));
    bolo.addRecheio(new Recheio("Chocolate", 11, 2.75));
    bolo.setCobertura(new Cobertura("Doce de leite", 5));

    bolo.getValor();

  }
}