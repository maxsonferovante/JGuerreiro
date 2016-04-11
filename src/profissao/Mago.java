package profissao;

import personagem.Personagem;

public abstract class Mago extends Personagem{
	protected int mana ,intelligence;
	
	
	protected static final  int INCREMENTO_MANA = 13, INCREMENTO_INTLLIGENCE = 3, DECREMENTO_MANA = 13;
    
	public Mago(){
	}
	
	public Mago(String nome, int dia, int mes,int ano) {
		super(nome,dia,mes, ano);
		this.intelligence = 33;
		this.mana = 33;
	}
	@Override
	public void adicionarRecompensas(final float recompensa){
		recompensas.add(recompensa);
	}
	
	@Override
	 public void aumentarXp(final int acrescimo){
		this.life += this.life * ( acrescimo *( ( Personagem.INCREMENTO_LIFE + this.xpdoPersonagem ) / 100 ));
		this.intelligence += this.intelligence * ( acrescimo *( ( Mago.INCREMENTO_INTLLIGENCE + this.xpdoPersonagem ) / 100 ));
		this.mana += this.mana * ( acrescimo *( ( Mago.INCREMENTO_MANA + this.xpdoPersonagem ) / 100 ));
		
		if (acrescimo == 1)
			this.xpdoPersonagem++;
		else
			this.xpdoPersonagem += acrescimo;
	}
	
	public abstract void ataqueMagico(int resistenciaInimiga);
	public abstract void defesaMagico(int ataquedoInimigo);
	
}
