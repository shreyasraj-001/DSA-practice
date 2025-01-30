//public class Palindrome {
//    public static boolean isPanlindrome(String s){
//        char ch[]= s.toCharArray();
//        int start =0;
//        int end = s.length()-1;
//        while (start<end){
//            if(ch[start]!=ch[end]) return false;
//        start++;
//        end--;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("This is "+ isPanlindrome("madam")+" Panlindrome case." );
//    }
//}



//Method 2:


public class Palindrome {
    public static boolean isPalindrome(String s){
        s= s.toLowerCase();
        int len = s.length();
        for (int i = 0; i < len/2; i++) {
            if (s.charAt(i) !=s.charAt(len - i -1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="rajar";
        System.out.println(isPalindrome(s));
    }
}