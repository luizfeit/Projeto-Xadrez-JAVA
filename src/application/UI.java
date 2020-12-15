package application;

import xadrex.Cor;
import xadrex.PecaDeXadrex;

public class UI {
	
	public static final String ANSI_RESET="\u001B[0m";
	public static final String ANSI_YELLOW="\u001B[33m";
	public static final String ANSI_WHITE="\u001B[37m";


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
			if(pecas.getCor()==Cor.WHITE) {
				System.out.print(ANSI_WHITE+pecas+ANSI_RESET);
			}
			else {
				System.out.print(ANSI_YELLOW+pecas+ANSI_RESET);
			}
		}
		System.out.print(" ");
	}
}
