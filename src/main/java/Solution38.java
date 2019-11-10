public class Solution38 {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }else{
            String preString = countAndSay(n-1);
            StringBuilder sb = new StringBuilder("");

            int count = 0;
            char first = preString.charAt(0);
            int i = 0;

            while(i<preString.length()){
                if (preString.charAt(i) == first){
                    count++;
                    if (i == preString.length() - 1){
                        sb.append(count);
                        sb.append(first);
                    }
                    i++;
                }else{
                    sb.append(count);
                    sb.append(first);
                    first = preString.charAt(i);
                    count = 1;
                    if (i == preString.length() - 1){
                        sb.append(count);
                        sb.append(first);
                    }
                    i++;
                }
            }
            return sb.toString();
        }

    }
}
