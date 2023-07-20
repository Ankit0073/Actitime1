package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
public FacebookLoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
}
@FindBy(id= "email")
public WebElement usernameTextfield;
@FindBy(name="pass")
public WebElement passwordTextfield;
@FindBy(name="login")
public WebElement loginButton;

public void loginAction(String username,String password) {
	usernameTextfield.sendKeys(username);
	passwordTextfield.sendKeys(password);
	loginButton.click();

}
}