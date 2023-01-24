package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void nullTest() { assertNotNull("[]"); }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void oneLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void extraLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]"));
    }

    @Test
    public void extraRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]]"));
    }

    @Test
    public void unorderedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void noLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    @Test
    public void noRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void balancedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Lau[nch]Code]"));
    }

    @Test
    public void unbalancedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[L]au[[n]chCode"));
    }

    @Test
    public void anotherBalancedBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[L]au[[n]]chCode"));
    }

}
