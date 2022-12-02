package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CRMSelenium {
	
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://localhost:3000/");
		
		try {
			driver.findElement(By.xpath("/html/body/div/form/div/div[1]/input")).clear();
			driver.findElement(By.xpath("/html/body/div/form/div/div[1]/input")).sendKeys("usuario@solera.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/form/div/div[3]/input")).click();
			driver.switchTo().alert();
			Alert alert = driver.switchTo().alert();
			Thread.sleep(2000);
			alert.accept();
			driver.findElement(By.xpath("/html/body/div/form/div/div[2]/input")).clear();
			driver.findElement(By.xpath("/html/body/div/form/div/div[2]/input")).sendKeys("bootcamp4");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/form/div/div[3]/input")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div/div[1]/table/tbody/tr[1]/td[6]/button[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div/div[2]/table/tbody/tr[1]/td[7]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div/div[1]/table/tbody/tr[1]/td[1]/a/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/header/div/div/button[1]")).click();
			Select selectWay = new Select (driver.findElement(By.xpath("/html/body/div/div/form/div[2]/select")));
			selectWay.selectByVisibleText("Call");
			driver.findElement(By.xpath("/html/body/div/div/form/div[3]/input")).sendKeys("35353535");
			driver.findElement(By.xpath("/html/body/div/div/form/div[4]/input")).sendKeys("12102022");
			driver.findElement(By.xpath("/html/body/div/div/form/div[5]/textarea")).sendKeys("Llamar y apuntar una cita");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div/form/div[6]/input")).click();
			Thread.sleep(1000);
			driver.switchTo().alert();
			Thread.sleep(1000);
			Alert alert2 = driver.switchTo().alert();
			Thread.sleep(3000);
			alert2.accept();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div/div[1]/table/tbody/tr[1]/td[1]/a/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/header/div/a/h2")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div/div[1]/table/tbody/tr/td[6]/button[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div/header/div/div/button")).click();
			Thread.sleep(2000);
			driver.close();
		} catch (InterruptedException e) {
	    	   System.out.println("Error:"+e);
		}
	}
}
