package personagem;

import java.util.ArrayList;

public abstract class Personagem {
	protected String nomedoPersonagem;
	protected float life, xpdoPersonagem;
	protected ArrayList <Float> recompensas;
	
	protected Data datadeNascimento;
	
	protected final static int INCREMENTO_LIFE = 60, DECREMENTO_LIFE = 60;
	
		
	public Personagem() {
		datadeNascimento =  new Data(21,12,2012);
		this.life = 1200;
		this.nomedoPersonagem = "SEM NOME";
		this.xpdoPersonagem = 1;
		this.recompensas  = new ArrayList <>();
	}
	public Personagem(String nome, int dia, int mes, int ano) {
		datadeNascimento =  new Data(dia,mes, ano);
		this.life = 1200;
		this.nomedoPersonagem = nome;
		this.xpdoPersonagem = 1;
		this.recompensas  = new ArrayList <>();
	}
	
	public Personagem(String nome, int dia, int mes, int ano, ArrayList <Float> recomp) {
		datadeNascimento =  new Data(dia,mes, ano);
		this.life = 1200;
		this.nomedoPersonagem = nome;
		this.xpdoPersonagem = 1;
		this.recompensas  = new ArrayList <>(recomp);
	}
	public abstract void adicionarRecompensas(final float recompensa);
	public abstract void aumentarXp(final int acrescimo);
	
	public String getNome() { 
		return this.nomedoPersonagem; 
	}
	public float getLife() { 
		return this.life; 
	}
	public float getXpdoPersonagem() { 
		return this.xpdoPersonagem; 
	}
	
	public void setxpdoPersonagem(float xp){
		if (xp > 0)
			this.xpdoPersonagem = xp;			
	}
	public void setLife(float vida ){
		if (vida >0)
			this.life = vida;
	}

}
