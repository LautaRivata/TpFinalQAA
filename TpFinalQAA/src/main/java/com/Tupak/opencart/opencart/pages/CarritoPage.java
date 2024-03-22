package com.Tupak.opencart.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarritoPage extends BasePage {

    private By shoppingChartBy = By.xpath("//a[@title=\"Shopping Cart\"]");
    private By item = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a");
           // By.xpath("//*[@id=\"content\"]/form/div/table/[text()=\"Canon EOS 5D\"]");

    public CarritoPage(WebDriver driver) {
        super(driver);
    }

    public boolean itemIsDisplayed() {

        return isDisplayed(item);
    }

    public void verCarrito(){
        click(shoppingChartBy);
    }
}
