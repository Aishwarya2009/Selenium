package april;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		printLink();
		driver.quit();
	}

	public static void printLink() {
		
		driver.get("http://www.amazon.com");

		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());

		for (int i = 0; i < link.size(); i++) {

			String s = link.get(i).getText();
			
			if (s.contains(" ")) {
			String s2 = s.replaceAll(" ", " ");
			System.out.println(s2);
			}

		}
	}

}
