// 771. Jewels and Stones
/*
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is considered a different type of stone from "A". 

Example 1:
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

Example 2:
Input: jewels = "z", stones = "ZZ"
Output: 0

Constraints:
1 <= jewels.length, stones.length <= 50
jewels and stones consist of only English letters.
All the characters of jewels are unique.
*/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jewelsLength = jewels.length();
        int stonesLength = stones.length();

        Character jewelsarray[] = new Character[jewelsLength];
        Character stonesarray[] = new Character[stonesLength];
         
         for(int i=0;i<jewelsLength;i++){
            jewelsarray[i]= jewels.charAt(i);
         }
           for(int i=0;i<stonesLength;i++){
            stonesarray[i]= stones.charAt(i);
         }
         int count=0;
         int j=0;
         while(j<jewelsLength)
         {
            for(int i=0;i<stonesLength;i++){
           if(jewelsarray[j]==stonesarray[i]){
              count++;
           }
         }
         j++;
         }
         return count;
    }
}
