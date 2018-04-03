package chaperone.pack.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Quality_Audit {
	public WebDriver driver;
	public String baseurl = "https://ummdjango-145608.appspot.com/";

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "D:\\All_Jars_Files\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("browser will open");
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test()
	public void login() throws Exception, NoSuchElementException {

	    driver.findElement(By.xpath("//div[@class='container']/div[1]/div[1]/following-sibling::a")).click();
		Thread.sleep(3000);
		System.out.println("Login using google mail");

		// username
		// div[@class='aCsJod oJeWuf']//input[@id='identifierId' or @type='email']
		WebElement uname = driver.findElement(By.xpath("//input[@id='identifierId']"));
		uname.sendKeys("avinash.samantaray@regalix-inc.com");
		// click on Next
        driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(5000);
		// password
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("avi12345");   
		// click on Next
		WebElement next1 = driver.findElement(By.xpath("//span[text()='Next']"));
		next1.click();
		Thread.sleep(1000);
		System.out.println("login to Chaperone Homepage");
		//
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/knowledgebase/admin/']/i")).click();
		System.out.println("Navigate to Admin panel page");
		
		// click on upload button
	    driver.findElement(By.xpath("//a[@href='/csr/file-upload/']")).click();
	    //select choose dropdown
	    Select sc= new Select(driver.findElement(By.xpath("//select[@id='process-selected']")));
	    //sc.selectByIndex(4);
	 //  Print all the options for the selected drop down and select one option of your choice
	 		// Get the size of the Select element
	 		List<WebElement> Size = sc.getOptions();
	 		int iListSize = Size.size();
	 		for(int i =0; i < iListSize ; i++){
				// Storing the value of the option	
				String allvalues = sc.getOptions().get(i).getText();
				// Printing the stored value
				System.out.println(  allvalues  );
	    if(allvalues.equals("Test_12"))
	    {
			sc.selectByIndex(i);
			break;
	    } 
	 		}
	 
	    Select sc1 = new Select(driver.findElement(By.xpath("//select[@id='quarter-selcetd']"))); 
	    sc1.selectByIndex(18);
	    //  File upload
	    try
	    {
	    	 driver.findElement(By.id("excelfile")).sendKeys("C:\\Users\\Avinash\\Documents\\Chaperone_Data_test.xlsx");

	    }
	    catch(Exception e)
	    {
	    	System.out.println("Invalid file");
	    }
	    if ( !driver.findElement(By.id("guide-check")).isSelected() )
	    {
	         driver.findElement(By.id("guide-check")).click();
	    }
	    //click on Export to Backend
	    driver.findElement(By.xpath("//input[@id='viewfile']")).click();
	    
	    Thread.sleep(2000);
	    // Accepting alert
	    Alert element = driver.switchTo().alert();
	    element.accept();
	    
	    Thread.sleep(2000);
	    
	    
	    driver.close();
	    System.out.println("close the browser");
	    
	    
	}
	
	    }

	 		
	 
	  
