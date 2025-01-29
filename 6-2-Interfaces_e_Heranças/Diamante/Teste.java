public class Teste {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		Barco barco = new Barco();
		Anfibio anfibio = new Anfibio();
		Transforme transforme = new Transforme();
		
		System.out.println(carro);
		carro.locomover();
		
		System.out.println(barco);
		barco.locomover();
		
		System.out.println(anfibio);
		anfibio.locomover();
		anfibio.setMovimento(false);
		anfibio.locomover();
		
		
		System.out.println(transforme);
		transforme.setMove(new MoverTerra());
		transforme.locomover();
		
		transforme.setMove(new MoverAgua());
		transforme.locomover();
		
		transforme.setMove(new Movimento() {
			
			@Override
			public void mover() {
				System.out.println("Movendo no inferno.");
				
			}
		});

		transforme.locomover();
	}
	
	

}
