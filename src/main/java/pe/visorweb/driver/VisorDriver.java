package pe.visorweb.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisorDriver {
	
	//DEFINIR CONSTANTES
	public enum NavegadorWeb{CHROME, FIREFOX}
    
	//control + espacio constructor vacio 
	public VisorDriver() {
		
	}
	public static WebDriver getInstancia(NavegadorWeb navegador) {
		if(navegador == NavegadorWeb.FIREFOX) {
			return getFirefoxDriver();
		}
		return getChromeDriver();
	}
	//Inicializando y configurando el navegador
	private static WebDriver getChromeDriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	private static WebDriver getFirefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}
}
