package webPages;

import org.openqa.selenium.By;

public class WeatherPage extends  ElementUtil {

    public By todayBtn = By.xpath("//span[contains(text(),'Today')]");
    public By lowestTemp = By.xpath("//span[@class='minTemp'][contains(text(),'41˚')]");
    public By highestTemp = By.xpath("//span[@class='temp'][contains(text(),'63˚')]");


    public void scrollDownthePage() {


        scrollByElement(todayBtn);
    }

    public void clickTodayBtn() {

        clickOn(todayBtn);


    }

    public String verifylowestAndHighestTemp() {


        String text = "lowestTemp :" + getTextFromElement(lowestTemp) + "HighestTemp : " + getTextFromElement(highestTemp);

        if (text.contains("41")) {


            System.out.println("The text is succesfully verified " + text);

        } else {


            System.out.println("The verification has failed");
        }
return  text;

    }public boolean displayVerificationofLowest(){

     return    isElementDisplayed(lowestTemp);
    }public void getURL(){

        getURL();
    }
}















