package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadSteps extends BaseClass {


@When("Click on Find Leads")
public void clickOnFindLeads() {
	driver.findElement(By.linkText("Find Leads")).click();
}
@When("Click on Phone")
public void clickOnPhone() {
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
}
@When("Click on phoneNumber and enter phoneNumber")
public void clickOnPhoneNumberAndEnterPhoneNumber() {
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
}
@When("Click on Find Leads button")
public void clickOnFindLeadsButton() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
}
@When("select first Lead")
public void selectFirstLead() {
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
}
@When("Click on Edit")
public void clickOnEdit() {
	driver.findElement(By.linkText("Edit")).click();
}
@Then("Update companyName")
public void updateCompanyName() {
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
    
}

@Then("Click on Submit")
public void clickOnSubmit() {
	driver.findElement(By.name("submitButton")).click();
}
@Then("View Lead page should be displayed edit")
public void view_lead_page_should_be_displayed_edit() {
	String title = driver.getTitle();
    
	if (title.contains("View Lead")) {
		System.out.println("Edit lead successfull");
	} else {
		System.out.println("Edit lead fail");
	}
}
}