package submarino.api.flyweight;

public enum Direcao {
	
	NORTE("NORTE"), SUL("SUL"), LESTE("LESTE"), OESTE("OESTE");
	
	String direcao = "NORTE";
	
	Direcao(String direcao){
		this.direcao = direcao;
	}
	
	public String getDirecao() {
		return direcao;
	}
	
	
}
