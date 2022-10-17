package test_java_medium;

import java.text.DecimalFormat;

import org.junit.BeforeClass;
import org.junit.Test;

import java_medium.Exercicio04_medium;

public class TestExercicio04_medium {
	static Exercicio04_medium ex04;
	static DecimalFormat decimalFormat;

	@BeforeClass
	public static void before() {
		ex04 = new Exercicio04_medium();
	}

	@Test
	public void testeMultiplicacaoNumerosAteMil() {
		ex04.multiplicacaoNumerosAteMil();

	}

}
