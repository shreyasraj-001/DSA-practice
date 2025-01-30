package DSA_ApniKaksha;

public class removeDuplicate {
    public static String Duplicate(String s){
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "hellooowworld";
        System.out.println(Duplicate(s));
    }
}