package submarino.api.flyweight.cmd;

import submarino.api.flyweight.Posicao;

public class M implements Command {
	

	public String simbolo() {
		return "M";
	}


	public String nome() {
		return "Mover";
	}
	
	public void calcula(Posicao pos) {
		pos.mover();	
	}
}
