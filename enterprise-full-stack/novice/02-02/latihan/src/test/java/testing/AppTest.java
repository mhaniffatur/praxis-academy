/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package testing;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNull("app should have a greeting", classUnderTest.getGreeting());
        assertEquals("10 x 0 must be 0", 0, classUnderTest.multiply(10, 0));
        assertEquals( "0 x 10 must be 0", 0, classUnderTest.multiply(0, 10));
        assertEquals( "0 x 0 must be 0", 0, classUnderTest.multiply(0, 0));
    }

}
