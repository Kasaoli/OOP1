public class Carro extends Veiculo{
	
	private String placa;
    private MoverTerra movimento = new MoverTerra();
	

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public void locomover() {
		
		movimento.mover();
		
	}

}
