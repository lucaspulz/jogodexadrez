package aplicacao;

import tabuleiro.Campo;
import tabuleiro.Posicao;
import xadrez.PartidaXadrez;

public class Main {

	public static void main(String[] args) {
		//Instanciando partida de Xadrez
		PartidaXadrez px = new PartidaXadrez();
		//Imprime Tabuleiro
		UI.printCampo(px.getPeca());

	}

}
