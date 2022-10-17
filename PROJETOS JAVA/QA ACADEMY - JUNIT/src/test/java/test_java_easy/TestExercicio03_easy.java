package test_java_easy;

import org.junit.Assert;
import org.junit.Test;

import java_easy.Exercicio03_easy;

public class TestExercicio03_easy {

	@Test
	public void testeRetornoValorTrocado() {
		Exercicio03_easy exercicio03_easy = new Exercicio03_easy();

		String mensagemEsperada = "Primeiro valor Digitado: segundoValor\nSegundo valor Digitado: primeiroValor";
		String mensagemAtual = exercicio03_easy.retornaValorTrocado("primeiroValor", "segundoValor");
		Assert.assertEquals(mensagemEsperada, mensagemAtual);

	}

}
