package steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSteps extends BaseClass {
	

	/*
	 * @Given("Launch the Browser") public void launch_the_browser() {
	 * 
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * 
	 * 
	 * }
	 * 
	 * @Given("Load the app url") public void load_the_app_url() {
	 * driver.get("http://leaftaps.com/opentaps/control/login"); }
	 */

	/*
	 * @Given("Enter username as Demosalesmanager") public void
	 * enter_username_as_demosalesmanager() {
	 * driver.findElement(By.id("username")).sendKeys("DemoCSR");
	 * 
	 * }
	 */

	/*
	 * @Given("Enter password as crmsfa") public void enter_password_as_crmsfa() {
	 * driver.findElement(By.id("password")).sendKeys("crmsfa"); }
	 */

	/*
	 * @Given("Click on login button") public void click_on_login_button() {
	 * driver.findElement(By.className("decorativeSubmit")).click(); }
	 */


	/*
	 * @Given("Click on CRM\\/SFA link") public void click_on_crm_sfa_link() {
	 * driver.findElement(By.linkText("CRM/SFA")).click();
	 * 
	 * }
	 */

	/*
	 * @Given("Click on Leads link") public void click_on_leads_link() {
	 * driver.findElement(By.linkText("Leads")).click(); }
	 */

	@Given("Click on Create Lead")
	public void click_on_create_lead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("Enter company name as {string}")
	public void enter_company_name_as_legato(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}

	@Given("Enter first name as {string}")
	public void enter_first_name_as_sumanth10(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		
		 
	}

	@Given("Enter last name as {string}")
	public void enter_last_name_as_k(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
	
	/*
	 * @Given("Enter company name as Legato") public void
	 * enter_company_name_as_legato() {
	 * driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS"); }
	 * 
	 * @Given("Enter first name as Sumanth10") public void
	 * enter_first_name_as_sumanth10() {
	 * driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TEST"); }
	 * 
	 * @Given("Enter last name as k") public void enter_last_name_as_k() {
	 * driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K"); }
	 */

	@When("Click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.name("submitButton")).click();  
	}

	@Then("View Lead page should be displayed create")
	public void view_lead_page_should_be_displayed_create() {
		String title = driver.getTitle();
	    
		if (title.contains("View Lead")) {
			System.out.println("Create Lead Successfull");
		} else {
			System.out.println("Create Lead fail");
		}
	}

}
