package application;

import xadrex.PecaDeXadrex;

public class UI {

	//Imprimir as colunas no tabuleiro.
	public static void printTabuleiro(PecaDeXadrex[][] pecas) {
		for (int i=0;i<pecas.length;i++) {
			System.out.print((8-i)+" ");
			for(int j=0;j<pecas.length;j++) {
				PrintPecas(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	//Imprimir as peças no tabuleiro. 
	private static void PrintPecas(PecaDeXadrex pecas) {
		if(pecas==null) {
			System.out.print("-");
		}
		else {
			System.out.print(pecas);
		}
		System.out.print(" ");
	}
}
