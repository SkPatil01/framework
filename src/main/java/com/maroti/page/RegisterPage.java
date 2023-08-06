package com.maroti.page;

import com.maroti.base.BaseClass;
import com.maroti.model.Register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BaseClass{
    private WebDriver driver;
    @FindBy(name = "firstName")
    protected WebElement firstName;
    @FindBy(name = "lastName")
    protected WebElement lastName;

    @FindBy(name = "phone")
    protected WebElement phone;

    @FindBy(name = "userName")
    protected WebElement userName;

    @FindBy(name = "address1")
    protected WebElement address;

    @FindBy(name = "city")
    protected WebElement city;

    @FindBy(name = "state")
    protected WebElement state;

    @FindBy(name = "postalCode")
    protected WebElement postalCode;

    @FindBy(name = "country")
    protected WebElement country;

    @FindBy(name = "email")
    protected WebElement email;

    @FindBy(name = "password")
    protected WebElement password;

    @FindBy(name = "confirmPassword")
    protected WebElement cNFPassword;

    @FindBy(xpath = "//input[@name='submit']")
    protected WebElement submit;
    public RegisterPage(){
   
        PageFactory.initElements(driver, this);
    }


    
   public void register(Register reg) {
        firstName.sendKeys(reg.getFirstName());
        lastName.sendKeys(reg.getLastName());
        phone.sendKeys(reg.getPhone());
        email.sendKeys(reg.getEmail());
        address.sendKeys(reg.getAddress());
        city.sendKeys(reg.getCity());
        state.sendKeys(reg.getState());
        postalCode.sendKeys("410001");
        Select select =new Select(country);
        select.selectByVisibleText(reg.getCountry());
        userName.sendKeys(reg.getUsername());
        password.sendKeys(reg.getPassword());
        cNFPassword.sendKeys(reg.getCnfPassword());
        submit.click();
    }
}
