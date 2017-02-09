import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class StringReverseTests {
    @DataProvider(name="palindromeCases")
    private Object[][] irrelevantName() {
        return new Object[][] {{"anna"},
                {"kayak"},
                {""},
                {"hannah"}};
    }

    @Test(dataProvider = "palindromeCases")
    public void reversedSometimesIsStillSame(String word) {
        // given
        StringReverse classUnderTest = new StringReverse();

        // when
        final String reverse = classUnderTest.reverse(word);
        // then
        assertEquals(reverse, word);
    }


}
