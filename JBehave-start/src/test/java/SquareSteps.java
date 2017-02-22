import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

/**
 * Early configuration, explicitly inheriting from JBehave {@link Steps}.
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class SquareSteps extends Steps {
    int x;

    @Given("a variable x equal $value")
    public void setX(@Named("value") int v) {
        x = v;
    }

    @When("I square x")
    public void square() {
        x= x*x;
    }

    @Then("x is equal to $value")
    public void thenXshouldBe(@Named("value") int v) {
        if (v != x)
            throw new RuntimeException("x is " + x + ", but should be " + v);
    }
}
