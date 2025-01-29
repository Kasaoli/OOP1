public class Teste6_1 {

	public static void main(String[] args) {
		
		PaiSemNocao pai = new PaiSemNocao();
		
		FilhaOportunista filha = new FilhaOportunista();
		
		filha.pagarConta(1000);
		
		System.out.println("Filha = "+filha.getDinheiro());
		
		System.out.println(pai.getDinheiro());
		
	}

}
