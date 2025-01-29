public class Calculadora {

  private Operacao operacao;

  public double calcular(double a, double b) {
    return operacao.calcular(a, b);
  }

  public void setOperacao(Operacao operacao) {
    this.operacao = operacao;
  }

}