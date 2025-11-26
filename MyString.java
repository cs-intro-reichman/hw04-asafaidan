public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String res = ""; 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            res += ch;
        }
        return res;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        int i = 0;
        boolean res = false;
        if (str2.length() == 0) {
            return true;
        }
        if (str1.length() >= str2.length()) {
        while (i < str1.length()) {
            int z = i;
            if (str1.charAt(i) == str2.charAt(0)) {
                res = true;
                for (int j = 1; j < str2.length(); j++) {
                    if (z + 1 >= str1.length()) {
                    res = false;
                    break;
                }
                    if (str1.charAt(z += 1) != str2.charAt(j)) {   
                    res = false;
                    break;
                    }   
                }          
                if (res == true) {
                    return true;   
                }
        }
        i++;
        }
        }
        return res;
    }
}
