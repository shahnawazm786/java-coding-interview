package browsermobprox;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.EnumSet;
import java.util.logging.Level;


public class BrowserMobProxyExample {

    @Test
    public void generateHARFile() throws InterruptedException, IOException {
        //1. Start the proxy on some port
        BrowserMobProxy myProxy=new BrowserMobProxyServer();

        myProxy.start(0);

        //2. Set SSL and HTTP proxy in SeleniumProxy
        Proxy seleniumProxy=new Proxy();
        seleniumProxy.setHttpProxy("localhost:" +myProxy.getPort());
        seleniumProxy.setSslProxy("localhost:" +myProxy.getPort());

        //3. Add Capability for PROXY in DesiredCapabilities
        DesiredCapabilities capability=new DesiredCapabilities();
        capability.setCapability(CapabilityType.PROXY, seleniumProxy);
        //capability.acceptInsecureCerts();
        //capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

        //4. Set captureTypes
        EnumSet <CaptureType> captureTypes=CaptureType.getAllContentCaptureTypes();
        captureTypes.addAll(CaptureType.getCookieCaptureTypes());
        captureTypes.addAll(CaptureType.getHeaderCaptureTypes());
        captureTypes.addAll(CaptureType.getRequestCaptureTypes());
        captureTypes.addAll(CaptureType.getResponseCaptureTypes());

        //5. setHarCaptureTypes with above captureTypes
        myProxy.setHarCaptureTypes(captureTypes);

        //6. HAR name
        myProxy.newHar("MyHAR");

        //7. Start browser and open URL
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chrome/chromedriver1.exe");
       // WebDriverManager.chromedriver().setup();

        ChromeOptions options=new ChromeOptions();
        options.merge(capability);
        WebDriver driver=new ChromeDriver(options);

        //Print Driver Capabilities
        System.out.println("Driver Capabilities===> \n" +((RemoteWebDriver)driver).getCapabilities().asMap().toString());

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        Thread.sleep(5000);

        Har har=myProxy.getHar();

        File myHARFile=new File(System.getProperty("user.dir")+"/scr/test/resources/googleHAR1.har");
        har.writeTo(myHARFile);

        System.out.println("==> HAR details has been successfully written in the file.....");

        driver.close();
    }
}