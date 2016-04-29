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
		super(outro.nomedoPersonagem,outro.datadeNascimento.getDay(),outro.datadeNascimento.getMonth(),outro.datadeNascimento.getYear(),
				outro.life,outro.agility,outro.armor,outro.strenght, outro.recompensas, outro.espadadoGuerreiro);
		
		this.linhaDainfantaria = outro.linhaDainfantaria;
		
	}
	void mudarLinhaNaInfantaria(){
		if (this.linhaDainfantaria == 3 || this.linhaDainfantaria == 2) 
	        this.linhaDainfantaria --;
	    else
	        System.out.println("O Guerreiro Espartano ja esta na linha ");
	}
	@Override
	public double golpe(double vidaDoInimigo) {
		
		if (esquiva()){
			System.out.println("Golpe do Espartano" 
					+ nomedoPersonagem 
					+ "não realizado. Houve esquina do Inimigo");
		}
		else{
				vidaDoInimigo -= ((double)(agility+strenght))*0.3;
				System.out.println("Golpe do Espartano" 
				+ nomedoPersonagem 
				+ " realizado..."
				+ "\nDano causado foi de " + (((double)(agility+strenght))*0.3));
			}
		return vidaDoInimigo;
	}
	public double[] atacarComArma(double VidaDoInimigo, int manaDoInimigo){
		if (esquiva()){
			if (espadadoGuerreiro.isEmpunhada()){
				if ((this.strenght + this.agility) / 5 > VidaDoInimigo){
					System.out.println(" O Guerreiro " + this.nomedoPersonagem +" esta atacando com sua espada... ");
	            
					VidaDoInimigo -= VidaDoInimigo - ((this.strenght + this.agility) / 5);
					manaDoInimigo -= ((double)manaDoInimigo)*0.05; 
	            
					System.out.println(" Ataque realizado... ");
				}
				else
					System.out.println(" O Guerreiro " + this.nomedoPersonagem + " teve seu ataque com a espada defendido...  ");
			}
			else
				System.out.println(" Espada do Guerreiro " + this.nomedoPersonagem +" desempunhada... ");		
			}
			else{
				System.out.println("O Inimigo esquivou do ataque da arma do Espartano.");
			}
		double[] resultado = new double[]{VidaDoInimigo,manaDoInimigo};
		return resultado;
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
