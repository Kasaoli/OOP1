public class Massa {

  private String sabor;
  private String farinha;
  private Boolean usaLeite;
  private double valor;

  public Massa() {}
  
  public Massa(String sabor, String farinha, Boolean usaLeite, double valor) {
    this.sabor = sabor;
    this.farinha = farinha;
    this.usaLeite = usaLeite;
    this.valor = valor;
  }

  public void setSabor(String sabor) {
    this.sabor = sabor;
  }

  public String getSabor() {
    return sabor;
  }

  public void setFarinha(String farinha) {
    this.farinha = farinha;
  }

  public String getFarinha() {
    return farinha;
  }

  public void setUsaLeite(Boolean usaLeite) {
    this.usaLeite = usaLeite;
  }

  public Boolean isUsaLeite() {
    return usaLeite;
  }

  public void setValor(double Valor) {
    this.valor = valor;
  }

  public double getValor() {
    return valor;
  }
}