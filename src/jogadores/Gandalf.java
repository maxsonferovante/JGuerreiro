package jogadores;
import profissao.Mago;

public final class Gandalf extends Mago{
	private int prepotencia;
	
	public Gandalf() {
		super();
		this.prepotencia = 33;
	}
	public Gandalf(String nome, int dia, int mes, int ano, int prepo) {
		super(nome, dia, mes, ano);
		
		if (prepo < 0)
			this.prepotencia = 33;
		
		this.prepotencia = prepo;
	}
	public Gandalf(final Gandalf outro) {
		this.nomedoPersonagem = outro.nomedoPersonagem;
	    this.life = outro.life;
	    this.mana = outro.mana;
	    this.intelligence = outro.intelligence;
	    this.prepotencia = outro.prepotencia;
	    
	    this.recompensas = outro.recompensas;
	    
	    datadeNascimento.setMonth(outro.datadeNascimento.getMonth());
	    datadeNascimento.setYear(outro.datadeNascimento.getYear());
	    datadeNascimento.setDay(outro.datadeNascimento.getDay());
	}
	
	@Override
	public void ataqueMagico(int resistenciaInimiga){
		System.out.println("O Mago "+ this.nomedoPersonagem + " esta atacando magicamente...");
		if ( ((this.intelligence + this.prepotencia)/4) > resistenciaInimiga)
	        resistenciaInimiga -= (this.intelligence + this.prepotencia)/3;  
	    else
	        if( ((this.intelligence + this.prepotencia)/4) == resistenciaInimiga)
	            resistenciaInimiga -= (this.intelligence + this.prepotencia)/5;
	        else
	           System.out.println("O Inimigo defendou o ataque magico...");
	    
	    if (resistenciaInimiga < 0) resistenciaInimiga = 0;
	}
	@Override
	public void defesaMagico(int ataquedoInimigo){
		if (this.mana/8 < ataquedoInimigo )
        {
            this.life -= (ataquedoInimigo/this.mana/8);
            System.out.println("\nLife do Mago " + this.life);
        }
	}
	
}
