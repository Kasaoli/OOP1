public class PaiSemNocao {

	private double dinheiro = 5000;

	public void pagarConta(double valor) {
		dinheiro -=  valor;
	}

	public double getDinheiro() {
		return dinheiro;
	}

}
