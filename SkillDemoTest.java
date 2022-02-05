import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class SkillDemoTest {

    @Test
    public void testMultiply() {
        assertEquals(5.0, SkillDemoOne.multiply(2, 2)); //Fail Initially
    }

}