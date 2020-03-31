package aplicacao;

import xadrez.PecaXadrez;

public class UI {
		//Metodo para mostrar o campo
	public static void printCampo(PecaXadrez[][] pecas) {
		//Logica impressao do tabuleiro (Ambos S�o pecas.length porque a matriz � quadrada).
		
		for(int i=0;i<pecas.length;i++) {//Percorrer Linhas 
			System.out.print((8 -i)+" "); //Para mostra o numero de Linhas ao lado do tabuleiro
			for(int j=0;j<pecas.length;j++) {//Percorrer Colunas
				printPeca(pecas[i][j]); //Imprime a pe�a
				
			}
			System.out.println();
		}
			System.out.println("  A B C D E F G H");
	}
		//Metodo Auxiliar para Impress�o de uma Pe�a
		private static void printPeca(PecaXadrez peca) {
			//Se n�o tiver Pe�a imprime um Tra�o
			if(peca==null) {
				System.out.print("-");
			}else {
			//Se Tiver Pe�a imprime a Pe�a
				System.out.print(peca);
		}	//Com ou Sem Pe�a Imprime um Espa�o em Branco Para n�o ficar tudo grudado
			System.out.print(" ");
		
	}

}
