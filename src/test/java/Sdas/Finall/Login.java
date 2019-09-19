package Sdas.Finall;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	//
		public static void main(String[] args) throws Exception {
			

			System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");		
			System.out.println(System.getProperty("webdriver.chrome.driver"));
			WebDriver driver;
			driver = new ChromeDriver();
			System.out.println(System.getProperty("webdriver.chrome.driver"));
			 String baseUrl = "https://www.gmail.com";
		     driver.get(baseUrl);
		     Thread.sleep(3500);
		     List<WebElement> list = driver.findElements(By.cssSelector("a"));
		     for (WebElement link : list) {
		         System.out.println(link.getText());
		     }
				   //   WebElement inputByValue = driver.findElement(By.xpath("//input[@value='email']"));
				      WebElement Uname = driver.findElement(By.xpath("//input[@type='email'][starts-with(@id,'identifierId')]"));
				      Uname.sendKeys("shravoni");
				      System.out.println(Uname);
			
				//      WebElement Next = driver.findElement(By.xpath("span[text()='Next']"));
				      WebElement Next=driver.findElement(By.xpath("//span[contains(@class,'RveJvd snByac')][contains(text(),'Next')]"));
				      Next.click();
				      Thread.sleep(3500);
				      WebElement Pswd = driver.findElement(By.xpath("//input[@type='password'][contains(@name,'password')]"));
				      Pswd.sendKeys("soni@2019");
				      System.out.println(Pswd);
				      WebElement Next2=driver.findElement(By.xpath("//span[contains(@class,'RveJvd snByac')][contains(text(),'Next')]"));
				      Next2.click();
				      
				      Thread.sleep(5500);
				      
				      WebElement Compose=driver.findElement(By.xpath("//div[contains(@class,'T-I J-J5-Ji T-I-KE L3')]"));
				      Compose.click();
				      System.out.println("compose clicked");
				   //   WebElement To =  driver.findElement(By.xpath("//textarea[@name='to'][contains(@aria-label,'To')]"));
				      WebElement To =  driver.findElement(By.name("to"));
				      To.sendKeys("shravoni@gmail.com");
				      WebElement MailWriting=driver.findElement(By.xpath("//div[contains(@class,'Am Al editable LW-avf')]"));
				      MailWriting.sendKeys("This is Automatic Generated Email-Author Shravoni das");
				      WebElement Subject = driver.findElement(By.xpath("//input[@name='subjectbox']"));
				      Subject.sendKeys("Automatic Mail-Selenium Automation");
				      Thread.sleep(3500);
				      Thread.sleep(5500);
				      
				      
				 //     WebElement SendMail=driver.findElement(By.xpath("//div[contains(@class,'T-I J-J5-Ji aoO v7 T-I-atl L3 T-I-JW')]"));
				      WebElement SendMail=driver.findElement(By.id(":g9"));
		              SendMail.click();
				   //  driver.quit();
				     System.out.println("Mail Set ");
				     
				       driver.quit();
				      /// WebDriverWait wait = new WebDriverWait(driver, 10);
				     // WebElement el = wait.until(presenceOfElementLocated(by));
		}}


