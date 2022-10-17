package test_java_easy;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java_easy.Exercicio05_easy;

public class TestExercicio05_easy {

	static Exercicio05_easy exercicio05_easy;

	@BeforeClass
	public static void before() {
		exercicio05_easy = new Exercicio05_easy();
	}

	@Test
	public void testSoma() {
		int valorEsperado = 60;
		int valorAtual = exercicio05_easy.soma(10, 20, 30);
		Assert.assertEquals(valorEsperado, valorAtual);
	}

	@Test
	public void testSubtracao() {
		int valorEsperado = 10;
		int valorAtual = exercicio05_easy.subtracao(50, 20, 20);
		Assert.assertEquals(valorEsperado, valorAtual);
	}

	@Test
	public void testMultiplicacao() {
		int valorEsperado = 300;
		int valorAtual = exercicio05_easy.multiplicacao(10, 10, 3);
		Assert.assertEquals(valorEsperado, valorAtual);
	}

	@Test
	public void testmedia() {
		int soma = exercicio05_easy.soma(300, 300, 300);
		int valorEsperado = 300;
		int valorAtual = exercicio05_easy.media(soma);
		Assert.assertEquals(valorEsperado, valorAtual);
	}
}
