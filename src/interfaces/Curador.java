package interfaces;

import java.util.ArrayList;

import personagem.Personagem;

public interface Curador {
	double FATORDERENERECAOINDIVIDUAL = 0.05;
	double FATORDERENERECAOCOLETIVO = 0.03;
	int CUSTODEREGENERACAOINDIVIDUAL = 50;
	int CUSTODEREGENERACAOCOLETIVO = 130;
	
	void generarVida(int tempoDeCura);
	void generarAliados(ArrayList <Personagem> personagens, int tempoDecura);
	}
