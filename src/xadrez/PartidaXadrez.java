package xadrez;

import tabuleiro.Campo;

public class PartidaXadrez {
	
	//Instanciar Campo porque sem campo não tem jogo
	private Campo campo;
	
	public PartidaXadrez() {
		//tamanho do campo 8 linhas e 8 colunas
		campo = new Campo(8,8);
	}
	
	//Retorna uma Matriz de Peça de Xadrez para Partida
	public PecaXadrez[][] getPeca(){
		PecaXadrez[][] mat = new PecaXadrez[campo.getLinhas()][campo.getColunas()];//´pega qtdade linha e coluna do tabuleiro
		
		//For para percorrer a Matriz toda
		for(int i=0;i<campo.getLinhas();i++) { // linha
			for(int j=0;j<campo.getColunas();j++) {//coluna
				//(PecaXadrez) é um Downcasting para interpretar como uma PeçaXadrez e Não Peça
				mat[i][j] = (PecaXadrez) campo.pecas(i,j);
				
			}
		}
		return mat;
	}

}
