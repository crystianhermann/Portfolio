package test_java_easy;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java_easy.Exercicio08_easy;

public class TestExercicio08_easy {

	static Exercicio08_easy exericio08_easy;
	static DecimalFormat decimalFormat;

	@BeforeClass
	public static void before() {
		exericio08_easy = new Exercicio08_easy();
		decimalFormat = new DecimalFormat("#,###.00");
	}

	@Test
	public void testeSalarioPrimeiraFaixaIr() {

		String valorEsperado = "0.0";
		Double valorAtual = exericio08_easy.calculaImpostoDeRenda(1903.98);
		Assert.assertEquals(valorEsperado, valorAtual.toString());
	}

	@Test
	public void testeSalarioSegundaFaixaIrPrimeiraCondicao() {

		String valorEsperado = "0.0";
		Double valorAtual = exericio08_easy.calculaImpostoDeRenda(1903.99);
		Assert.assertEquals(valorEsperado, valorAtual.toString());
	}

	@Test
	public void testeSalarioSegundaFaixaIrSegundaCondicao() {

		String valorEsperado = "69,20";
		String valorAtual = decimalFormat.format(exericio08_easy.calculaImpostoDeRenda(2826.65));
		Assert.assertEquals(valorEsperado, valorAtual);
	}

	@Test
	public void testeSalarioTerceiraFaixaIrPrimeiraCondicao() {

		String valorEsperado = "69,20";
		String valorAtual = decimalFormat.format(exericio08_easy.calculaImpostoDeRenda(2826.66));
		Assert.assertEquals(valorEsperado, valorAtual);
	}

	@Test
	public void testeSalarioTerceiraFaixaInssSegundaCondicao() {

		String valorEsperado = "207,86";
		String valorAtual = decimalFormat.format(exericio08_easy.calculaImpostoDeRenda(3751.05));
		Assert.assertEquals(valorEsperado, valorAtual);
	}

	@Test
	public void testeSalarioQuartaFaixaInssPrimeiraCondicao() {

		String valorEsperado = "207,86";
		String valorAtual = decimalFormat.format(exericio08_easy.calculaImpostoDeRenda(3751.06));
		Assert.assertEquals(valorEsperado, valorAtual);
	}

	@Test
	public void testeSalarioQuartaFaixaIrSegundaCondicao() {

		String valorEsperado = "413,42";
		String valorAtual = decimalFormat.format(exericio08_easy.calculaImpostoDeRenda(4664.68));
		Assert.assertEquals(valorEsperado, valorAtual);
	}

	@Test
	public void testeSalarioQuintaFaixaInss() {

		String valorEsperado = "413,43";
		String valorAtual = decimalFormat.format(exericio08_easy.calculaImpostoDeRenda(4664.69));
		Assert.assertEquals(valorEsperado, valorAtual);
	}

	@Test
	public void testeSalarioLiquido() {

		String valorEsperado = "1.992,80";
		String valorAtual = decimalFormat.format(
				exericio08_easy.calcularSalarioLiquido(2000.00, exericio08_easy.calculaImpostoDeRenda(2000.00)));
		Assert.assertEquals(valorEsperado, valorAtual);
	}
}
