//2574. Left and Right Sum Differences
/*Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:
leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer. 

Example 1:
Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].

Example 2:
Input: nums = [1]
Output: [0]
Explanation: The array leftSum is [0] and the array rightSum is [0].
The array answer is [|0 - 0|] = [0].
*/

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSumArray = new int[nums.length];
           int[] rightSumArray = new int[nums.length];
           leftSumArray[0]=0;
           rightSumArray[nums.length-1] =0;
           int a =1;
        for(int i=0;i<rightSumArray.length-1;i++){
            int sum=0;
           for(int j=a;j<rightSumArray.length;j++){
               sum =sum+ nums[j];
           }
         a++;
           rightSumArray[i] = sum;
        }
        
          int b=leftSumArray.length-2;
         for(int i=leftSumArray.length-1;i>=1;i--){
            int sum=0;
            for(int j=b;j>=0;j--){
                sum=sum +nums[j];
            }
            b--;
            leftSumArray[i] = sum;
         }
        
        int[] finalArray = new int[nums.length];

        for(int i=0;i<finalArray.length;i++){
            finalArray[i] = Math.abs(leftSumArray[i]-rightSumArray[i]);
        }
      return finalArray;
    }
}
