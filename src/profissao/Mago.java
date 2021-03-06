package profissao;

import armas.Cajado;
import interfaces.Atacavel;
import interfaces.Curador;
import personagem.Personagem;

import java.util.ArrayList;
import java.util.Random;

public abstract class Mago extends Personagem implements Atacavel, Curador{
	protected int mana ,intelligence;
	protected Cajado cajadoDoMago;
	
	protected static final  int INCREMENTO_MANA = 13, INCREMENTO_INTLLIGENCE = 3, DECREMENTO_MANA = 13;
    
	public Mago(){
	}
	
	public Mago(String nome, int dia, int mes,int ano) {
		super(nome,dia,mes, ano);
		this.intelligence = 33;
		this.mana = 33;
		cajadoDoMago = new Cajado("Madeira",true);
	}
	public Mago(String nome, int dia, int mes,int ano,double lif,int man,int inteli, ArrayList <Double> recomp , Cajado arma) {
		super(nome,dia,mes, ano, recomp);
		this.intelligence = 33;
		this.mana = 33;
		cajadoDoMago = new Cajado(arma);
	}
	//M�todo assinado na implements na Atacavel
	public double atacarComArma(double vidaDoInimigo) {
		if(esquiva()){
			System.out.println("O Guerreiro " + this.nomedoPersonagem + " esta atacando com o cajado...");
			if ( (this.intelligence + (double)this.mana*0.02) > vidaDoInimigo)
				vidaDoInimigo -= (this.intelligence + (double)this.mana*0.02)/3;  
			else
				if( (this.intelligence + (double)this.mana*0.02) == vidaDoInimigo)
					vidaDoInimigo -= ((this.intelligence + (double)this.mana*0.02))/5;
				else
					System.out.println("O Inimigo defendou o ataque com o cajado...");
	    
			if (vidaDoInimigo < 0) vidaDoInimigo = 0;
		
			this.mana -= (double)this.mana*0.02;
		}
		else{
			System.out.println("O Inimigo esquivou do ataque com a arma do Mago.");
		}
	    return vidaDoInimigo;
	}	

	public boolean esquiva(){
		return new Random().nextBoolean();
	}

	@Override
	public void adicionarRecompensas(final double recompensa){
		recompensas.add(recompensa);
	}
	public void generarVida(int tempoDeCura){
		this.mana -= CUSTODEREGENERACAOINDIVIDUAL*tempoDeCura;
		this.life += this.life*FATORDERENERECAOINDIVIDUAL*tempoDeCura;
	}
	
	public void generarAliados(ArrayList <Personagem> personagens, int tempoDeCura){
		for(Personagem personagem:personagens){
			if (personagem instanceof Mago)
				personagem.setLife((personagem.getLife() +(personagem.getLife()*FATORDERENERECAOCOLETIVO*tempoDeCura)));
		}
	}
	public abstract void ataqueMagico(int resistenciaInimiga);
	public abstract void defesaMagico(int ataquedoInimigo);
	
}
