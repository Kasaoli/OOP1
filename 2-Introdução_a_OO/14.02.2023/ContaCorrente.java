public class ContaCorrente {

  private double saldo;

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public boolean sacar(double valor) {

    if (valor > saldo) {
      System.err.println("Saldo insuficiente");
      return false;
    } else
      saldo -= valor;

    return true;
  }

  public void depositar(double valor) {
    saldo += valor;
  }

}