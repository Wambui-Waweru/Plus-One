class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
              digits[i]++;
              return digits;
          } 
            digits[i] = 0;
            
         }
        
        int[] answer = new int[n + 1];
        Arrays.fill(answer, 0);
        answer[0] = 1;
        return answer;
    }
}
