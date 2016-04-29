package jogadores;


import personagem.Personagem;
import profissao.Mago;

public final class Gandalf extends Mago {
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
		super(outro.nomedoPersonagem, outro.datadeNascimento.getDay(), outro.datadeNascimento.getMonth(),
				outro.datadeNascimento.getYear(), outro.life, outro.mana, outro.intelligence, outro.recompensas,
				outro.cajadoDoMago);
		this.prepotencia = outro.prepotencia;
	}

	public double golpe(double vidaDoInimigo) {

		if (esquiva()) {
			System.out.println("Golpe do Espartano" + nomedoPersonagem + "não realizado. Houve esquina do Inimigo");
		} else {
			vidaDoInimigo -= (intelligence + ((double) mana) * 0.3);
			System.out.println("Golpe do Espartano" + nomedoPersonagem + " realizado..." + "\nDano causado foi de "
					+ ((intelligence + ((double) mana) * 0.3)));
		}
		this.mana -= (double) this.mana * 0.02;
		return vidaDoInimigo;
	}

	public double[] atacarComArma(double VidaDoInimigo, int manaDoInimigo) {
		if (esquiva()) {
			if (cajadoDoMago.isEquipado()) {
				if ((intelligence + ((double) mana) * 0.3) > VidaDoInimigo) {
					System.out.println(" O Guerreiro " + this.nomedoPersonagem + " esta atacando com sua espada... ");

					VidaDoInimigo -= (intelligence + ((double) mana) * 0.3);
					manaDoInimigo -= ((double) manaDoInimigo) * 0.05;

					System.out.println(" Ataque realizado... ");
				} else
					System.out.println(
							" O Guerreiro " + this.nomedoPersonagem + " teve seu ataque com a espada defendido...  ");
			} else
				System.out.println(" Espada do Guerreiro " + this.nomedoPersonagem + " desempunhada... ");
		} else {
			System.out.println("O Inimigo esquivou do ataque da arma do Espartano.");
		}
		this.mana -= (double) this.mana * 0.02;
		double[] resultado = new double[] { VidaDoInimigo, manaDoInimigo };
		return resultado;
	}

	@Override
	public void ataqueMagico(int resistenciaInimiga) {
		System.out.println("O Mago " + this.nomedoPersonagem + " esta atacando magicamente...");
		if (((this.intelligence + this.prepotencia) / 4) > resistenciaInimiga)
			resistenciaInimiga -= (this.intelligence + this.prepotencia) / 3;
		else if (((this.intelligence + this.prepotencia) / 4) == resistenciaInimiga)
			resistenciaInimiga -= (this.intelligence + this.prepotencia) / 5;
		else
			System.out.println("O Inimigo defendou o ataque magico...");

		if (resistenciaInimiga < 0)
			resistenciaInimiga = 0;
	}

	@Override
	public void defesaMagico(int ataquedoInimigo) {
		if (this.mana / 8 < ataquedoInimigo) {
			this.life -= (ataquedoInimigo / this.mana / 8);
			System.out.println("\nLife do Mago " + this.life);
		}
	}

	@Override
	public void aumentarXp(final int acrescimo) {
		this.life += this.life * (acrescimo * ((Personagem.INCREMENTO_LIFE + this.xpdoPersonagem) / 100));
		this.intelligence += this.intelligence
				* (acrescimo * ((Mago.INCREMENTO_INTLLIGENCE + this.xpdoPersonagem) / 100));
		this.mana += this.mana * (acrescimo * ((Mago.INCREMENTO_MANA + this.xpdoPersonagem) / 100));

		if (acrescimo == 1)
			this.xpdoPersonagem++;
		else
			this.xpdoPersonagem += acrescimo;
	}

}
