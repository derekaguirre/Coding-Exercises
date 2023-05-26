public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int high = nums.length, low = 0;
        if(target < nums[low] || target > nums[high-1]){
            return -1;
        }
        while (low < high){
            int mid = (low + high) /2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                low = mid+1;
                mid++;
            }
            else{
                high = mid-1;
                mid--;
            }
        }
        return -1;
    }
        
}
