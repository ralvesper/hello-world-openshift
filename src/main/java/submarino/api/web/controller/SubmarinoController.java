	package submarino.api.web.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import submarino.api.flyweight.ControleSubmarino;
import submarino.api.web.model.Comando;


@Controller
public class SubmarinoController {
	
	private ArrayList<Comando> listaComandos = new ArrayList<Comando>();
	
	@Autowired
	private ControleSubmarino controle;
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/controle")
	public String home(){
		return "controle";
	}
	
	@RequestMapping(value = "/controle", method = RequestMethod.POST )
	public String navegar(@RequestParam("entrada") String entrada, Model model){
		
		String posicao = controle.navegar(entrada);
		
		Comando cmd  = new Comando(entrada);
		cmd.setPosicao(posicao);
		
		listaComandos.add(cmd);
		
		model.addAttribute("listaComandos", listaComandos);
		
		return "controle";
		
	}

}
