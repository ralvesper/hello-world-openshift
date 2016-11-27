package submarino.api.web.model;

public class Comando {
	
	private String entrada;
	private String posicao;
	
	public Comando(String entrada){
		this.entrada = entrada;
	}

	public String getEntrada() {
		return entrada;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
}
