package com.Tupak.opencart.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    private By firstNameInput = By.id("input-firstname");
    private By firstNameError = By.xpath("//*[@id=\"account\"]/div[2]/div/div");
    private By lastNameInput = By.id("input-lastname");
    private By lastNameError = By.xpath("//*[@id=\"account\"]/div[3]/div/div");
    private By inputEmail = By.id("input-email");
    private By inputEmailError = By.xpath("//*[@id=\"account\"]/div[4]/div/div");
    private By phoneInput = By.id("input-telephone");
    private By phoneInputError = By.xpath("//*[@id=\"account\"]/div[5]/div/div");
    private By passwordInput = By.id("input-password");
    private By passwordInputError = By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[1]/div/div");
    private By confirmPasswordInput = By.id("input-confirm");
    private By confirmPasswordInputError = By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div");
    private By checkbox = By.name("agree");
    private By continueButton = By.xpath("//input[@value=\"Continue\"]");

    private By generalError = By.xpath("//div[contains(text(), \"text-danger\")]");
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void completarFormulario(String firstName,
                                    String lastName,
                                    String email,
                                    String phone,
                                    String password) {

        sendKeys(firstNameInput, firstName);
        sendKeys(lastNameInput, lastName);
        sendKeys(inputEmail, email);
        sendKeys(phoneInput, phone);
        sendKeys(passwordInput, password);
        sendKeys(confirmPasswordInput, password);
        click(checkbox);
        click(continueButton);
    }

    public void failFirstFormulario(
                                    String lastName,
                                    String email,
                                    String phone,
                                    String password) {

        sendKeys(lastNameInput, lastName);
        sendKeys(inputEmail, email);
        sendKeys(phoneInput, phone);
        sendKeys(passwordInput, password);
        sendKeys(confirmPasswordInput, password);
        click(checkbox);
        click(continueButton);
    }

    public boolean errorFormularioIsDisplayed() {
        return isDisplayed(firstNameError);
    }
}
