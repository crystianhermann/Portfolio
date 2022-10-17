package test_java_easy;

import org.junit.Assert;
import org.junit.Test;

import java_easy.Exercicio02_easy;

public class TestExercicio02_easy {
	
	@Test
	public void testRetornaPalavra() {
		Exercicio02_easy exercicio02_easy = new Exercicio02_easy();
		Assert.assertEquals("O usuario digitou : " + "test", exercicio02_easy.retornaPalavra("test"));
		
		
	}

}
