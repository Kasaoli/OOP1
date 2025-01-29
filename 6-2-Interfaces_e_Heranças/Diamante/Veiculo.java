public abstract class Veiculo {

	private String id;
	private String modelo;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public abstract void locomover();
	
	@Override
	public String toString() {
		
		return "Oi, eu sou a classe "+this.getClass().getCanonicalName();
	}
	
	
}
