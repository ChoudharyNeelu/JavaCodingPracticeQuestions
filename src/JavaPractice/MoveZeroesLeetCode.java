//283. Move Zeroes
/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
		int[] newarray = new int[len];
		int d = 0;
		int x = len-1;;

		for (int i = 0; i < len; i++)

		{
			if (nums[i] != 0) {
				newarray[d] = nums[i];
				d++;
			}

			else {
				newarray[x] = nums[i];
				x--;
			}
		}
        for(int i =0;i<len;i++){
            nums[i]= newarray[i];
        }
    }
}
