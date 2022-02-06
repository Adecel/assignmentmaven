package za.ac.cput;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Kevin lionel Mombo Ndinga(218180500)
 */
public class ExerciseTest {

    public ExerciseTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }
    @Test
    @Disabled
    public void disabledTest(){
        int x = 450;
        int z = 250;
        int sum = x + z;
        System.out.println("The Sum of x + z = " +sum);

    }

    @Test
    public void testEquality(){
        String red1 = "James";
        String red2 = "James";
        assertEquals(red1, red2);
    }
    @Test
    public void testIdentity(){
        String str1 = "Steph";
        String str2 = "Steph";
        assertSame(str1, str2);
    }
    /* failling test does not work
    @Test
    public void Failingtest() {
        fail("Hello my name is bot ");
    }
    */

}
