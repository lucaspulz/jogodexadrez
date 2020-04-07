package xadrez;

import tabuleiro.Campo;
import tabuleiro.Posicao;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	
	//Instanciar Campo porque sem campo n�o tem jogo
	private Campo campo;
	
	public PartidaXadrez() {
		//tamanho do campo 8 linhas e 8 colunas
		campo = new Campo(8,8);
		//e cria a partida
		iniciaPartida();
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
	//metodo responsavel por iniciar a partida colocando as pelas no campo
	private void iniciaPartida() {
		campo.pecaCampo(new Torre(campo,Cor.WHITE), new Posicao(2,1));
		campo.pecaCampo(new Torre(campo,Cor.BLACK), new Posicao(7,1));
		campo.pecaCampo(new Rei(campo,Cor.WHITE), new Posicao(0,3));
		
	}

}
