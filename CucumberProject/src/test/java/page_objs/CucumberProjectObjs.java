package page_objs;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import steps_definition.Excel;
import steps_definition.UI;

public class CucumberProjectObjs {
	public static WebDriver driver;
	public static UI ui;
	public static Logger log = Logger.getLogger(CucumberProjectObjs.class.getName());

	public CucumberProjectObjs(WebDriver driver, UI ui) {
		this.driver = driver;
		this.ui = ui;
		PageFactory.initElements(driver, this);

	}

	public void test() {
		System.out.println("Test Passed");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Sajib");
		log.info("Log test Case passed");
		
		

	}
}
