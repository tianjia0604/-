package package1_25;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int mid = findMid(nums,target);
        if(mid == -1) {
            return new int[]{-1,-1};
        }
        int start = mid;
        int end = mid;
        while(start > 0 && nums[start - 1] == target) {
            start--;
        }
        while(end < nums.length -1 && nums[end + 1] == target) {
            end++;
        }
        return new int[]{start,end};

    }
    public int findMid(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid = 0;
        while (l <= r) {
            mid = (r + l) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) r = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }
}
