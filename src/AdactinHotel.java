import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AdactinHotel {
	
	private static final int Two = 0;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty
		("webdriver.chrome.driver", "C:\\Users\\ragav\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		WebElement hotel =driver.findElement(By.id("username"));
		
		hotel.sendKeys("Greens8767");
		
		WebElement element =driver.findElement(By.id("password"));
		
		element.sendKeys("L4R739");
		
		WebElement findElement = driver.findElement(By.id("login"));
		
		findElement.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select s1 = new Select(location);
		s1.selectByIndex(1);
	 
		WebElement hotel2 = driver.findElement(By.id("hotels"));
		Select s2 = new Select(hotel2);
		s2.selectByIndex(2);
		
		WebElement rt = driver.findElement(By.id("room_type"));
		Select s3 = new Select(rt);
		s3.selectByIndex(3);
		
		WebElement rn = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(rn);
		s4.selectByIndex(4);
		
		WebElement di = driver.findElement(By.id("datepick_in"));
		di.sendKeys("10/06/2023");
		
		WebElement dao = driver.findElement(By.id("datepick_out"));
		dao.sendKeys("13/06/2023");
		
		WebElement adul = driver.findElement(By.id("adult_room"));
	    Select s5 = new Select(adul);
	    s5.selectByIndex(3);
	    
	    WebElement chil = driver.findElement(By.id("child_room"));
	    Select s6 = new Select(chil);
	    s6.selectByIndex(1);
	    
	    WebElement sum = driver.findElement(By.id("Submit"));
	    sum.click();
	    
	    WebElement but = driver.findElement(By.id("radiobutton_0"));
	    but.click();
	    
	    WebElement con = driver.findElement(By.id("continue"));
	    con.click();
	    
	    WebElement fn = driver.findElement(By.id("first_name"));
	    fn.sendKeys("Vijayaragavan");
	    
	    WebElement ln = driver.findElement(By.id("last_name"));
	    ln.sendKeys("Radhakrishnan");
	    
	    WebElement addr = driver.findElement(By.id("address"));
	    addr.sendKeys("no-203,Chennai");
	    
	    WebElement ccn = driver.findElement(By.id("cc_num"));
	    ccn.sendKeys("1234567890987654");
	    
	    WebElement cct = driver.findElement(By.id("cc_type"));
	    Select s7 = new Select(cct);
	    s7.selectByIndex(3);
	    
	    WebElement ccem = driver.findElement(By.id("cc_exp_month"));
	    Select s8 = new Select(ccem);
	    s8.selectByVisibleText("March");
		
	    WebElement ccex = driver.findElement(By.id("cc_exp_year"));
	    Select s9 = new Select(ccex);
	    s9.selectByVisibleText("2026");
	    
	    WebElement cvv = driver.findElement(By.id("cc_cvv"));
	    cvv.sendKeys("123");
	    
	    WebElement booknow = driver.findElement(By.id("book_now"));
	    booknow.click();
	    
	    Thread.sleep(6000);
	    WebElement orderNo = driver.findElement(By.id("order_no"));
	    String attribute = orderNo.getAttribute("value");
	    
	    System.out.println(attribute);
	    
	}
}
