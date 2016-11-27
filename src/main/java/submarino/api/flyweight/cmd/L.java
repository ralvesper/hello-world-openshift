package submarino.api.flyweight.cmd;

import submarino.api.flyweight.Posicao;

public class L implements Command {
	

	public String simbolo() {
		return "L";
	}


	public String nome() {
		return "Esquerda";
	}
	
	public void calcula(Posicao pos) {
		pos.esquerda();	
	}
}
