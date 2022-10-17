package test_java_medium;

import java.text.DecimalFormat;

import org.junit.BeforeClass;
import org.junit.Test;

import java_medium.Exercicio03_medium;

public class TestExercicio03_medium {
	static Exercicio03_medium ex03;
	static DecimalFormat decimalFormat;

	@BeforeClass
	public static void before() {
		ex03 = new Exercicio03_medium();
		decimalFormat = new DecimalFormat("#,###.00");
	}
	
	@Test
	public void testeSomaNumerosAcumulados() {
		ex03.somaNumerosAcumulados();
		
	}

}
