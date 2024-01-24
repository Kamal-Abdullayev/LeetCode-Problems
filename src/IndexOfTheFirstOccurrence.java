public class IndexOfTheFirstOccurrence {
    // 28. Find the Index of the First Occurrence in a String
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        String haystack2 = "leetcode", needle2 = "leeto";
        String haystack3 = "mississippi", needle3 = "issip";
        String haystack4 = "a", needle4 = "a";
        System.out.println(strStr(haystack, needle)); // 0
        System.out.println(strStr(haystack2, needle2)); // -1
        System.out.println(strStr(haystack3, needle3)); // 4
        System.out.println(strStr(haystack4, needle4)); // 0
    }

    public static int strStr(String haystack, String needle) {
        int index = -1;
        int count = 0;
        if (!haystack.contains(needle)) return index;
        if (needle.length() > haystack.length()) return index;

        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) != haystack.charAt(i)) {
                    i -= count;
                    count = 0;
                    break;
                } else if (j == needle.length()-1) {
                    return i-needle.length()+1;
                }
                i++;
                count++;
            }
        }
        return index;
    }
}
