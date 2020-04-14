package xadrez;

import tabuleiro.Campo;
import tabuleiro.Posicao;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	
	//Instanciar Campo porque sem campo não tem jogo
	private Campo campo;
	
	public PartidaXadrez() {
		//tamanho do campo 8 linhas e 8 colunas
		campo = new Campo(8,8);
		//e cria a partida
		iniciaPartida();
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
	//Metodo Recebe Coordenada do Xadrez Converte Chamando o Metodo toPosicao da classe XadrezPosicao
	private void partidaNovaPeca(char coluna,int linha,PecaXadrez peca) {
		campo.pecaCampo(peca, new XadrezPosicao(coluna,linha).toPosicao());
	}
	//metodo responsavel por iniciar a partida colocando as pelas no campo
	private void iniciaPartida() {
		partidaNovaPeca('b',6,new Torre(campo,Cor.WHITE));
		partidaNovaPeca('e',8,new Rei(campo,Cor.BLACK));
		partidaNovaPeca('e',1,new Rei(campo,Cor.WHITE));
		
		
	}

}
