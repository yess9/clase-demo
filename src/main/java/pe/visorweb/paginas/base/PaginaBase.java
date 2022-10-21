package pe.visorweb.paginas.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pe.visorweb.menu.MenuPrincipal;

public class PaginaBase {
	
	protected WebDriver driver;
	
	protected MenuPrincipal menu;
	
	public PaginaBase(WebDriver driver) {
		this.driver = driver;
		menu = new MenuPrincipal(driver);
	}
	public WebElement buscar(By elemento) {
		return driver.findElement(elemento);
	}
	public void click(By elemento) {
		buscar(elemento).click();
	}
	public void escribir(By elemento, String texto) {
		buscar(elemento).sendKeys(texto);
	}

}
