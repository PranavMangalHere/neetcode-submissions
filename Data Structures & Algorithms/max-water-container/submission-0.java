class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        for(int i=0; i<heights.length; i++){
            for(int j=i+1 ; j<heights.length; j++){
                int x = Math.min(heights[i], heights[j]);
                int t = (j-i) * x;
                max = Math.max(max, t);
            }
        }
        return max;
    }
}
