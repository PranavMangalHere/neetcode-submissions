class Solution {

    private int func(int[] arr, int hour){
        int totalhrs = 0; 
        for(int i=0; i<arr.length; i++){
            totalhrs += Math.ceil((double)arr[i]/hour);
        }
        return totalhrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int i=1;i<piles.length; i++){
            if(max < piles[i]){
                max = piles[i];
            }
        }
        int ans =0;

        int low = 0, high = max;
        while(low<= high){
            int mid = low + (high - low)/2;
            int reqtime = func(piles, mid);
            if(reqtime<=h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
