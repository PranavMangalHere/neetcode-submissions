class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int longest = 0;
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i] -1)){
                int currnum = nums[i];
                int currStreak = 1;
                while(set.contains(currnum+1)){
                    currnum += 1;
                    currStreak += 1; 
                }
                longest = Math.max(longest, currStreak);

            }
        }
        return longest;
    }
}
