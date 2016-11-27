package submarino.api.flyweight.cmd;

import submarino.api.flyweight.Posicao;

public class R implements Command {
	

	public String simbolo() {
		return "R";
	}


	public String nome() {
		return "Direita";
	}
	
	public void calcula(Posicao pos) {
		pos.direita();	
	}
	
	
}
