package POM;

import Utils.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseClass{


    public MainPage(WebDriver driver) {
        super(driver);
    }

    //Centralize the locators

    @FindBy(xpath = "//button[text()='Acceso cliente']")
    @CacheLookup
    WebElement ButtonAccesoCliente;

    @FindBy(xpath = "//button[text()='Hazte cliente']")
    @CacheLookup
    WebElement ButtonHazteCliente;


    @FindBy(xpath ="//a[@class='txt-contactanos roboto-regular align-self-center m-1 font-16 text-decoration-none']")
    @CacheLookup
    WebElement LinkContactanos;

    @FindBy(xpath = "//a[@href='/maquinas']")
    @CacheLookup
    WebElement LinkMaquinas;


    @FindBy(xpath = "//a[@href='/webpay']")
    @CacheLookup
    WebElement LinkWebpay;

    @FindBy(xpath = "//a[@href='/cobro-qr]")
    @CacheLookup
    WebElement LinkCobroQR;


    //Acciones de la Pagina
    public void irAHazteCliente(){
        click(esperaExplicita(ButtonHazteCliente));
    }

    public void iraContactanos(){
        click(esperaExplicita(LinkContactanos));
    }

    public void iraAccesoCliente(){
        click(esperaExplicita(ButtonAccesoCliente));
    }

    public void iraMaquinas(){
        click(esperaExplicita(LinkMaquinas));
    }

    public void iraWebpay(){
        click(esperaExplicita(LinkWebpay));
    }

    public void iraCobroQR(){
        click(esperaExplicita(LinkCobroQR));
    }

}

