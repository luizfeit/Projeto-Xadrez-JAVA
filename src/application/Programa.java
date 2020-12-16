package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrex.PartidaDeXadrex;
import xadrex.PecaDeXadrex;
import xadrex.XadrexException;
import xadrex.XadrexPosicao;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PartidaDeXadrex partida = new PartidaDeXadrex();

		// O While vai ficar repetindo
		while (true) {
			// Criando a clasee "UI" para imprimir o tabuleiro da partida.
			try {
			UI.clearScreen();
			UI.printTabuleiro(partida.getPecas());
			System.out.println();
			System.out.print("Origem: ");
			XadrexPosicao origem = UI.lerXadrexPosicao(sc);

			System.out.println();
			System.out.print("Destino: ");
			XadrexPosicao destino = UI.lerXadrexPosicao(sc);

			PecaDeXadrex capturaDeXadrex = partida.perfomaceMovimentoXadrex(origem, destino);
			}
			catch(XadrexException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}

}
