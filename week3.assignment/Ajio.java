package week3.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(@for,'Fashion')]")).click();
		Thread.sleep(3000);
		String attribute = driver.findElement(By.xpath("//div[contains(@aria-label,'Found')]"))
				.getAttribute("aria-label");
		System.out.println(attribute);

		List<WebElement> brandName = driver.findElements(By.tagName("strong"));
		int totalBrand = brandName.size();
		System.out.println("Total displayed brands in the mens bag section is " + totalBrand);
		System.out.println("Brand as per the Ajio: ");
		
		List<String>list =new ArrayList<>();
		for (WebElement eachBrand : brandName) {
			String text = eachBrand.getText();
			System.out.println(text);
			list.add(text);	
		}
		System.out.println(".....................................");
// Removing Duplicates
		    System.out.println("Unique Brands are: ");
			Set<String> unique =new TreeSet<>(list);
			for (String removeDuplicate : unique) {
			}
			System.out.println(unique);
			
		
		System.out.println("......................................");

			
			
			  List<WebElement> bagName =
			  driver.findElements(By.xpath("//div[@class='nameCls']")); //
			  //System.out.println(bagName);
			  
			  int totalBag = bagName.size();
			  System.out.println("Total bags in the page is " + totalBag);
			  
			  for (WebElement eachBag : bagName) { String text2 = eachBag.getText();
			  System.out.println(text2);
			  
			  }
			 
			 

		}

	}


