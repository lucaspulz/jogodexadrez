package aplicacao;

import xadrez.PecaXadrez;

public class UI {
		//Metodo para mostrar o campo
	public static void printCampo(PecaXadrez[][] pecas) {
		//Logica impressao do tabuleiro (Ambos São pecas.length porque a matriz é quadrada).
		
		for(int i=0;i<pecas.length;i++) {//Percorrer Linhas 
			System.out.print((8 -i)+" "); //Para mostra o numero de Linhas ao lado do tabuleiro
			for(int j=0;j<pecas.length;j++) {//Percorrer Colunas
				printPeca(pecas[i][j]); //Imprime a peça
				
			}
			System.out.println();
		}
			System.out.println("  A B C D E F G H");
	}
		//Metodo Auxiliar para Impressão de uma Peça
		private static void printPeca(PecaXadrez peca) {
			//Se não tiver Peça imprime um Traço
			if(peca==null) {
				System.out.print("-");
			}else {
			//Se Tiver Peça imprime a Peça
				System.out.print(peca);
		}	//Com ou Sem Peça Imprime um Espaço em Branco Para não ficar tudo grudado
			System.out.print(" ");
		
	}

}
