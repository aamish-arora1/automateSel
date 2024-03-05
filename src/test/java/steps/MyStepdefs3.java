package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs3 {
    @Given("i test 3")
    public void test()
    {
        System.out.println("steps.test");
    }
    @Then("it tested 3")
    public void it_tested() {
        System.out.println("tested");
    }
}
