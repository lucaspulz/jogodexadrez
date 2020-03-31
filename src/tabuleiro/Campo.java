package tabuleiro;

public class Campo {
	private int linhas;
	private int colunas;
	//Matriz de Peças
	private Peca[][] pecas;
	
	public Campo(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		//Matriz de instanciada Manualmente na quantidade de linha e coluna informada
		pecas =  new Peca[linhas][colunas];
	}
	public int getLinhas() {
		return linhas;
	}
	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}
	public int getColunas() {
		return colunas;
	}
	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	// MATRIZ GET E SET NÂO TEM PQ TEM METODOS
	
	//Retorna Matriz na Linha e Colina Pecas
	public Peca pecas(int linha,int coluna) {
		return pecas[linha][coluna];
	}
	//Retorna a Peça pela Posição 
	public Peca pecas(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	

}
