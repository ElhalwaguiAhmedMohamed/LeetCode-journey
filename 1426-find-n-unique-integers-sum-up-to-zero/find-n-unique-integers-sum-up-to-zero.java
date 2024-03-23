class Solution {
    public int[] sumZero(int n) {
       int[] res = new int[n];
       if(n == 1){
        res[0] = 0;
        return res;
       } 

       if(n%2 != 0){
        for(int i=1; i<n; i+=2){
            res[0] = 0;
            res[i] = i;
            res[i+1] = -i;
        }
       }else{
        for(int i=0; i<n; i+=2){
            res[i] = i+1;
            res[i+1] = -(i+1);
        }
       }
       return res;
    }
}