class Solution {
    public String mergeAlternately(String word1, String word2) {
      StringBuilder res = new StringBuilder();
      char[] word1Chars = word1.toCharArray();
      char[] word2Chars = word2.toCharArray();
      int p1 = 0, p2 = 0;
      while(p1!=word1.length() && p2!=word2.length()){
        res.append(word1Chars[p1]);
        res.append(word2Chars[p2]);
        p1++;
        p2++;
      }
      if(p1 != word1.length()) res.append(word1.substring(p1));
      if(p2 != word2.length()) res.append(word2.substring(p2));
      return res.toString();
    }
}