package application;

import xadrex.PartidaDeXadrex;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PartidaDeXadrex partida= new PartidaDeXadrex();
		// Criando a clasee "UI" para imprimir o tabuleiro da partida.
		UI.printTabuleiro(partida.getPecas());
		
	}

}
