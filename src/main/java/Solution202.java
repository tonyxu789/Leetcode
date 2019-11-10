public class Solution202 {

    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do{
            slow = squareSum(slow);
            fast = squareSum(fast);
            fast = squareSum(fast);
        }while(slow != fast);

        return slow == 1;
    }

    public int squareSum(int n){
        int sum = 0;
        while(n > 0)
        {
            int bit = n % 10;
            sum += bit * bit;
            n = n / 10;
        }
        return sum;

    }
}
