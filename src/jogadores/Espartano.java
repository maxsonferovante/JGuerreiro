package jogadores;
import profissao.Guerreiro;

public final class Espartano extends Guerreiro{
	private int linhaDainfantaria;
	
	public Espartano() {
		super();
		this.linhaDainfantaria = 3;
	}
	public Espartano(int linha, String nome, int dia, int mes, int ano){
		super(nome, dia, mes, ano);
		
		if (this.linhaDainfantaria > 0 && this.linhaDainfantaria < 4)
			this.linhaDainfantaria = linha;
		else
			this.linhaDainfantaria = 3;
			
	}
	public Espartano(final Espartano outro){
		this.agility = outro.agility;
		this.armor = outro.armor;
		this.strenght = outro.strenght;
		
		this.nomedoPersonagem = outro.nomedoPersonagem;
		this.life = outro.life;
		this.recompensas = outro.recompensas;
		
		this.datadeNascimento.setDay(outro.datadeNascimento.getDay());
		this.datadeNascimento.setMonth(outro.datadeNascimento.getMonth());
		this.datadeNascimento.setYear(outro.datadeNascimento.getYear());
		
		this.linhaDainfantaria = outro.linhaDainfantaria;
		
	}
	void mudarLinhaNaInfantaria(){
		if (this.linhaDainfantaria == 3 || this.linhaDainfantaria == 2) 
	        this.linhaDainfantaria --;
	    else
	        System.out.println("O Guerreiro Espartano ja esta na linha ");
	}
	
	@Override
	public void ataqueFisicoGuerreiro(int resistenciadoInimigo){
		System.out.println("O Guerreiro " + this.nomedoPersonagem + " esta atacando fisicamente...");
		if ( (this.agility + this.strenght/4) > resistenciadoInimigo)
			resistenciadoInimigo -= (this.agility + this.strenght)/3;  
	    else
	        if( (this.agility + this.strenght/4) == resistenciadoInimigo)
	        	resistenciadoInimigo -= (this.agility + this.strenght)/5;
	        else
	            System.out.println("O Inimigo defendou o ataque fisico...");
	    
	    if (resistenciadoInimigo < 0) resistenciadoInimigo = 0;
	}
	@Override
	public void defesadoGuerreiro(int danodoInimigo){
		if (this.armor < danodoInimigo )
        {
            this.life -= (danodoInimigo/this.armor);
            System.out.println("Life do Guerreiro " + this.life );
        }
	}
}
