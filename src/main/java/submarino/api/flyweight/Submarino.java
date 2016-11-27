package submarino.api.flyweight;

import java.util.List;

import submarino.api.flyweight.cmd.Command;

public class Submarino {
	
	private Posicao posicao = null;
	
	private StringBuilder historicoNavegacao = new StringBuilder();
	
	public Submarino(Posicao posicao){
		this.posicao = posicao;
	}
	
	public Submarino(){
		this.posicao = new Posicao();
	}
	
	public void navegar(List<Command> rota) {
		for (Command comando : rota) {
			gravarHistoricoNavagacao(comando);
			comando.calcula(posicao);
		}
	}
	
	public Posicao posicaoAtual(){
		return this.posicao;
	}

	public StringBuilder getHistoricoNavegacao() {
		return historicoNavegacao;
	}
	
	private void gravarHistoricoNavagacao(Command comando) {
		if (comando != null)
		getHistoricoNavegacao().append(comando.nome() + " ");
	}

}
