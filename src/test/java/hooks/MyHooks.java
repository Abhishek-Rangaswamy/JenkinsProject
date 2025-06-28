package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class MyHooks {

	@Before
	public void setup(Scenario scenario) {
		System.out.println("++ Execution started for the scenario: "+scenario.getName());
	}
	
	@BeforeStep
    public void beforeEachStep(Scenario scenario) {
        System.out.println("⏩ About to execute step in: " + scenario.getName());
    }
	
	 @AfterStep
	    public void afterEachStep(Scenario scenario) {
	        System.out.println("✅ Step completed in: " + scenario.getName());
	        if (scenario.isFailed()) {
	            System.out.println("❌ Step FAILED!");
	        }
	    }
	
	@After
	public void tearDown(Scenario scenario) {
		System.out.println("++ Execution ended for the scenario: "+scenario.getName());
	}
	
}
