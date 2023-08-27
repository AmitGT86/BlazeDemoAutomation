

package steoDefinitionBlaze;

//import io.cucumber.java.en.*;

//import org.junit.Assert;
import org.openqa.selenium.By;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;



public class Demo {

 WebDriver driver = null;
 WebDriverWait wait;
 

 @Given("browser is open")
	public void browser_is_open() {
		// Initiate the Chrome-driver and open the browser.
		System.setProperty("webdriver.chrome.driver", "/Users/amitbarua/Downloads/chromedriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}



 @Then("User goes to Blaze Demo website")
 public void user_is_on_google_search_page() {
  // Navigate to google.com
  driver.navigate().to("https://blazedemo.com");
 }

 @And("User waits {int} seconds to see")
	public static void user_wait_see(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}
 
 @And("User chooses Departure city")
 public void user_chooses() {
    driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")).click();
    driver.findElement(By.cssSelector("[value='Paris']")).click();
    wait = new WebDriverWait(driver, 8);
    
 }

 @And("User chooses Destination city")
 public void user_chooses_again() {
	    driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")).click();
	    driver.findElement(By.cssSelector("[value='Rome']")).click();
	    wait = new WebDriverWait(driver, 8);
 }
	
 @And("User clicks on Find Flights")
 public void hits_enter() {
   driver.findElement(By.cssSelector("[value='Find Flights']")).click();
   
 }

 @And("User waits {int} seconds")
	public static void user_wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
    
	}
 
  @And("User chooses flight")
  	public void user_chooses_flight() {
	  WebElement row= driver.findElement(By.xpath("//td[contains(text(), '" + 9696  + "')]"));
	  //driver.findElement(By.xpath("//td[contains(text(), '" + Aer Lingus  + "')]"));
	  WebElement button = row.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input"));
      button.click();
	  
  }
  
  
  @And("User waits {int} seconds again")
	public static void user_wait_again(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
  
	}
  
  
  @And("User enter {string} as the name")
  public void user_enter_name(String name) {
      WebElement nameInput = driver.findElement(By.id("inputName"));
      nameInput.sendKeys(name);
      
  }
 
  
  @And("User enter {string} as the address")
  public void user_enter_address(String name) {
      WebElement nameInput = driver.findElement(By.id("address"));
      nameInput.sendKeys(name);
      
  }

  @And("User enter {string} as the city")
  public void user_enter_city(String name) {
      WebElement nameInput = driver.findElement(By.id("city"));
      nameInput.sendKeys(name);
      
  }

  @And("User enter {string} as the state")
  public void user_enter_state(String state) {
      WebElement stateInput = driver.findElement(By.id("state"));
      stateInput.sendKeys(state);
  }

  @And("User enter {string} as the zip code")
  public void user_enter_zip_code(String zipCode) {
      WebElement zipCodeInput = driver.findElement(By.id("zipCode"));
      zipCodeInput.sendKeys(zipCode);
  }

  @And("User select {string} as the card type")
  public void user_select_card_type(String cardType) {
      WebElement cardTypeDropdown = driver.findElement(By.id("cardType"));
      cardTypeDropdown.sendKeys(cardType);
  }
  
  @And("User enter {string} as the credit card number")
  public void user_enter_credit_card_number(String creditCardNumber) {
      WebElement cardNumberInput = driver.findElement(By.id("creditCardNumber"));
      cardNumberInput.sendKeys(creditCardNumber);
  }

  @And("User select {string} as the card expiration month")
  public void user_select_card_expiration_month(String expirationMonth) {
      WebElement expirationMonthDropdown = driver.findElement(By.id("creditCardMonth"));
      expirationMonthDropdown.sendKeys(expirationMonth);
  }
  
  @And("User select {string} as the card expiration year")
  public void user_select_card_expiration_year(String expirationYear) {
      WebElement expirationYearDropdown = driver.findElement(By.id("creditCardYear"));
      expirationYearDropdown.sendKeys(expirationYear);
  }

  @And("User enter {string} as the name on card")
  public void user_enter_name_on_card(String nameOnCard) {
      WebElement nameOnCardInput = driver.findElement(By.id("nameOnCard"));
      nameOnCardInput.sendKeys(nameOnCard);
  }

  @And("User waits {int} seconds to review")
	public static void user_wait_again2(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

  
  @And("User click the {string} button")
 public void user_click_button(String buttonText) {
      WebElement button = driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input"));
      button.click();
  }
  
  
  @And("User waits {int} seconds to confirm")
	public static void user_wait_again3(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}
 
  @Then("Browser closes")
  public void browser_closes(){
	  driver.close();	
	  
	 }
  


 
 /*@Then("User is navigated to search feature")
 public void user_is_navigated_to_search_feature() {
 // The test case should pass if the resulting page 
 // contains an expected text - Say ""What is Cucumber Test"
 driver.getPageSource().contains("Test automation Software"); 
 
 // Finally, closing driver after test is complete
   driver.close();
   
   }*/
 
 
}
