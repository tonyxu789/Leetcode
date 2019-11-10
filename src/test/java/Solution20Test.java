import org.junit.Test;

import static org.junit.Assert.*;

public class Solution20Test {

    @Test
    public void isValid() {
        Solution20 solution20 = new Solution20();
        String input = "((){}[]([]))";
        Boolean result = solution20.isValid(input);
        System.out.println(result);
    }
}