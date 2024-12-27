package simplemavenbuild;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mavenbuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // System Property for Chrome Driver   
       // System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe"); 
		// Instantiate a ChromeDriver class.     
		//WebDriverManager.chromedriver().setup();
        //WebDriver driver=new ChromeDriver();  
		WebDriver driver = WebDriverManager.chromedriver().create();
             
          
           // Launch Website  
        driver.navigate().to("http://www.javatpoint.com/");  
        //driver.get("www.google.com");
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          
          //Scroll down the webpage by 5000 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 5000)");   
          
         // Click on the Search button  
        driver.findElement(By.linkText("Core Java")).click();  
	}

}
