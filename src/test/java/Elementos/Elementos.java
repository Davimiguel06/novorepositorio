package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	
	private By btnAbrirconta = By.xpath("/html/body/div[2]/nav[2]/div[2]/div[4]/a");
	private By btnAbrircontapf = By.id("bt1");
	private By campoNome = By.id("nome");
	private By campoTelefone  = By.id("telefone");
	private By campoEmail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By btnQueroSerCliente = By.id("btnEnviar");
	
	
	public By getBtnAbrirconta() {
		return btnAbrirconta;
	}
	public By getBtnAbrircontapf() {
		return btnAbrircontapf;
	}
	public By getCampoNome() {
		return campoNome;
	}
	public By getCampoTelefone() {
		return campoTelefone;
	}
	public By getCampoEmail() {
		return campoEmail;
	}
	public By getCampoCpf() {
		return campoCpf;
	}
	public By getBtnQueroSerCliente() {
		return btnQueroSerCliente;
	}
	
	
}
