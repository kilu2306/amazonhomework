import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestSuite extends BaseTest {

    String baseUrl = "https://www.amazon.co.uk/";

    @Test
//1. Open the URL https://www.amazon.co.uk/
    public void dellLaptop() {
        openBrowser(baseUrl);
        //accept cookies
        driver.findElement(By.id("sp-cc-accept")).click();
//     2. Type "Dell Laptop" in the search box and press enter or click on search
//   Button.
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell Laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
//    3. Click on the checkbox brand dell on the left side.
        driver.findElement(By.xpath("//li[@id=\"p_89/Dell\"]/descendant::i")).click();

//    4. Verify that the  30(May be different) products are displayed on the page.
        List<WebElement> productList = driver.findElements(By.xpath("//a[@class=\"a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal\"]"));
        int actualSize = productList.size();
        int expactedSize = 30;
        Assert.assertEquals("verify product size :", expactedSize, actualSize);

//    5. Print all product names in the console.

        for (WebElement productListName : productList) {
            System.out.println(productListName.getText());

        }
//    5. Close the Browser
        driver.close();


    }


}
