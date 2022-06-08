package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Step_Definition {
	
// Palindrome

private String testPalindrome;
private boolean isPalindrome;

@Given("I entered string {string}")
public void iEnteredString(String toTest) {
    testPalindrome = toTest;
}

@When("I test it for Palindrome")
public void iTestItForPalindrome() {
    isPalindrome = testPalindrome.equalsIgnoreCase(new StringBuilder(testPalindrome).reverse().toString());
}

@Then("the result should be {string}")
public void theResultShouldBe(String result) {
    boolean expectedResult = Boolean.parseBoolean(result);
    if (expectedResult) {
        Assert.assertTrue(isPalindrome);
    } else {
        Assert.assertFalse(isPalindrome);
    }
}


@Given("I entered word {word}")
public void iEnteredStringWord(String word) {
    testPalindrome = word;
}

@Then("the output should be {string}")
public void theOutputShouldBeResult(String output) {
    theResultShouldBe(output);
}

// Simple Steps

@Before("@One_Two")
public void beforeOne_TwoScenario(){
    System.out.println("@One_Two --> This will run before the Scenario");
}	

@After("@One_Two")
public void afterOne_TwoScenario(){
    System.out.println("@One_Two --> This will run after the Scenario");
}
@Given("^this is the first step$")
public void This_Is_The_First_Step(){
	System.out.println("This is the first step");
}

@When("^this is the second step$")
public void This_Is_The_Second_Step(){
	System.out.println("This is the second step");
}

@Then("^this is the third step$")
public void This_Is_The_Third_Step(){
	System.out.println("This is the third step");
}
@Given("^this is the fourth step$")
public void This_Is_The_Foutrh_Step(){
	System.out.println("This is the fourth step");
}

@When("^this is the fifth step$")
public void This_Is_The_Fifth_Step(){
	System.out.println("This is the fifth step");
}

@Then("^this is the sixth step$")
public void This_Is_The_Sixth_Step(){
	System.out.println("This is the Sixth step");
}
}
