package test_java_easy;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java_easy.Exercicio10_easy;

public class TestExercicio10_easy {
	
	static Exercicio10_easy ex10;
	static DecimalFormat decimalFormat;
	
	@BeforeClass
	public static void before() {
		ex10 = new Exercicio10_easy();
		decimalFormat = new DecimalFormat("#,###.00"); 	
	}
	
	@Test
	public void testeCalculaValorJuros() {
		String valorEsperado = "666,50";
		String valorAtual = decimalFormat.format(ex10.calcularValorJuros(1333));
		Assert.assertEquals(valorEsperado, valorAtual);
	}


}
