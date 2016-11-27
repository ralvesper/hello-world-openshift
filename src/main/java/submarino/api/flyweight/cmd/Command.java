package submarino.api.flyweight.cmd;

import submarino.api.flyweight.Posicao;

public interface Command {
	
	public String simbolo();
	public String nome();
	public void calcula(Posicao pos);
		
}
