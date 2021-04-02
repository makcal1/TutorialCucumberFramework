package webPages;
import Utils.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
public class ElementUtil {
    /**
     * Fluentwait method which is used for elements
     * @param locator
     * @return
     */
    public static WebElement webaction(final By locator) {
Wait<WebDriver> wait= new FluentWait<WebDriver>(BasePage.get())

       .withTimeout(Duration.ofSeconds(15))
       .pollingEvery(Duration.ofSeconds(1))
       .ignoring(NoSuchElementException.class)
       .ignoring(StaleElementReferenceException.class)
        .ignoring(ElementClickInterceptedException.class)
        .withMessage("Webdriver waited for 15 seconds but could not find the element, and so Timeoutexcepton would have been throwed.");

return  wait.until(new Function<WebDriver, WebElement>() {
   public WebElement apply(WebDriver driver) { return  driver.findElement(locator);}
});
        /**
         * SendKeys method
         * @param locator
         * @param value
         */
    }public void sendValue(By locator,String value){
     try {
         webaction(locator).sendKeys(value);
     }catch (Exception e){
         System.out.println("Some exception occured while sending value" + locator);
     }
        /**
         * ClickOn method is used click the element
         * @param locator
         */

    }public void clickOn(By locator){

        webaction(locator).click();
     /**
     * GetText method
     * @param locator
     * @return
     */
}public String getTextFromElement(By locator){
        return  webaction(locator).getText();

        /**
         * clear method
         * @param locator
         */
    }public void clear(By locator){
        webaction(locator).clear();

        /**
         * isDisplayed Method
         * @param locator
         * @return
         */

    }public boolean isElementDisplayed(By locator){
        return  webaction(locator).isDisplayed();

        /**
         * isSelected Method
         * @param locator
         * @return
         */
    }public boolean isElementSelected(By locator){

       return  webaction(locator).isSelected();
        /**
         * isEnabled Method
         * @param locator
         * @return
         */
    }public boolean isElementEnabled(By locator){
        return  webaction(locator).isEnabled();
        /**
         * findElements method
         * It is used multiple locators
         * @param locator
         * @return
         */


    }public List<WebElement> webElements(By locator){

        return  BasePage.get().findElements(locator);
        /**
         * DropDown Select Text Method
         * @param locator
         * @param dropDownText
         */
    }public void selectFromDropDownText(By locator, String dropDownText){

        WebElement text = webaction(locator);
        Select selecttext = new Select(text);
        selecttext.selectByVisibleText(dropDownText);

        /**
         * ScrollDown method using scrollIntoView
         * @param locator
         */

    } public void scrollByElement(By locator){

      WebElement scrollElement = webaction(locator);
      JavascriptExecutor js = (JavascriptExecutor) BasePage.get();
        js.executeScript("argument[0].scrollIntoView;", scrollElement);


        /**
         * MoveToElement Actions class
         * @param locator
         */
    }
        public String getScreenShot(String name) {
            SimpleDateFormat df = new SimpleDateFormat("-yyyy-MM-dd-HH-mm");
            String date = df.format(new Date());
            TakesScreenshot ts = (TakesScreenshot) BasePage.get();
            File source = ts.getScreenshotAs(OutputType.FILE);
            String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
            File finalDestination = new File(target);
            try {
                FileUtils.copyFile(source, finalDestination);
            } catch (IOException e) {
                e.printStackTrace();


            }
return  target;
        }}