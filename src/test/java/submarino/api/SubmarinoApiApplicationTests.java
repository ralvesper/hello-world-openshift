package submarino.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import submarino.api.flyweight.ControleSubmarino;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SubmarinoApiApplication.class)
public class SubmarinoApiApplicationTests {

	@Test
	public void contextLoads() {
	}

	
	@Test
	public void testaRotaLMRDDMMUU(){ 
		ControleSubmarino controle = new ControleSubmarino();
		String posicao = controle.navegar("LMRDDMMUU"); 
		assertEquals(posicao, "-1 2 0 NORTE");
	} 
	 
	@Test
	public void testaRotaRMMLMMMDDLL(){ 
		ControleSubmarino controle = new ControleSubmarino();
		String posicao = controle.navegar("RMMLMMMDDLL"); 
		assertEquals(posicao, "2 3 -2 SUL");
		
	} 
	
	
}
