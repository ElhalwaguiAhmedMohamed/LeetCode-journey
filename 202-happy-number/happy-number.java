class Solution {
    public boolean isHappy(int n) {
        int slowPointer = n;
        int fastPointer = sumOfSquares(n);
        while(fastPointer != 1 && fastPointer != slowPointer){
            slowPointer = sumOfSquares(slowPointer);
            fastPointer = sumOfSquares(sumOfSquares(fastPointer));
        }
        return fastPointer == 1;
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