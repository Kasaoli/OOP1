public class Pizza {

  private String nome;
  private String ingredientes;
  private double preco;

  public Pizza() {
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setIngredientes(String ingredientes) {
    this.ingredientes = ingredientes;
  }

  public String getIngredientes() {
    return ingredientes;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public double getPreco() {
    return preco;
  }

  public void preparar(String nome) {
    System.out.println("Preparando pizza de " + nome);
  }
}