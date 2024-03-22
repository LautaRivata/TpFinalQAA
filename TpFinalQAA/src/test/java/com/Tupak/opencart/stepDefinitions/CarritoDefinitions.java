package com.Tupak.opencart.stepDefinitions;

import com.Tupak.opencart.hooks.Hooks;
import com.Tupak.opencart.opencart.pages.ComprarPage;
import com.Tupak.opencart.opencart.pages.CarritoPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class CarritoDefinitions {
    
    private ComprarPage comprarPage;
    private CarritoPage carritoPage;

    public CarritoDefinitions(){
        this.comprarPage = new ComprarPage(Hooks.getDriver());
        this.carritoPage = new CarritoPage(Hooks.getDriver());
    }
    
    @Cuando("el usuario agrega un producto al carrito")
    public void elUsuarioAgregaUnProductoAlCarrito() {
        comprarPage.agregarUnProductoACart();
    }

    @Entonces("se valida que se agrego un producto al carrito")
    public void seValidaQueSeAgregoUnProductoAlCarrito() {
        carritoPage.verCarrito();
        Assert.assertTrue(carritoPage.itemIsDisplayed());
    }
}
