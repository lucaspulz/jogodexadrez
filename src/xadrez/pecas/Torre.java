package xadrez.pecas;

import tabuleiro.Campo;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez{
	
	//Construtor da classe PecaXadrez 
	public Torre(Campo campo, Cor cor) {
		super(campo, cor);
		
	}
	@Override
	// No Lugar da onde a peça estivar no tabuleiro vai aparecer T
	public String toString() {
		return "T";
	}

}
