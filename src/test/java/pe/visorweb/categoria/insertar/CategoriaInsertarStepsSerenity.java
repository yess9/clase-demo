package pe.visorweb.categoria.insertar;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static org.junit.Assert.assertEquals;

//import org.openqa.selenium.WebDriver;

//import io.cucumber.java.After;
//import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
//import pe.visorweb.driver.VisorDriver;
//import pe.visorweb.driver.VisorDriver.NavegadorWeb;
import pe.visorweb.paginas.categoria.RegistrarCategoriaPagina;
//import pe.visorweb.driver.VisorDriver;
//import pe.visorweb.driver.VisorDriver.NavegadorWeb;
//import pe.visorweb.paginas.categoria.RegistrarCategoriaPagina;
import pe.visorweb.paginas.login.LoginPagina;

public class CategoriaInsertarStepsSerenity {

	@Managed
	private WebDriver driver;
	
	private LoginPagina paginaLogin;
	private RegistrarCategoriaPagina paginaRegistrarCategoria;
	
	@Before
	public void configuracionInicial() {
		paginaLogin = new LoginPagina(driver);
		paginaRegistrarCategoria = new RegistrarCategoriaPagina(driver);
	}
	
	@After
	public void configuracionFinal() {
		driver.close();
	}
	
	@Given("cargo el aplicativo visor web")
	public void cargarAplicativoVisor() {
		paginaLogin.cargar();
	}
	
	@And("inicio sesión con el usuario {string} y la clave {string}")
	public void iniciarSesion(String usuario, String clave) {
		paginaLogin.iniciarSesion(usuario, clave);
	}
	
	@When("ingreso a la ventana registrar categoría")
	public void cargarPaginaRegistrarCategoria() {
		paginaRegistrarCategoria.cargar();
	}
	
	@And("escribo la categoría {string} y hago clic en el botón Guardar")
	public void registrarCategoria(String nombreCategoria) {
		paginaRegistrarCategoria.guardar(nombreCategoria);
	}
	
	@Then("el aplicativo muestra el mensaje {string}")
	public void obtenerRespuesta(String mensajeEsperado) {
		assertEquals(mensajeEsperado, paginaRegistrarCategoria.getMensajeObtenido());
	}

	/*@Given("cargo el aplicativo visor web")
	public void cargarAplicativoVisor() {
		System.out.println("cargando aplicativo visor web...");
	}
	
	@And("inicio sesión con el usuario {string} y la clave {string}")
	public void iniciarSesion(String usuario, String clave) {
		System.out.println("iniciando sesión con el usuario: " + usuario + " y clave: " + clave);
	}
	
	@When("ingreso a la ventana registrar categoría")
	public void cargarPaginaRegistrarCategoria() {
		System.out.println("cargando la página registrar categoría...");
	}
	
	@And("escribo la categoría {string} y hago clic en el botón Guardar")
	public void registrarCategoria(String nombreCategoria) {
		System.out.println("registrando la categoría: " + nombreCategoria);
	}
	
	@Then("el aplicativo muestra el mensaje {string}")
	public void obtenerRespuesta(String mensajeEsperado) {
		System.out.println("mensajeEsperado: " + mensajeEsperado);
	}*/
}