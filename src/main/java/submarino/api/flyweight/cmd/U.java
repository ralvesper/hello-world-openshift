package submarino.api.flyweight.cmd;

import submarino.api.flyweight.Posicao;

public class U implements Command {
	

	public String simbolo() {
		return "U";
	}


	public String nome() {
		return "Cima";
	}
	
	public void calcula(Posicao pos) {
		pos.cima();	
	}
}
