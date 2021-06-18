

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Helper {


    static String ChromePath = "/home/otuschling/Programming/Selenium/chromedriver";
    static String ChromeProperty = "webdriver.chrome.driver";
    WebDriver chromeDriver ;

    public WebDriver GetChromeDriverPage(String pageUrl){


        System.setProperty(ChromeProperty, ChromePath);

        chromeDriver = new ChromeDriver();
        chromeDriver.get (pageUrl);
        chromeDriver.manage().window().maximize();

        chromeDriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        return chromeDriver;
    }

    public void CheckBrokenLinks(WebDriver webDriver, String pageUrl){

        chromeDriver = webDriver;

        String homePage = pageUrl;
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;

        List<WebElement> links = chromeDriver.findElements(By.tagName("a"));

        Iterator<WebElement> it = links.iterator();

        while(it.hasNext()){

            url = it.next().getAttribute("href");

            System.out.println(url);

            if(url == null || url.isEmpty()){
                System.out.println("URL is null or it is empty");
                continue;
            }

            if(!url.startsWith(homePage)){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }

            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                huc.setRequestMethod("HEAD");

                huc.connect();

                respCode = huc.getResponseCode();

                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                    // Then we assert
                    Assert.fail(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }

            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
