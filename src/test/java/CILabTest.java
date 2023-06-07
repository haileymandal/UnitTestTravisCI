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

    @Test
    public void detectCapitalUse_NewObject_ReturnsFalse() {
        //start with the action
        boolean actual = myString.detectCapitalUse();

        //the test
        assertFalse(actual);

    }


}
