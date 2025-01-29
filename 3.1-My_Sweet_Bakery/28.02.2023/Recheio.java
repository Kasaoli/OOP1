public class Recheio {

  private String sabor;
  private double valor;
  private double espessura;

  public Recheio() {}

  public Recheio(String sabor, double valor, double espessura) {
    this.sabor = sabor;
    this.valor = valor;
    this.espessura = espessura;
  }

  public void setSabor(String sabor) {
    this.sabor = sabor;
  }

  public String getSabor() {
    return sabor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public double getValor() {
    return valor;
  }

  public void setEspessura(double espessura) {
    this.espessura = espessura;
  }

  public double getEspessura() {
    return espessura;
  }

}