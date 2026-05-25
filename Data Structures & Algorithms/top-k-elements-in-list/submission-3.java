class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0) + 1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int key : mpp.keySet()){
            int freq = mpp.get(key);
            if(buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }
        int[] res = new int[k];
        int x = 0;
        for(int i=buckets.length - 1; i>=0;  i--){
            if(buckets[i] != null){
                for(Integer integer : buckets[i]){
                    res[x++] = integer;
                }
            }
            if(k == x){
                break;
            }
        }
        return res;
    }
}
