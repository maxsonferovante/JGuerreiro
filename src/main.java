import java.util.ArrayList;
import javax.swing.JOptionPane;

import jogadores.Espartano;
import jogadores.Gandalf;
import personagem.Data;
import personagem.Personagem;

public class main {

	public static void main(String[] args) {
	ArrayList <Personagem> personagens = new ArrayList<>();
	String escolha = null;
	
	// do-while() de selecção de personagem. 
	do{
		escolha = JOptionPane.showInputDialog("1 - Para O Mago  2 - Para o Guerreiro ");
		if (escolha != null){
			//Tranando um possivel erro de conversão caso usuário insira um caracter não númerico.
			try {
				int op = Integer.parseInt(escolha);
				switch(op){
				case 1:{
					JOptionPane.showMessageDialog(null, "MAGO FOI SUA ESCOLHA.");
					int SimOuNao = JOptionPane.showConfirmDialog(null, "Deseja nomear seu mago?", null, JOptionPane.YES_NO_OPTION);
					if (SimOuNao == 0){
						String nomeDoMago = JOptionPane.showInputDialog("Nome do seu mago: ");
						int valoresDaData[] = Data.DataAtual(); 
						personagens.add(new Gandalf(nomeDoMago,valoresDaData[0],valoresDaData[1],valoresDaData[2],23));
					}
					else{
						if(SimOuNao == 1)
								personagens.add(new Gandalf());
						}
				}break;
				case 2:{
					JOptionPane.showMessageDialog(null, "GUERREIRO FOI SUA ESCOLHA.");
					
					int SimOuNao = JOptionPane.showConfirmDialog(null, "Deseja nomear seu guerreiro?", null, JOptionPane.YES_NO_OPTION);
					if (SimOuNao == 0){
						String nomeDoGuerreiro = JOptionPane.showInputDialog("Nome do seu guerreiro: ");
						int valoresDaData[] = Data.DataAtual(); 
						personagens.add(new Espartano(1,nomeDoGuerreiro,valoresDaData[0],valoresDaData[1],valoresDaData[2]));
					}
					else{
						if(SimOuNao == 1)
								personagens.add(new Espartano());
						}
				}break;
				default:{
					JOptionPane.showMessageDialog(null, "Suas opções são 1 ou 2.");
				}break;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"São aceitos apenas números. Escolha uma opção válida.");
				}			
			}else{
				break; 
			}	
	}while(true);
	
	}
}
