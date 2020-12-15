package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrex.Cor;
import xadrex.PecaDeXadrex;
import xadrex.XadrexPosicao;

public class UI {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_WHITE = "\u001B[37m";

	// Mexer as peças.
	public static XadrexPosicao lerXadrexPosicao(Scanner sc) {
		try {
			String s = sc.nextLine();
			char coluna = s.charAt(0);
			int linha = Integer.parseInt(s.substring(1));
			return new XadrexPosicao(coluna, linha);
		} catch (RuntimeException e) {
			throw new InputMismatchException("Erro ao ler o XadrexPosicao. valor validos são a1 até h8");
		}
	}

	// Imprimir as colunas no tabuleiro.
	public static void printTabuleiro(PecaDeXadrex[][] pecas) {
		for (int i = 0; i < pecas.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pecas.length; j++) {
				PrintPecas(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}

	// Imprimir as peças no tabuleiro.
	private static void PrintPecas(PecaDeXadrex pecas) {
		if (pecas == null) {
			System.out.print("-");
		} else {
			if (pecas.getCor() == Cor.WHITE) {
				System.out.print(ANSI_WHITE + pecas + ANSI_RESET);
			} else {
				System.out.print(ANSI_YELLOW + pecas + ANSI_RESET);
			}
		}
		System.out.print(" ");
	}
}
