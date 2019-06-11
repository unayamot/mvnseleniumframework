package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import setup.TestBase;
import static util.Screenshot.*;

public class DemoTest extends TestBase {

	@Test(groups = { "functest" })
    public void demoTest() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("HELLO WORLD");
        try {
			take(driver);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

}