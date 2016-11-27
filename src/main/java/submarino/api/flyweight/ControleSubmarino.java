package submarino.api.flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import submarino.api.flyweight.cmd.Command;
import submarino.api.flyweight.cmd.D;
import submarino.api.flyweight.cmd.L;
import submarino.api.flyweight.cmd.M;
import submarino.api.flyweight.cmd.R;
import submarino.api.flyweight.cmd.U;

@Service
public class ControleSubmarino {
	
	private Submarino submarino = new Submarino();
	private static Map<String, Command> comandos = new HashMap<String, Command>();
	private static List<Class<? extends Command>> clazzes;

	static {
		clazzes = Arrays.asList(R.class, L.class, D.class, U.class, M.class);
	}

	private Command carrega(String nome) {
		try {
			if (!comandos.containsKey(nome)) {
				for (Class<? extends Command> clazz : clazzes) {
					if (clazz.getSimpleName().toUpperCase().equals(nome)) {
						comandos.put(nome, (Command) clazz.newInstance());
						break;
					}
				}
			}

			return comandos.get(nome);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public String navegar(String comandos) {

		List<Command> rota = new ArrayList<Command>();

		for (int i = 0; i < comandos.length(); i++) {
			Command c = this.carrega(comandos.substring(i, i + 1));
			if (c != null){
				rota.add(c);
			}else{
				return "Comando Inválido.";
			}
			
		}
		
		submarino.navegar(rota);

		return submarino.posicaoAtual().toString();
	}
	
	public String historicoComandos(){
		return submarino.getHistoricoNavegacao().toString();
	}
	
	public void reset(){
		submarino = new Submarino();
		comandos = new HashMap<String, Command>();
	}
	
	public String getPosicao(){
		return submarino.posicaoAtual().toString();
	}
}
