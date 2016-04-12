package profissao;

import java.util.Random;

import armas.Espada;
import atacar.Atacavel;
import personagem.Personagem;

public abstract class Guerreiro extends Personagem implements Atacavel{
	protected int  agility, armor,strenght;
	protected Espada espadadoGuerreiro;
	
	public static boolean armaduraVestida = false;
	public static int quantdeGuerreiros = 0;
	
    protected static final int INCREMENTO_STRENGHT = 2,INCREMENTO_AGILITY = 3, INCREMENTO_ARMOR = 2, INCREMENTO_DAMAGE = 2;
	
    public Guerreiro(){
		super();
		this.agility = 33;
		this.strenght = 33;
		this.armor = 3;
		
		espadadoGuerreiro = new Espada("adamantium",1,true);
		Guerreiro.quantdeGuerreiros++;
	}
	public Guerreiro(String nome, int dia, int mes, int ano) {
		super(nome,dia,mes,ano);
		this.agility = 33;
		this.strenght = 33;
		this.armor = 3;
		
		this.espadadoGuerreiro = new Espada();
		Guerreiro.quantdeGuerreiros++;
	}
	
	//Método assinado na implements na Atacavel
	public float atacarComArma(float vidaDoInimigo) {
		if (esquiva()){
			System.out.println("O Guerreiro " + this.nomedoPersonagem + " esta atacando com a sua espada...");
			if ( (this.agility + this.strenght/4) > vidaDoInimigo)
				vidaDoInimigo -= (this.agility + this.strenght)/3;  
		    else
		        if( (this.agility + this.strenght/4) == vidaDoInimigo)
		        	vidaDoInimigo -= (this.agility + this.strenght)/5;
		        else
		            System.out.println("O Inimigo defendou o ataque com a espada...");
		    
		    if (vidaDoInimigo < 0) vidaDoInimigo = 0;			
		}
		else{
			System.out.println("O Inimigo esquivou do ataque com a arma do Guerreiro.");
		}
	    return vidaDoInimigo;
	}	
	
	public boolean esquiva(){
		return new Random().nextBoolean();
	}
	@Override
	public void adicionarRecompensas(final float recompensa){
		recompensas.add(recompensa);
	}
	@Override
	 public void aumentarXp(final int acrescimo){
		this.life += this.life * ( acrescimo *( ( Personagem.INCREMENTO_LIFE + this.xpdoPersonagem ) / 100 ));
		this.strenght += this.strenght * ( acrescimo * ( ( Guerreiro.INCREMENTO_STRENGHT + this.xpdoPersonagem ) / 100));
		this.agility += this.agility * ( acrescimo *( ( Guerreiro.INCREMENTO_AGILITY+ this.xpdoPersonagem ) /100));
		this.armor += this.armor * ( acrescimo * ( ( Guerreiro.INCREMENTO_ARMOR + this.xpdoPersonagem ) /100));
		    
		if (acrescimo == 1)
			this.xpdoPersonagem++;
		else
			this.xpdoPersonagem += acrescimo;
	}
	
	static void ordenarArmaduraVestida(){
		if (!armaduraVestida){
	        System.out.println("Seus guerreiros estao sem suas armaduras.\nFoi ordenado o vestimento da armadura ...");
	        armaduraVestida = true;
	    }
	    System.out.println("Todos os guerreiros estao vestido suas armaduras...");
	}
    static void desordenarArmaduraVestida(){
    	if (armaduraVestida == true){
                System.out.println("Seus guerreiros estao guardando suas armaduras...");
                System.out.println("Armaduras guardadas...");
                armaduraVestida = false;
        }
    }
    
	public abstract void defesadoGuerreiro(int danodoInimigo);
	    
}
