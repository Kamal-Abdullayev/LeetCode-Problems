public class LongestCommonPrefix {
    // 14. Longest Common Prefix
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        String[] strs2 = new String[]{"dog","racecar","car"};
        String[] strs3 = new String[]{""};
        String[] strs4 = new String[]{"a"};
        String[] strs5 = new String[]{"", "b"};
        String[] strs6 = new String[]{"ab", "a"};
        String[] test = new String[]{"test", "test", "test"};

        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs3));
        System.out.println(longestCommonPrefix(strs4));
        System.out.println(longestCommonPrefix(strs5));
        System.out.println(longestCommonPrefix(strs6));

        System.out.println(longestCommonPrefix(test));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        int minLengthTheWord = strs[strs.length-1].length();

        for (int i = 0; i < strs.length-1; i++) {
            if (minLengthTheWord > strs[i].length()) minLengthTheWord = strs[i].length();
        }

        if (minLengthTheWord == 0) {
            return prefix.toString();
        }

        char temp;
        for (int i = 0; i < minLengthTheWord; i++) {
            temp = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (temp != strs[j].charAt(i)){
                    return prefix.toString();
                } else if (j == strs.length-1) {
                    prefix.append(temp);
                }
            }
        }

        return prefix.toString();
    }
}
