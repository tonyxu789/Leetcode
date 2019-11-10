
public class Solution7 {
    public int reverse(int x) {
        String s = Integer.toString(x);
        char[] sArr = s.toCharArray();

        if(sArr[0] == '-'){
            return -reverse(-x);

        }else{
            char[] sArrNew = new char[s.length()];
            int i=sArr.length-1;
            int j=0;
            while(i>=0 && j<sArrNew.length){
                sArrNew[j] = sArr[i];
                j++;
                i--;
            }

            int k = 0;
            int result = 0;
            while(k<sArrNew.length&&sArrNew[k] == '0'){
                k++;
            }
            for( ;k<sArrNew.length;k++){
                result = result*10+(sArrNew[k]-'0');
            }

            return result;

        }
    }
}