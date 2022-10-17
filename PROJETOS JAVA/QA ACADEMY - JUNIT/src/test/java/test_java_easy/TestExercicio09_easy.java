package test_java_easy;

import org.junit.BeforeClass;
import org.junit.Test;

import java_easy.Exercicio09_easy;

public class TestExercicio09_easy {
	static Exercicio09_easy exercicio09_easy;
	
	@BeforeClass
	public static void before() {
	exercicio09_easy = new Exercicio09_easy();
	}
	
	@Test
	public void testeTabuada() {
		exercicio09_easy.calculaTabuada(10);
		
		
	}

}
