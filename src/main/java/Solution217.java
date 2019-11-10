import java.util.ArrayList;
import java.util.HashSet;

public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        HashSet<Integer> newNums = new HashSet<>();
        for(int num:nums){
            if(newNums.contains(num)){
                flag = true;
                break;
            }else{
                newNums.add(num);
            }
        }

        return flag;
    }

//得用HashSet(查找快),用ArrayList铁定超时

}
