package Metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	
	WebDriver driver;

	public void clicar(By elemento) {

		driver.findElement(elemento).click();

	}

	public void preencher(By elemento, String texto) {

		driver.findElement(elemento).sendKeys();
	}

	public void pausa(int tempo) throws InterruptedException {

		Thread.sleep(1000);
	}

	public void validarTexto(String texto, By elemento) {

		String mensagem = driver.findElement(elemento).getText();
		System.out.println(mensagem);
		assertEquals(texto, mensagem);

	}
	public void pegarTexto(By elemento) {
		
		String texto =  driver.findElement(elemento).getText();
		System.out.println(texto);
		
	}
	
	public void executarNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
}
