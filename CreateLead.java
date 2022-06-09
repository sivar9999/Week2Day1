package week2Day1Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("siva");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("raja");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("group7");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("group7need to add");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sivarockz.44@gmail.com");
		//driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("sivarockz.44@gmail.com");
		WebElement fin= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select s=new Select(fin);
		s.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		//driver.close();
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		

	}
	

}
