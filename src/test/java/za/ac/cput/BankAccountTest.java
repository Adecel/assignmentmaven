package za.ac.cput;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author Rusty Mabiala (219197229)
 *
 * Here I'm gonna test code of the BankAccount
 *
 *
 */

public class BankAccountTest {

    private BankAccount BAcc1;
    private BankAccount BAcc2;
    private BankAccount BAcc3;

    @BeforeEach
    public void setUp() {
        BAcc1 = new BankAccount();
        BAcc1 = BAcc2;
        BAcc1 = BAcc3;

    }

    // Object Equality;
    @Test
    public void testEquality() {
        assertEquals(BAcc1, BAcc2);
    }

    // object identity
    @DisplayName("testing get add method")
    @Test
    void testIdentical(){
        assertSame(10,BankAccount.Identical());
    }

    // failing test
    @Test
    public void TestMultiply() {
        assertEquals(10, BankAccount.Multiply());
        fail("The test case is a prototype.");
    }

    // timetout
    @Test
    void test_timeout_fail() {
        // assertTimeout(Duration.ofSeconds(5), () -> BankAccount.delaySecond(10)); // this will fail
        assertTimeout(Duration.ofSeconds(5), () -> BankAccount.delaySecond(3)); // this will pass
    }

    // disabling test
    @Disabled("Disabled Response method")
    @Test
    void testgetAccount() {
        assertEquals(1234567890, BankAccount.getAccountNumber());
    }
}
