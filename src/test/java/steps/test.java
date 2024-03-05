package steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import runner.Drivers;

import static enteties.Platform.web;



public class test {


    @Before
    public static void before() {
        System.out.println("before");
    }
    @BeforeAll
    public static void beforeAll()
    {

    }
    @AfterAll
    public static void closeAll()
    {
        Drivers.closeDriver();
        System.out.println("closed");
    }
}
