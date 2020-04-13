package tabuleiro;

public class Campo {
	private int linhas;
	private int colunas;
	//Matriz de Peças
	private Peca[][] pecas;
	
	public Campo(int linhas, int colunas) {
		if(linhas <1 || colunas <1) {
			throw new CampoExcessao("Erro Criando Campo :É Necessario que tenha pelo menos 1 Linha e 1 Coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		//Matriz de instanciada Manualmente na quantidade de linha e coluna informada
		pecas =  new Peca[linhas][colunas];
	}
	public int getLinhas() {
		return linhas;
	}
	
	public int getColunas() {
		return colunas;
	}
	// SET DE LINHAS E COLUNAS TIRADOS PQ APÓS CRIAR O CAMPO NAO TEM PQ ALTERAR O TAMANHO DELE
	
	// MATRIZ GET E SET NÂO TEM PQ TER METODOS
	
	//Retorna Matriz na Linha e Colina Pecas
	public Peca pecas(int linha,int coluna) {
		//Verifica se a Posição Existe
		if(!posicaoExistente(linha,coluna)) {
			throw new CampoExcessao("Posição não existe no Campo");
		}
		return pecas[linha][coluna];
	}
	//Retorna a Peça pela Posição 
	public Peca pecas(Posicao posicao) {
		//Verifica se a Posição Existe
		if(!posicaoExistente(posicao)) {
			throw new CampoExcessao("Posição não existe no Campo");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	//Pega a peca e a posicao para colocar no campo
	public void pecaCampo(Peca peca,Posicao posicao) {
		//verifica se a posição é valida 
		if(testaPecaPosicao(posicao)) {
			throw new CampoExcessao("Essa Posição é Invalida : "+posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca; //pega a posição da matriz peça e passa para a peça
		peca.posicao = posicao;
		
	}
	//Metodo Auxiliar do outro Metodo posicaoExistente (Fica mais facil com esse Auxiliar)
	private boolean posicaoExistente(int linha,int coluna) {
		return linha >=0 && linha < linhas && coluna >=0 && coluna < colunas;
	}
	//Verifica se a Posicao Existe aproveitando o Metedo Auxiliar
	public boolean posicaoExistente(Posicao posicao) {
		return posicaoExistente(posicao.getLinha(),posicao.getColuna());
	}
	//Verifica se tem Peca em alguma Posicao (Pega a Peca do Metedo Peca : Linha 34 do codigo
	public boolean testaPecaPosicao(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new CampoExcessao("Posição não existe no Campo");
		}
		return pecas(posicao)!= null;
		
	}
}
