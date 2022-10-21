package pe.visorweb.paginas.categoria;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pe.visorweb.paginas.base.PaginaBase;

public class MantenimientoCategoriaPagina extends PaginaBase {
	
	//private WebDriver driver;
	
	private By btnNuevo = By.id("btnNuevo");
	
	public MantenimientoCategoriaPagina(WebDriver driver) {
		// TODO Auto-generated constructor stub
		//this.driver = driver;
		super(driver);
	}

	
	public void cargarPaginaRegistrarCategoria() {
		super.driver.findElement(btnNuevo).click();
	}

}
