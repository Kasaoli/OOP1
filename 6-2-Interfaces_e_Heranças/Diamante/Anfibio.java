public class Anfibio extends Veiculo {

	private boolean movimento = true;
	private MoverTerra terra = new MoverTerra();
	private MoverAgua agua = new MoverAgua();

	@Override
	public void locomover() {

		if (movimento)
			agua.mover();
		else
			terra.mover();
	}

	public void setMovimento(boolean movimento) {
		this.movimento = movimento;
	}

}
