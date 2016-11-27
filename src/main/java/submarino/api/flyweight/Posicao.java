package submarino.api.flyweight;

public class Posicao {

	private int x, y, z;
	private Direcao direcao;

	public Posicao() {
		this.direcao = Direcao.NORTE;
	}

	public Posicao(Direcao direcao) {
		this.direcao = direcao;
	}

	public void direita() {
		if (this.direcao == Direcao.NORTE) {
			direcao = Direcao.LESTE;
		} else if (this.direcao == Direcao.LESTE) {
			direcao = Direcao.SUL;
		} else if (this.direcao == Direcao.SUL) {
			direcao = Direcao.OESTE;
		} else if (this.direcao == Direcao.OESTE) {
			direcao = Direcao.NORTE;
		}
	}

	public void esquerda() {
		if (this.direcao == Direcao.NORTE) {
			direcao = Direcao.OESTE;
		} else if (this.direcao == Direcao.OESTE) {
			direcao = Direcao.SUL;
		} else if (this.direcao == Direcao.SUL) {
			direcao = Direcao.LESTE;
		} else if (this.direcao == Direcao.LESTE) {
			direcao = Direcao.NORTE;
		}
	}

	public void cima() {
		if (z < 0) {
			z++;
		}
	}

	public void baixo() {
		z--;
	}

	public Direcao getDirecao() {
		return direcao;
	}

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

	public void mover() {

		if (this.direcao == Direcao.NORTE) {
			y++;
		} else if (this.direcao == Direcao.SUL) {
			y--;
		} else if (this.direcao == Direcao.LESTE) {
			x++;
		} else if (this.direcao == Direcao.OESTE) {
			x--;
		}

	}

	public String toString() {
		return (x + " " + y + " " + z + " " + this.direcao);
	}

}
