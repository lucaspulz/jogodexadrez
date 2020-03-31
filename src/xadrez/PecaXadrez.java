package xadrez;

import tabuleiro.Campo;
import tabuleiro.Peca;

//subclasse da classe Peca do Pacote Tabuleiro
public class PecaXadrez extends Peca {
	
	private Cor cor;

	public PecaXadrez(Campo campo, Cor cor) {
		//Super para repassar para a super classe no caso Peca do pacote Tabuleiro
		super(campo);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
	//Não tem Set para não poder mudar as cores das peças
	
	
	

}
