package test_java_easy;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java_easy.Exercicio11_easy;

public class TestExercicio11_easy {

	static Exercicio11_easy ex11;
	
	@BeforeClass
	public static void before() {
		ex11 = new Exercicio11_easy();
	}
	
	@Test
	public void testeSomarDois () {
		
		Assert.assertEquals(20, ex11.somarDois(10));
	}
}
