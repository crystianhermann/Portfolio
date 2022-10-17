package test_java_medium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java_medium.Exercicio05_medium;

public class TestExercicio05_medium {

	static Exercicio05_medium exercicio05_medium;
	
	@BeforeClass
	public static void before() {
		exercicio05_medium = new Exercicio05_medium();
	}
	
//	@Test
//	public void testeVerificaMenorNumero() {
//		String valorEsperado = "2";
//		Integer valorAtual = exercicio05_medium.verificaMenorNumero(0);
//		Assert.assertEquals(valorEsperado, valorAtual.toString());
//	}
}
