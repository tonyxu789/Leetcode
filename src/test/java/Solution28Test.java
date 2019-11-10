import org.junit.Test;

import static org.junit.Assert.*;

public class Solution28Test {

    @Test
    public void strStr() {
        Solution28 solution28 = new Solution28();
        String input = "hello";
        String needle = "ll";
        int output = solution28.strStr(input,needle);
        System.out.println(output);

    }

    @Test
    public void strStr1() {
        Solution28 solution28 = new Solution28();
        String input = "0101011100110101";
        String needle = "10111001";
        int output = solution28.strStr1(input,needle);
        System.out.println(output);

    }
}