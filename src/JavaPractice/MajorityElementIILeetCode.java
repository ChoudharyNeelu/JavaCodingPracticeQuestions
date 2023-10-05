//229. Majority Element II
/*Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Example 1:
Input: nums = [3,2,3]
Output: [3]

Example 2:
Input: nums = [1]
Output: [1]

Example 3:
Input: nums = [1,2]
Output: [1,2]

Example 4:
Input: nums = [2,2]
Output: [2]
*/


class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len  = nums.length;
        int maxCount = len/3;
         List<Integer> finalList = new ArrayList<Integer>();
        for(int i =0; i<len;i++){
            int count = 1;
           for(int j=i+1;j<len;j++){
               if(nums[i] == nums[j]){
                   count++;
               }
           }
           if(count> maxCount){
               finalList.add(nums[i]);
           } 
        }
       //removing duplicates values for cases like [2,2]
    Set<Integer> set = new LinkedHashSet<>();
		set.addAll(finalList);
		finalList.clear();
		finalList.addAll(set);
        
        return finalList;
    }
}
