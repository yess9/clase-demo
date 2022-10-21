package pe.visorweb.menu;



import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pe.visorweb.paginas.categoria.MantenimientoCategoriaPagina;
//import pe.visorweb.paginas.producto.MantenimientoProductoPagina;

public class MenuPrincipal {
	
	private WebDriver driver;
	
	private By linkMenuHamburguesa = By.xpath("//div[@class=\"menu\"]/div[1]");
    private By linkModuloAlmacen = By.xpath("//span[contains(text(),'Mod. de Almacén')]");
    private By linkMntCategoria = By.linkText("Mnt. de Categoría");
    //private By linkMntProducto = By.linkText("Mnt. de Productos");
    
    public MenuPrincipal(WebDriver driver) {
    	this.driver = driver;
    	}
    	
    public MantenimientoCategoriaPagina cargarPaginaMantenimientoCategoria() {
    	try {
    		Thread.sleep(1000);
    		this.driver.findElement(linkMenuHamburguesa).click();
    		
    		Thread.sleep(1000);
    		this.driver.findElement(linkModuloAlmacen).click();
    		
    		Thread.sleep(1000);
    		this.driver.findElement(linkMntCategoria).click();
    		
    		
    
    		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    

    return new MantenimientoCategoriaPagina(driver);
    }
	/*
   public MantenimientoProductoPagina cargarPaginaMantenimientoProducto() {
	   try {
		Thread.sleep(1000);
		this.driver.findElement(linkMenuHamburguesa).click();
		
		Thread.sleep(1000);
		this.driver.findElement(linkModuloAlmacen).click();
		
		Thread.sleep(1000);
		this.driver.findElement(linkMntProducto).click();
	   }catch(Exception e) {
		e.printStackTrace();
	}
	return new MantenimientoProductoPagina(driver);
}*/
}
