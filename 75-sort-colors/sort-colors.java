class Solution {
    public void sortColors(int[] colors) {
        int start = 0, end = colors.length-1, curr = 0;
        int temp;
        while(curr <= end){
            if(colors[curr] == 0){
                temp = colors[start];
                colors[start] = colors[curr];
                colors[curr] = temp;
                curr++;
                start++;
            }else if(colors[curr] == 1){
                curr++;
            }else{
                temp = colors[end];
                colors[end] = colors[curr];
                colors[curr] = temp;
                end--;
            }
        }
    }
}