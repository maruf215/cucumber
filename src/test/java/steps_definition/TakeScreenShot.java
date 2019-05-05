package steps_definition;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import page_objs.CucumberProjectObjs;

public class TakeScreenShot {
	/*public static WebDriver driver;
	public static UI ui;
	public static Logger log=Logger.getLogger(CucumberProjectObjs.class.getName());
	
	@After
	public void embedScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date date = new Date();
				String currentTime = dateFormat.format(date);
				System.out.println("----------------" + currentTime);
			} catch (WebDriverException wde) {
				System.out.println(wde.getMessage());
			} catch (ClassCastException cee) {
				cee.printStackTrace();

			}

		}
		log.info("browser successfully closed");
		driver.close();
		log.info("driver is quiting");
		driver.quit();
	}*/

}
