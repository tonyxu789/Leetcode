import java.util.Arrays;

public class Solution204 {

    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++)
            if (isPrime(i))
                count++;
        return count;
    }

    public boolean isPrime(int n) {
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public int countPrimes1(int n) {
        boolean[] isPrim = new boolean[n];
        // 将数组都初始化为 true
        Arrays.fill(isPrim, true);

        for (int i = 2; i < n; i++)
            if (isPrim[i])
                // i 的倍数不可能是素数了
                for (int j = 2 * i; j < n; j += i)
                    isPrim[j] = false;

        int count = 0;
        for (int i = 2; i < n; i++)
            if (isPrim[i]) count++;

        return count;

        //这方法真的牛逼
    }

}
