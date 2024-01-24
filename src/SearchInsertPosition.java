public class SearchInsertPosition {
    // 35. Search Insert Position
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target)); // 2
        int[] nums2 = new int[]{1,3,5,6};
        int target2 = 2;
        System.out.println(searchInsert(nums2, target2)); // 1
        int[] nums3 = new int[]{1,3,5,6};
        int target3 = 7;
        System.out.println(searchInsert(nums3, target3)); // 4
        int[] nums4 = new int[]{0};
        int target4 = 0;
        System.out.println(searchInsert(nums4, target4)); // 0?
        int[] nums5 = new int[]{1,3,5,6};
        int target5 = 6;
        System.out.println(searchInsert(nums5, target5)); // 3
        int[] nums6 = new int[]{1,3,5,6};
        int target6 = 0;
        System.out.println(searchInsert(nums6, target6)); // 0

    }

    public static int searchInsert(int[] nums, int target) {
        for (int i=0; i < nums.length; i++) {
            if (nums[i] == target) return i;
            else if (i < nums.length-1 && target > nums[i] && target < nums[i+1]) {
                return i+1;
            } else if (i==nums.length-1 && target > nums[i]) {
                return nums.length;
            }
        }
        return 0;
    }
}
