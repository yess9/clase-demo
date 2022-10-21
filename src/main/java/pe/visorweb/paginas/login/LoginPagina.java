package pe.visorweb.paginas.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pe.visorweb.paginas.base.PaginaBase;

public class LoginPagina extends PaginaBase{
	
	//private WebDriver driver;
	
	private By txtUsuario = By.id("txtUsuario");
	private By txtClave = By.id("txtClave");
	private By btnIniciarSesion = By.id("btnIniciarSesion");
	private By lblMensajeBienvenida = By.xpath("//div[@class=\"title-main\"]");
	
	public LoginPagina(WebDriver driver) {
		//sin el extends
		//this.driver = driver;
		super (driver);
		
	}
	public void iniciarSesion(String usuario, String clave) {
		//this.driver.findElement(txtUsuario).clear();
		//this.driver.findElement(txtUsuario).sendKeys(usuario);
		
		//this.driver.findElement(txtClave).clear();
		//this.driver.findElement(txtClave).sendKeys(clave);
		
		//this.driver.findElement(btnIniciarSesion).click();
		//se añadio un delay 
		escribir(txtUsuario,usuario);
		escribir(txtClave,clave);
		click(btnIniciarSesion);
		
		
		//try {
			//Thread.sleep(1000);
		//}catch (InterruptedException e) {
			//e.printStackTrace();
		//}
		
		
		
	}
	public void cargar() {
		this.driver.get("http://localhost:8080/VisorWeb/index.xhtml");
	}
	public String getTituloPaginaBienvenida(){
		return this.driver.findElement(lblMensajeBienvenida).getText();
	}
}
