package submarino.api.flyweight.cmd;

import submarino.api.flyweight.Posicao;

public class D implements Command {
	
	
	public String simbolo() {
		return "D";
	}


	public String nome() {
		return "Baixo";
	}


	public void calcula(Posicao pos) {
		pos.baixo();	
	}
}
