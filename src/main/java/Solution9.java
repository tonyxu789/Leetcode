public class Solution9 {
    public boolean isPalindrome(int x) {
        if(x>=0){
            String s = Integer.toString(x);
            int[] nums = new int[s.length()];
            for(int k=0;k<s.length();k++){
                Character ch = s.charAt(k);
                nums[k] = Integer.parseInt(ch.toString());
            }
            int i = 0;
            int j = s.length()-1;
            for( ;i<s.length()/2;i++){
                if(nums[i] == nums[j]){
                    j--;
                }else{
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
