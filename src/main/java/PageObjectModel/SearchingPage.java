package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.readProperteis;

public class SearchingPage extends AbstractClass{

    WebDriver driver;

    public SearchingPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input[placeholder=\"e.g., Las Vegas\"]")
    private WebElement getDestination;

    @FindBy(css = "input[id=\"qf-0q-localised-check-in\"]")
    private WebElement getCheckInDate;

    @FindBy(css = "input[id=\"qf-0q-localised-check-out\"]")
    private WebElement getCheckOutDate;

    @FindBy(css = "button[class=\"widget-overlay-close\"]")
    private WebElement closingField;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement searchButton;

    public void typeTheDestination(String destination){

        destination = readProperteis.getData("destination");
        sendKeysFunctionalities(getDestination, destination );
    }

    public void typeTheCheckInDate(String dateIn, String dateOut){

        getCheckInDate.clear();  //field is needed to clean before write
        dateIn = readProperteis.getData("check-in");
        sendKeysFunctionalities(getCheckInDate, dateIn);

        getCheckOutDate.clear();
        dateOut = readProperteis.getData("check-out");
        sendKeysFunctionalities(getCheckOutDate, dateOut);
    }

    public void closeTheDateField(){
        clickOnFunctionalities(closingField);
    }

    public void clickOnSearchButton(){

        clickOnFunctionalities(searchButton);
    }


}
