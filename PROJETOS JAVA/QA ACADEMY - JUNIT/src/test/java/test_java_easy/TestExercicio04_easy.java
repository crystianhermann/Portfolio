package test_java_easy;

import org.junit.Assert;
import org.junit.Test;

import java_easy.Exercicio04_easy;

public class TestExercicio04_easy {
	
	@Test
	public void testeCalcularDobro() {	
	
		Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
		
		int resultadoAtual = exercicio04_easy.calcularDobro(5);
		int resultadoEsperado = 10;
		Assert.assertEquals(resultadoEsperado, resultadoAtual);
	}
	
}
