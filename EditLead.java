package week2Day1Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		WebElement f1= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select s=new Select(f1);
		s.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("hello its very important");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		

	}

}
