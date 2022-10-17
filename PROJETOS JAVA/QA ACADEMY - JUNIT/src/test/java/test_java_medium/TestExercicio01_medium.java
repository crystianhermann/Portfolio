package test_java_medium;

import org.junit.BeforeClass;
import org.junit.Test;

import java_medium.Exercicio01_medium;

public class TestExercicio01_medium {

	static Exercicio01_medium ex01;

	@BeforeClass
	public static void before() {
		ex01 = new Exercicio01_medium(); 
	}

	@Test
	public void testeExibeParOuImpar() {
		ex01.exibeParOuImpar();
	}
}
