public class Barco extends Veiculo{
	
	private MoverAgua movimento = new MoverAgua();

	@Override
	public void locomover() {
		movimento.mover();
		
	}

	

}
