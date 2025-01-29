public class Cobertura {

  private String sabor;
  private double valor;

  public Cobertura() {}

  public Cobertura(String sabor, double valor) {
    this.sabor = sabor;
    this.valor = valor;
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

}