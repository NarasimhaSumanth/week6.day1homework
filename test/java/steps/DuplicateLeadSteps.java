package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLeadSteps extends BaseClass{
	
	@When("Click on Find Leads duplicate")
	public void clickOnFindLeadsDuplicate() {

		driver.findElement(By.linkText("Find Leads")).click();		
		
	}
	@When("Click on Phone duplicate")
	public void clickOnPhoneDuplicate() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@When("Click on phoneNumber duplicate and enter phoneNumber duplicate")
	public void clickOnPhoneNumberDuplicateAndEnterPhoneNumberDuplicate() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	}
	@When("Click on Find Leads button duplicate")
	public void clickOnFindLeadsButtonDuplicate() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	@When("select first Lead duplicate")
	public void selectFirstLeadDuplicate() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@Then("Click on DuplicateLead")
	public void clickOnDuplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
				
	}
	@Then("Click on Submit duplicate")
	public void clickOnSubmitDuplicate() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("View Lead page should be displayed duplicate")
	public void viewLeadPageShouldBeDisplayedDuplicate() {
		String title = driver.getTitle();
	    
		if (title.contains("View Lead")) {
			System.out.println("Duplicate lead successfull");
		} else {
			System.out.println("Duplicate lead fail");
		}
	}

}
