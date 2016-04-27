package armas;

public final class Cajado {
	private String tipodoCajado;
	private boolean equipado; 
	public Cajado() {
		this.tipodoCajado = "Madeira";
		this.equipado = true;
	}
	public Cajado(final String tipo, boolean equi) {
		this.tipodoCajado = tipo;
		this.equipado = equi;
	}
	public Cajado(final Cajado outro){
		this.tipodoCajado = outro.getTipodoCajado();
		this.equipado = outro.isEquipado();
	}

	public String getTipodoCajado() {return tipodoCajado;}
	public void setTipodoCajado(String tipodoCajado) {this.tipodoCajado = tipodoCajado;}
	public boolean isEquipado() {return equipado;}
	public void setEquipado(boolean equipado) {this.equipado = equipado;}

}
