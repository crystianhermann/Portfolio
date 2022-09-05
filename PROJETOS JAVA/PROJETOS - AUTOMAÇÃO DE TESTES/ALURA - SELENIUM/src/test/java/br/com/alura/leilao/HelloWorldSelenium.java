package br.com.alura.leilao;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium {

	

	@Test
	public void helloTest() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.navigate().to("http://localhost:8080/leiloes");
		browser.findElement(By.xpath("/html/body/div[1]/span/a")).click();
		browser.findElement(By.id("username")).sendKeys("username");
		browser.findElement(By.id("password")).sendKeys("password");

	}

}
