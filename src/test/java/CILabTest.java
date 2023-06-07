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

    //first test
    @Test
    public void detectCapitalUse_NewObject_ReturnsFalse() {
        //start with the action
        boolean actual = myString.detectCapitalUse();

        //the test
        assertFalse(actual);

    }

    //second test
    @Test
    public void detectCapitalUseTest_EmptyString_ReturnsFalse() {
        myString.setString("");

        boolean actual = myString.detectCapitalUse();

        assertFalse(actual);

    }

    //third test
    @Test
    public void detectCapitalUseTest_AllCaps_ReturnsTrue() {
        myString.setString("A");

        boolean actual = myString.detectCapitalUse();

        assertTrue(actual);

    }


}
