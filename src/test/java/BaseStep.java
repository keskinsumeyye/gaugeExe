import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BaseStep extends BaseTest {

    @Step("1 saniye  bekle")
    public void waitForsecond() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Step("Arama alanına <key> bilgisini yaz")
    public void search(String key) {
        WebElement element = driver.findElement(By.cssSelector("input[id='query']"));
        element.sendKeys(key);
    }

    @Step("<selector> css li elemente tıkla")
    public void clickCssSelector(String selector) {
        driver.findElement(By.cssSelector(selector)).click();

    }

    @Step("Css <css> li elementi bul ve enter butonuna bas")
    public void clickEnterButton(String css) {
        WebElement element = driver.findElement(By.cssSelector(css));
        element.sendKeys(Keys.ENTER);
    }

    @Step("Arama büyüteç simgesine tıkla")
    public void clickSearchicon() {
        driver.findElement(By.cssSelector("i[class='ihcon ihcon-search']")).click();
    }

    @Step("Kaydir")
    public void implementation1() {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,500)");
    }
    @Step("<xpath> xpathli elemente tikla")
    public void asdf(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
}
