//arrange, action, assert

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    //first test, testing null string
    @Test
    public void detectCapitalUse_NewObject_ReturnsFalse() {
        //start with the action
        boolean actual = myString.detectCapitalUse();

        //the test
        assertFalse(actual);
    }

    //second test, testing empty string
    @Test
    public void detectCapitalUseTest_EmptyString_ReturnsFalse() {
        myString.setString("");

        boolean actual = myString.detectCapitalUse();

        assertFalse(actual);
    }

    //third test, testing uppercase letters
    @Test
    public void detectCapitalUseTest_AllCaps_ReturnsTrue() {
        myString.setString("A");

        boolean actual = myString.detectCapitalUse();

        assertTrue(actual);
    }

    //fourth test, testing lowercase letters
    @Test
    public void detectCapitalUseTest_AllLower_ReturnsFalse() {
        myString.setString("a");

        boolean actual = myString.detectCapitalUse();

        assertFalse(actual);
    }

    //fifth test, testing getString method
    @Test
    public void getString_SameString_ReturnsTrue() {
        myString.setString("Hello!");

        String expected = "Hello!";
        String actual = myString.getString();

        assertEquals(expected, actual);
    }

    //sixth test, testing setString method
    @Test
    public void setString_ReturnsUpdatedString(){
        String actual = "Sunny Days";
        myString.setString(actual);

        String expected = myString.getString();

        assertEquals(expected, actual);
    }

    //seventh test, testing capital letter with lower case letters
    @Test
    public void detectCapitalUseTest_LowerAndUppercase_ReturnsTrue() {
        myString.setString("Testing");

        boolean actual = myString.detectCapitalUse();

        assertTrue(actual);

    }


}
