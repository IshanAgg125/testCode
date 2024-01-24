
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class unitTest {

    @Test
    public void testGetMultiplication() {
        toolsOfMath tom = new toolsOfMath(5, 6);
        assertEquals(30, tom.getMultiplication());
    }
}