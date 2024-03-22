package com.Tupak.opencart.stepDefinitions;

import com.Tupak.opencart.hooks.Hooks;
import com.Tupak.opencart.opencart.pages.HomePage;
import com.Tupak.opencart.opencart.pages.LoginPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;

public class LoginDefinitions {

    private HomePage homePage;
    private LoginPage loginPage;

    public LoginDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
        this.loginPage = new LoginPage(Hooks.getDriver());
    }

    @Dado("que el usuario ingresa a la página de login")
    public void queElUsuarioIngresaALaPáginaDeLogin() {
        Hooks.getDriver().get(Hooks.getProperty("url"));

        homePage.clickMyAccount();
        homePage.clickLoginDropdown();
    }

    @Cuando("el usuario se loguea con credenciales validas")
    public void elUsuarioSeLogueaConCredencialesValidas() {
        loginPage.login(Hooks.getProperty("username"), Hooks.getProperty("password"));
    }

    @Y("el usuario se loguea en la aplicacion")
    public void elUsuarioSeLogueaEnLaAplicacion() {
        homePage.clickMyAccount();
        homePage.clickLoginDropdown();

        loginPage.login(Hooks.getProperty("username"), Hooks.getProperty("password"));
    }

    @Cuando("el usuario se loguea con credenciales invalidas")
    public void elUsuarioSeLogueaConCredencialesInvalidas() {
        loginPage.login(Hooks.getProperty("usernamefail"), Hooks.getProperty("passwordfail"));

    }

    @Entonces("se muestra mensaje de error credenciales")
    public void seMuestraMensajeDeErrorCredenciales() {
        Assert.assertTrue(loginPage.credentialsErrorIsDisplayed());

    }
}
