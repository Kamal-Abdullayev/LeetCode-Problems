public class RomanToInteger {
    public static void main(String[] args) {
        String s = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";
        System.out.println(romanToInt(s));
        System.out.println(romanToInt(s2));
        System.out.println(romanToInt(s3));
    }

    public static int romanToInt(String s) {
        int actualNumber = 0;
        for(int i = s.length()-1; i >= 0; --i) {
            switch (s.charAt(i)) {
                case 'I':
                    actualNumber++;
                    break;
                case 'V':
                    if (i - 1 >= 0 && s.charAt(i-1) == 'I') {
                        actualNumber -=1;
                        i--;
                    }
                    actualNumber+=5;
                    break;
                case 'X':
                    if (i - 1 >= 0 && s.charAt(i-1) == 'I') {
                        actualNumber -=1;
                        i--;
                    }
                    actualNumber+=10;
                    break;
                case 'L':
                    if (i - 1 >= 0 && s.charAt(i-1) == 'X') {
                        actualNumber -=10;
                        i--;
                    }
                    actualNumber+=50;
                    break;
                case 'C':
                    if (i - 1 >= 0 && s.charAt(i-1) == 'X') {
                        actualNumber -=10;
                        i--;
                    }
                    actualNumber+=100;
                    break;
                case 'D':
                    if (i - 1 >= 0 && s.charAt(i-1) == 'C') {
                        actualNumber -=100;
                        i--;
                    }
                    actualNumber+=500;
                    break;
                case 'M':
                    if (i - 1 >= 0 && s.charAt(i-1) == 'C') {
                        actualNumber -=100;
                        i--;
                    }
                    actualNumber+=1000;
                    break;
            }
        }
        return actualNumber;
    }
}
