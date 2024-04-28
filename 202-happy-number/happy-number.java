class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<Integer>();
        while(!visited.contains(n)){
            visited.add(n);
            n = sumOfSquares(n);
            if(n==1)
                return true;
        }   
        return false;
    }
    public static int sumOfSquares(int number){
      int totalSum = 0;
      while (number != 0) {
        int digit = number % 10;
        number = number / 10;
        totalSum += (Math.pow(digit, 2));
      }
      return totalSum;
    }
}