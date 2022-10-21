package pe.visorweb.paginas.categoria;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pe.visorweb.paginas.base.PaginaBase;

public class RegistrarCategoriaPagina extends PaginaBase {
	
	//import org.openqa.selenium.By;
	//import org.openqa.selenium.WebDriver;


		//private WebDriver driver;
		
		private By txtNombre = By.id("txtNombre");
		private By btnGuardar = By.id("btnGuardar");
		private By btnVolver = By.id("btnVolver");
		private By lblMensaje = By.id("messages");
		
		private String mensajeObtenido;
		
		public RegistrarCategoriaPagina(WebDriver driver) {
			//this.driver = driver;
			super(driver);
		}
		
		public void cargar() {
			//this.driver.get("http://localhost:8080/VisorWeb/mntAdmCategoria.xhtml");
			menu.cargarPaginaMantenimientoCategoria()
			    .cargarPaginaRegistrarCategoria();

			    
		}
		
		public void retornarPaginaMantenimientoCategoria() {
			this.driver.findElement(btnVolver).click();
		}
		
		public void guardar(String categoria) {
			this.driver.findElement(txtNombre).clear();
			this.driver.findElement(txtNombre).sendKeys(categoria);
			
			this.driver.findElement(btnGuardar).click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.mensajeObtenido = this.driver.findElement(lblMensaje).getText();
		}
		
		public String getMensajeObtenido() {
			return this.mensajeObtenido;
		}
		
	}

