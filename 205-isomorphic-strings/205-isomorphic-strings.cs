public class Solution {
    public bool IsIsomorphic(string s, string t) {
           int l = s.Length;
            Dictionary<char, char> myDic = new Dictionary<char, char>();
            for(int i=0; i < l; i++)
            {
                if (!myDic.ContainsKey(s[i]))
                {
                    if (myDic.ContainsValue(t[i]))
                        return false;
                    myDic.Add(s[i], t[i]);
                }
                else
                {
                    if (myDic[s[i]] != t[i])
                        return false;
                }
            }
            return true; 
    }
}