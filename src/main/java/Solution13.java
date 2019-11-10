/***
 * "IV" 4
 * "IX" 9
 * "XL" 40
 * "XC" 90
 * "CD" 400
 * "CM" 900
 * "I" 1
 * "V" 5
 * "X" 10
 * "L" 50
 * "C" 100
 * "D" 500
 * "M" 1000
 * 暴力法
 */


public class Solution13 {
    public int romanToInt(String s) {
        int result = 0;
        char[] sArr = s.toCharArray();

        int i = 0;
        while(i<sArr.length){
            if(sArr[i] == 'I'){
                if((i+1)<sArr.length&&sArr[i+1] == 'V'){
                    result += 4;
                    i += 2;
                }else if((i+1)<sArr.length&&sArr[i+1] == 'X'){
                    result += +9;
                    i += 2;
                }else{
                    result += 1;
                    i += 1;
                }
            }else if(sArr[i] == 'X'){
                if((i+1)<sArr.length&&sArr[i+1] == 'L'){
                    result += 40;
                    i += 2;
                }else if((i+1)<sArr.length&&sArr[i+1] == 'C'){
                    result += 90;
                    i += 2;
                }else{
                    result += 10;
                    i += 1;
                }
            }else if(sArr[i] == 'C'){
                if((i+1)<sArr.length&&sArr[i+1] == 'D'){
                    result += 400;
                    i += 2;
                }else if((i+1)<sArr.length&&sArr[i+1] == 'M'){
                    result += 900;
                    i += 2;
                }else{
                    result += 100;
                    i += 1;
                }
            }else if(sArr[i] == 'V'){
                result += 5;
                i += 1;
            }else if(sArr[i] == 'L'){
                result += 50;
                i += 1;
            }else if(sArr[i] == 'D'){
                result += 500;
                i += 1;
            }else{
                result += 1000;
                i += 1;
            }
        }

        return result;
    }
}
