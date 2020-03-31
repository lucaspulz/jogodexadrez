package tabuleiro;

public class Peca {
	//deixa invisivel do lado xadrez
	
	protected Posicao posicao;
	
	private Campo campo;
	
	//construtor sem posicao por que quando cria n�o tem posicao ainda no tabuleiro
	public Peca(Campo campo) {
		this.campo = campo;
	}
	//Protected apenas do mesmo pacote para acessar o Campo
	protected Campo getCampo() {
		return campo;
	}
	//n�o tem set para n�o alterar o valor do Campo(tabuleiro)
	
	
	
}
