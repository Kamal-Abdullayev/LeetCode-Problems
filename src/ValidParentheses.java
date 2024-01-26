import java.util.Stack;

public class ValidParentheses {
    // 20. Valid Parentheses
    public static void main(String[] args) {
        String s = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        System.out.println(isValid(s));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
    }

    // Not my solutions
    public static boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') characterStack.push(s.charAt(i));
            else if (characterStack.empty()) return false;
            else if (characterStack.peek() == '{' && s.charAt(i) == '}' ) characterStack.pop();
            else if (characterStack.peek() == '(' && s.charAt(i) == ')' ) characterStack.pop();
            else if (characterStack.peek() == '[' && s.charAt(i) == ']' ) characterStack.pop();
            else return false;
        }
        return characterStack.isEmpty();
    }
}
