package test_java_medium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java_medium.Exercicio06_medium;

public class TestExercicio06_medium {
	
	static Exercicio06_medium exercicio06_medium;
	
	@BeforeClass
	public static void before() {
		exercicio06_medium = new Exercicio06_medium();
	}
	
	@Test
	public void testeFatorial() {
		Assert.assertEquals(120, exercicio06_medium.calcularFatorial(5));
	}

}
