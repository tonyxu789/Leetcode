import org.junit.Test;

import static org.junit.Assert.*;

public class Solution62Test {

    @Test
    public void uniquePaths() {
        Solution62 solution62 = new Solution62();
        int m = 4;
        int n = 3;
        int output = solution62.uniquePaths(m,n);
        System.out.println(output);
    }
}