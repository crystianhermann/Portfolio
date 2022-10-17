package test_java_medium;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java_medium.Exercicio02_medium;

public class TestExercicio02_medium {
	static Exercicio02_medium ex02;
	static DecimalFormat decimalFormat;

	@BeforeClass
	public static void before() {
		ex02 = new Exercicio02_medium();
		decimalFormat = new DecimalFormat("#,###.00");
	}

	@Test
	public void testeRetornaPalavra() {

		String valorEsperado = "628,89";
		String valorAtual = decimalFormat.format(ex02.calculaInvestimentoJurosCompostos(1000));

		Assert.assertEquals(valorEsperado, valorAtual);
	}
	
	@Test
	public void testeCalculaValorTotalInvestimento() {

		String valorEsperado = "1.628,89";
		String valorAtual = decimalFormat.format(ex02.calculaValorTotalInvestimento(1000, 628.89));
		Assert.assertEquals(valorEsperado, valorAtual);
	}
}