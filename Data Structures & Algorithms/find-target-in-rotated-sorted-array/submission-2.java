class Solution {
    public int search(int[] arr, int target) {
        int l = 0;
        int h = arr.length -1;

        while(l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid]>= arr[l]){

                if(target >= arr[l] && arr[mid] > target){
                    h = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
            else{
                if(target > arr[mid] && target <= arr[h]){
                    l = mid + 1;
                }
                else{
                    h = mid - 1;
                }
            }
        }

        return -1;
    }
}
