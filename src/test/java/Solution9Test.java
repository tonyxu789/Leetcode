import org.junit.Test;

import static org.junit.Assert.*;

public class Solution9Test {

    @Test
    public void isPalindrome() {
        Solution9 solution9 = new Solution9();
        int input = 10;
        Boolean output = solution9.isPalindrome(input);
        System.out.println(output);
    }
}