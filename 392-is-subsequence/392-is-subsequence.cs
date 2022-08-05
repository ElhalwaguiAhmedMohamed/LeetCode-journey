public class Solution {
    public bool IsSubsequence(string s, string t) {
         int Spointer = 0;
            int Tpointer = 0;
            while (Spointer != s.Length)
            {
                if (Tpointer > t.Length-1)
                    return false;
                if (s[Spointer] == t[Tpointer])
                    Spointer++;
                Tpointer++;
            }
            if(Spointer == s.Length)
                return true;
            else 
                return false;
    }
}