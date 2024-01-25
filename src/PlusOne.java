public class PlusOne {
    // 66. Plus One
    public static void main(String[] args) {
        int[] digits = new int[] {1,2,3}; // 1,2,4
        int[] digits2 = new int[] {9}; // 1,0
        int[] digits3 = new int[] {8,9}; // 9,0
        plusOne(digits);
        plusOne(digits2);
        plusOne(digits3);
    }

    public static int[] plusOne(int[] digits) {
        int[] nums;
        boolean extraPlaceRequired = true;
        int temp = 1;
        for (int j : digits) {
            if (j != 9) {
                extraPlaceRequired = false;
                break;
            }
        }
        if (extraPlaceRequired) {
            nums = new int[digits.length+1];
            for (int i = 0; i < digits.length; i++) {
                if (i == 0) nums[i] = 1;
                else nums[i] = 0;
            }
        } else {
            nums = new int[digits.length];
            for (int i = digits.length-1; i >=0; i--) {
                if (digits[i] + temp > 9) {
                    nums[i] = 0;
                } else {
                    nums[i] = digits[i]+temp;
                    temp = 0;
                }

            }
        }
        for (int digit : nums) {
            System.out.println(digit);
        }
        return nums;
    }
}


