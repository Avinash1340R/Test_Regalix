package projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest1 {
  
  @BeforeMethod
  public void browseropen()
  
  {
	 System.setProperty("webdriver.gecko.driver", "D:\\All_Jars_Files\\geckodriver.exe");
	 System.out.println("used gecko");
  }
  @Test
  public void f() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.myntra.com/");
	  System.out.println("launching the myntra");
	  
	 
  }
  
  @AfterMethod
  public void close()
  {

	  System.out.println("browser closed");
  }
  }
  
