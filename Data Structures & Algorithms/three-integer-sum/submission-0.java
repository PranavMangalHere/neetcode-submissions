class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        List<List<Integer>> ans = new ArrayList<>();
        while(i<nums.length){

            if(i!=0 && nums[i] == nums[i-1]){
                i++;
                continue;
            }

            int j = i+1;
            int k = nums.length - 1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0){
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    List<Integer> lst = new ArrayList<>();
                    lst.add(nums[i]);
                    lst.add(nums[j]);
                    lst.add(nums[k]);

                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;

                    ans.add(lst);
                }
            }
            i++;

        }

        return ans;
    }
}
