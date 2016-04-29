package interfaces;

public interface Atacavel {
	double atacarComArma(double VidaDoInimigo);

	double[] atacarComArma(double VidaDoInimigo, int manaDoInimigo);

	double golpe(double VidaDoinimigo);

	boolean esquiva();
}
