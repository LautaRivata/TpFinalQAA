package com.Tupak.opencart.stepDefinitions;

import com.github.javafaker.Faker;
import com.Tupak.opencart.hooks.Hooks;
import com.Tupak.opencart.opencart.pages.HomePage;
import com.Tupak.opencart.opencart.pages.RegisterPage;
import com.Tupak.opencart.opencart.pages.AccountPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class RegisterDefinitions {

    private HomePage homePage;
    private RegisterPage registerPage;
    private AccountPage accountPage;

    private Faker faker = new Faker();

    public RegisterDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
        this.registerPage = new RegisterPage(Hooks.getDriver());
        this.accountPage = new AccountPage(Hooks.getDriver());
    }

    @Dado("que el usuario ingresa a la página de registro")
    public void queElUsuarioIngresaALaPáginaDeRegistro() {
        Hooks.getDriver().get(Hooks.getProperty("url"));

        homePage.clickMyAccount();
        homePage.clickRegisterDropdown();

    }

    @Cuando("el usuario ingresa su informacion")
    public void elUsuarioIngresaSuInformacion() {
        registerPage.completarFormulario(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password());
    }

    @Entonces("se muestra mensaje de cuenta creada")
    public void seMuestraMensajeDeCuentaCreada() {

        Assert.assertTrue(accountPage.titleIsDisplayed());
        Assert.assertTrue(accountPage.descriptionIsDisplayed());
    }

    @Cuando("el usuario ingresa su informacion incompleta")
    public void elUsuarioIngresaSuInformacionIncompleta() {
        registerPage.failFirstFormulario(
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password());
    }

    @Entonces("se muestra mensaje de formulario incompleto")
    public void seMuestraMensajeDeFormularioIncompleto() {
        Assert.assertTrue(registerPage.errorFormularioIsDisplayed());
    }
}