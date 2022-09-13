public class Solution {
    public int[] Intersect(int[] nums1, int[] nums2) {
        var dict = new Dictionary<int,int>();
        var intersection = new List<int>();
        foreach(var num in nums1){
            if(!dict.ContainsKey(num))
                dict.Add(num,1);
            else
                dict[num] += 1;
        }
        
         foreach(var num in nums2){
            if(dict.ContainsKey(num) && dict[num] != 0){
                dict[num] -= 1;
                intersection.Add(num);
            }
        }
        
        return intersection.ToArray();
    }
    
}