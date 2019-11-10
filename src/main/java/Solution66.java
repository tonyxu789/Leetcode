public class Solution66 {

    public int[] plusOne1(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }


    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            boolean flag = false;


            if (digits[0] == 9 && digits.length == 1) {     //数组只有一个元素9，专门判断
                int[] longer = new int[digits.length + 1];
                longer[0] = 1;
                longer[1] = 0;
                return longer;
            } else if (digits[i] != 9 && i == digits.length - 1) {      //末位不为9，直接加一结束
                digits[i] = digits[i] + 1;
                break;
            } else if (digits[i] == 9 && digits.length != 1) {      //数组不是只有一个元素，某位不为9，进位方式
                if (i + 1 < digits.length && digits[i + 1] == 0) {      //如果该位为9时该位的下一位是0，说明该位的9原本是8，由下一位进位来的，此时不用再进位
                    break;
                }
                digits[i] = 0;
                digits[i - 1] = digits[i - 1] + 1;
            } else if (digits[i] == 10 && i - 1 < 0) {      //首位是10了(9+1)，专门处理99999这种情况(变成100000)
                int[] longer = new int[digits.length + 1];
                longer[0] = 1;
                for (int j = 1; j < digits.length; j++) {
                    longer[j] = 0;
                }
                return longer;
            } else if (digits[i] == 10 && i - 1 >= 0) {     //非首位为10(9+1), 再往前进一位
                digits[i] = 0;
                digits[i - 1] = digits[i - 1] + 1;
                if (digits[i - 1] == 9) {       //把前一位加成9了，主动结束，以免下一次循环进入9的判断
                    break;
                }
            } else if (digits[i] != 9 && i != digits.length - 1) {      //某位不为末位不为9，直接结束
                break;
            }


        }
        return digits;
    }
}
