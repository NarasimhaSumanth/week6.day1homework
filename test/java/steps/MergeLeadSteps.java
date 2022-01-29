package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLeadSteps extends BaseClass{
	public String leadID2;
	
	@When("Click on Merge Leads")
	public void clickOnMergeLeads() {	
		driver.findElement(By.linkText("Merge Leads")).click();
	}
	@When("Click on From lookup")
	public void clickOnFromLookup() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}
	@When("Enter From lead and click on find leads")
	public void enterFromLeadAndClickOnFindLeads() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("sumanth");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@When("Get Text of first displayed lead")
	public void getTextOfFirstDisplayedLead() throws InterruptedException {
		Thread.sleep(1000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		leadID2 = leadID;
	}
	@When("Click on first displayed lead")
	public void clickOnFirstDisplayedLead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@When("Click on To lookup")
	public void clickOnToLookup() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
driver.switchTo().window(allhandles.get(0));
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}
	@When("Enter To lead and click on find leads")
	public void enterToLeadAndClickOnFindLeads() throws InterruptedException {
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("sumanth");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
	}
	@When("Click on Find Leads merge")
	public void clickOnFindLeadsMerge() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@Then("Click on Merge")
	public void clickOnMerge() {
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
	}
	@Then("Accept Alert")
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	@Then("Click on Find Leads merge again")
	public void clickOnFindLeadsMergeAgain() {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID2);
	}
	@Then("Click on Find Leads after merging")
	public void clickOnFindLeadsAfterMerging() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@Then("Check for text message")
	public void checkForTextMessage() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("merge lead successfull");
		} else {
			System.out.println("merge lead fail");
		}
	}

}
