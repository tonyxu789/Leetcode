public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        int length = 0;
        int index = 0;
        if(strs.length == 0){
            return "";
        }else if(strs.length == 1){
            return strs[0];
        }else{
            for(int i=0;i<strs.length;i++){
                if(i == 0){
                    length = strs[i].length();
                }else{
                    if(length <= strs[i].length()){
                        index = index;
                    }else{
                        index = i;
                        length = strs[i].length();
                    }
                }
            }
        }

        String shortest = strs[index];
        char[] chars = shortest.toCharArray();
        int count = Integer.MAX_VALUE;
        if(chars.length!=0){

            for(int i=0;i<strs.length;i++){
                if(i!=index){
                    String s = strs[i];
                    char[] chars1 = s.toCharArray();
                    int j = 0;
                    int tempcount = 0;
                    while(j<chars.length&&chars[j] == chars1[j]){
                        j ++;
                        tempcount ++;
                    }
                    if(tempcount>=count){
                        count = count;
                    }else{
                        count = tempcount;
                    }
                }else{
                    continue;
                }
            }
        }else{
            return "";
        }

        if(count != 0&&count != Integer.MAX_VALUE){
            StringBuilder sb = new StringBuilder();
            for(int k=0;k<count;k++){
                sb.append(chars[k]);
            }
            return sb.toString();
        }else{
            return "";
        }
    }
}
