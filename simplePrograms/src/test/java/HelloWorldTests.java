import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class HelloWorldTests {
    @Test
    public void appHasAGreeting() {
        HelloWorld classUnderTest = new HelloWorld();
        assertEquals(classUnderTest.getGreeting(), "Hello World", "app should have a greeting");
    }

}
