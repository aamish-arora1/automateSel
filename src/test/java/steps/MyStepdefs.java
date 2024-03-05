package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs {
    @Given("i steps.test")
    public void test()
    {
        System.out.println("steps.test");
    }
    @Then("it tested")
    public void it_tested() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("tested");    }

}
