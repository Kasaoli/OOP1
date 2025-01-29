public class Transforme extends Veiculo {
	
	private Movimento move;

	@Override
	public void locomover() {
		move.mover();
		
	}

	public void setMove(Movimento move) {
		this.move = move;
	}

}
