import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 2000000002;
        int x2 = -121;
        int x3 = 10;
        int x4 = 0;

        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome(x2));
        System.out.println(isPalindrome(x3));
        System.out.println(isPalindrome(x4));
    }

    public static boolean isPalindrome(int x) {
//        System.out.println(321/100);
//        System.out.println(21/10);
//        System.out.println(1%10);

        boolean isPalindrome = true;
        if (x < 0) return false;
        List<Integer> nums = new ArrayList<>();

        int count = 1;
        int extra;
        while (x > 0) {
            int temp = x;
            extra = temp % (10*count);
//            if (extra > 0) x-=extra;
//            else x/= 10;
            x-=extra;
            System.out.println(extra / count);
            nums.add(extra / count);
            count*=10;

        }

        for (int i = 0; i < nums.size()/2; i++) {
            if (!nums.get(i).equals(nums.get(nums.size() - i-1))) return false;
        }
        return isPalindrome;
    }
}
