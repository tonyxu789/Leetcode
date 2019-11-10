import java.util.HashMap;

public class Solution242 {

    public boolean isAnagram(String s, String t) {

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        for(char chars1:c1){
            if(map1.containsKey(chars1)){
                int i = map1.get(chars1);
                i += 1;
                map1.put(chars1, i);
            }else{
                map1.put(chars1,1);
            }
        }

        for(char chars2:c2){
            int i = map2.getOrDefault(chars2,0);
            i+=1;
            map2.put(chars2,i);

        }


        return map1.equals(map2);

    }
}
