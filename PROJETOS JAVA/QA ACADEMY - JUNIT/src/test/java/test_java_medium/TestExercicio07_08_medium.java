package test_java_medium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java_medium.Exercicio07_08_medium;

public class TestExercicio07_08_medium {

	static Exercicio07_08_medium exercicio07_08_medium;
	static String[] vetorMesesEsperado;

	@BeforeClass
	public static void before() {
		exercicio07_08_medium = new Exercicio07_08_medium();
		vetorMesesEsperado = new String[12];
		vetorMesesEsperado[0] = "Janeiro";
		vetorMesesEsperado[1] = "Fevereiro";
		vetorMesesEsperado[2] = "Marco";
		vetorMesesEsperado[3] = "Abril";
		vetorMesesEsperado[4] = "Maio";
		vetorMesesEsperado[5] = "Junho";
		vetorMesesEsperado[6] = "Julho";
		vetorMesesEsperado[7] = "Agosto";
		vetorMesesEsperado[8] = "Setembro";
		vetorMesesEsperado[9] = "Outubro";
		vetorMesesEsperado[10] = "Novembro";
		vetorMesesEsperado[11] = "Dezembro";
	}

	@Test
	public void testevetorMeses() {
		Assert.assertArrayEquals(vetorMesesEsperado, exercicio07_08_medium.criaVetorMeses());
	}

	@Test
	public void imprimeVetorMeses() {
		exercicio07_08_medium.imprimeValoresVetor(vetorMesesEsperado);
	}
}