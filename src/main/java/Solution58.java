public class Solution58 {

    public int lengthOfLastWord(String s) {
        String[] sps = s.split("\\s+");
        return sps[sps.length-1].length();
    }
}
