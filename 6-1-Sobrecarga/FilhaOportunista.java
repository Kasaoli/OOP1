public class FilhaOportunista extends PaiSemNocao {

	private double dinheiro = 100;

	@Override
	public void pagarConta(double valor) {

		if (valor < dinheiro)
			dinheiro -= valor;

		else {
			
			super.pagarConta(valor);
			System.out.println("usou dinheiro do pai = " + super.getDinheiro());
			
			
		}
	}

	@Override
	public double getDinheiro() {

		return dinheiro;
	}

}
