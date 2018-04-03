package projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\All_Jars_Files\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		System.out.println("browser will open");
		d.get("https://ummdjango-145608.appspot.com/");
		
		
		System.out.println("close");
	}

	
}
