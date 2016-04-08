package armas;

public final class Espada {
	private String tipodaEspada;
	private float comprimentodaEspada;
	private boolean empunhada;
	
	public Espada(){
		
	}
	public Espada(String tipo, float compri, boolean emp){
		this.tipodaEspada = tipo;
		this.comprimentodaEspada = compri;
		this.empunhada = emp;
	}

	public String getTipodaEspada() {
		return tipodaEspada;
	}

	public void setTipodaEspada(String tipodaEspada) {
		this.tipodaEspada = tipodaEspada;
	}

	public float getComprimentodaEspada() {
		return comprimentodaEspada;
	}

	public void setComprimentodaEspada(float comprimentodaEspada) {
		this.comprimentodaEspada = comprimentodaEspada;
	}

	public boolean isEmpunhada() {
		return empunhada;
	}

	public void setEmpunhada(boolean empunhada) {
		this.empunhada = empunhada;
	}
	public void empunharEspada(){
		
	}
	public void desempunharEspada(){
		
	}
}
