package armas;

public final class Espada {
	private String tipodaEspada;
	private double comprimentodaEspada;
	private boolean empunhada;

	public Espada() {

	}

	public Espada(String tipo, double compri, boolean emp) {
		this.tipodaEspada = tipo;
		this.comprimentodaEspada = compri;
		this.empunhada = emp;
	}

	public Espada(final Espada outra) {
		this.tipodaEspada = outra.getTipodaEspada();
		this.comprimentodaEspada = outra.getComprimentodaEspada();
		this.empunhada = outra.isEmpunhada();
	}

	public String getTipodaEspada() {
		return tipodaEspada;
	}

	public void setTipodaEspada(String tipodaEspada) {
		this.tipodaEspada = tipodaEspada;
	}

	public double getComprimentodaEspada() {
		return comprimentodaEspada;
	}

	public void setComprimentodaEspada(double comprimentodaEspada) {
		this.comprimentodaEspada = comprimentodaEspada;
	}

	public boolean isEmpunhada() {
		return empunhada;
	}

	public void setEmpunhada(boolean empunhada) {
		this.empunhada = empunhada;
	}

	public void empunharEspada() {

	}

	public void desempunharEspada() {

	}
}
