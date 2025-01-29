import java.util.ArrayList;

public class Bolo {

  private ArrayList<Massa> camadas = new ArrayList<>();
  private ArrayList<Recheio> recheios = new ArrayList<>();
  private Cobertura cobertura;
  private double valor;

  public ArrayList<Massa> getCamadas() {
    return camadas;
  }

  public void addCamada(Massa camada) {
    if (camadas.size() == recheios.size())
      camadas.add(camada);
    else
      System.err.println("Necessário adicionar recheio");
  }

  public void addRecheio(Recheio recheio) {
    if (camadas.size() > recheios.size())
      recheios.add(recheio);
    else
      System.err.println("Necessário adicionar camada");
  }

  public double getValor() {
    for (int i = 0; i < camadas.size(); i++) {
      System.out.println(camadas.get(i).getSabor());
      valor += camadas.get(i).getValor();

      if (i < recheios.size()) {
        System.out.println(recheios.get(i).getSabor());
        valor += recheios.get(i).getValor();
      }
    }

    System.out.println(cobertura.getSabor());
    valor += cobertura.getValor();
    return valor;
  }

  public Cobertura getCobertura() {
    return cobertura;
  }

  public void setCobertura(Cobertura cobertura) {
    if (camadas.size() > recheios.size())
      this.cobertura = cobertura;
    else
      System.err.println("Necessário adicionar recheio ou cobertura");
  }
}