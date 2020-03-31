package xadrez;

import tabuleiro.Campo;

public class PartidaXadrez {
	
	//Instanciar Campo porque sem campo n�o tem jogo
	private Campo campo;
	
	public PartidaXadrez() {
		//tamanho do campo 8 linhas e 8 colunas
		campo = new Campo(8,8);
	}
	
	//Retorna uma Matriz de Pe�a de Xadrez para Partida
	public PecaXadrez[][] getPeca(){
		PecaXadrez[][] mat = new PecaXadrez[campo.getLinhas()][campo.getColunas()];//�pega qtdade linha e coluna do tabuleiro
		
		//For para percorrer a Matriz toda
		for(int i=0;i<campo.getLinhas();i++) { // linha
			for(int j=0;j<campo.getColunas();j++) {//coluna
				//(PecaXadrez) � um Downcasting para interpretar como uma Pe�aXadrez e N�o Pe�a
				mat[i][j] = (PecaXadrez) campo.pecas(i,j);
				
			}
		}
		return mat;
	}

}
