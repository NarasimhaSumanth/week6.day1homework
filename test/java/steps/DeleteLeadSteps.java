package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLeadSteps extends BaseClass{
	public String leadID1;
	@When("Click on Find Leads delete")
	public void clickOnFindLeadsDelete() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("Click on Phone delete")
	public void clickOnPhoneDelete() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@When("Click on phoneNumber delete and enter phoneNumber delete")
	public void clickOnPhoneNumberDeleteAndEnterPhoneNumberDelete() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
	}
	@When("Click on Find Leads button delete")
	public void clickOnFindLeadsButtonDelete() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	
	@When("select first Lead and get text")
	public void selectFirstLeadAndGetText() {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		leadID1 = leadID;
	}
	@When("Search lead")
	public void searchLead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@Then("Delete Lead")
	public void deleteLead() {
		driver.findElement(By.linkText("Delete")).click();
	}
	@Then("Click on Find Leads again")
	public void clickOnFindLeadsAgain() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Then("Enter lead id")
	public void enterLeadId() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID1);
	}
	@Then("Click on Find Leads again after delete")
	public void clickOnFindLeadsAgainAfterDelete() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@Then("Check for delete lead text")
	public void checkForDeleteLeadText() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Delete lead successfull");
		} else {
			System.out.println("Delete lead failed");
		}
	}

}
