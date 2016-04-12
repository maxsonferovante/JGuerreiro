package atacar;

public interface Atacavel {
	 float atacarComArma(float VidaDoInimigo);
	 float[] atacarComArma(float VidaDoInimigo, int manaDoInimigo);
	 float golpe(float VidaDoinimigo);
	 boolean esquiva();
}
