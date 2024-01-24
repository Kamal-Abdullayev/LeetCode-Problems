public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";
        String s4 = "";
        String s5 = "  ";
        String s6 = "  q  ";
        System.out.println(lengthOfLastWord(s)); // 5
        System.out.println(lengthOfLastWord(s2)); // 4
        System.out.println(lengthOfLastWord(s3)); // 6
        System.out.println(lengthOfLastWord(s4)); // 0
        System.out.println(lengthOfLastWord(s5)); // 0
        System.out.println(lengthOfLastWord(s6)); // 1
    }
    public static int lengthOfLastWord(String s) {
        int length = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            if (i < s.length()-1 &&s.charAt(i) == ' ' && s.charAt(i+1) != ' ') break;
            else if (s.charAt(i) != ' ') {
                length++;
            }
        }

        return length;
    }
}
