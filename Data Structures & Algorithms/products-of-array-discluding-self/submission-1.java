class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length;
        for(int i=0; i<n; i++){
            int product = 1;
            for(int j=0; j<n; j++){
                if(i !=j){
                    product *= nums[j];
                }
            }
            ans[i] = product;
        }
        return ans;
    }
}  
