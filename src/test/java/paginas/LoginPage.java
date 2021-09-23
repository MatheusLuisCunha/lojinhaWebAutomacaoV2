package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver navegador;

    public LoginPage(WebDriver navegador){
        this.navegador = navegador;
    }

    //Se vai preencher e ficar na mesma pagina, retorne a mesma pagina, nesse caso Login Page
    public LoginPage informarOUsuario(String usuario){
        //Fazer Login
        navegador.findElement(By.cssSelector("label[for='usuario']")).click();
        navegador.findElement(By.id("usuario")).sendKeys(usuario);

        return this;//retornar a proxima pagina, nesse caso a pagina atual
    }

    public LoginPage informarASenha(String senha){
        navegador.findElement(By.cssSelector("label[for='usuario']")).click();
        navegador.findElement(By.id("senha")).sendKeys(senha);

        return this;
    }

    //Ao clicar no botão Entrar vc vai para a proxima pagina, então retorne a proxima pagina
    //nesse caso ListaDeProdutosPage
    public ListaDeProdutosPage submeterFormularioDeLogin(){
        //Clicar no botao Entrar
        navegador.findElement(By.cssSelector("button[type='submit']")).click();

        return new ListaDeProdutosPage(navegador);
    }
}
