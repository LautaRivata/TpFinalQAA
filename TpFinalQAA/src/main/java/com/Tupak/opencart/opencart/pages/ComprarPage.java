package com.Tupak.opencart.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComprarPage extends BasePage {


    private By cameraButton = By.xpath("//a[text()=\"Cameras\"]");
    private By selector = By.id("input-option226");
    private By botonComprar = By.id("button-cart");
    private By carritoIcon = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[1]");

    public ComprarPage(WebDriver driver) {
        super(driver);
    }

    public void agregarUnProductoACart() {
        click(cameraButton);
        click(carritoIcon);
        click(selector);
        click(botonComprar);
    }
}
