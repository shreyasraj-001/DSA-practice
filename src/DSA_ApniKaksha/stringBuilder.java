package DSA_ApniKaksha;

public class stringBuilder {
    public static String toUpperCase(String s){
        StringBuilder sb = new StringBuilder("");
        char c = Character.toUpperCase(s.charAt(0));
        sb.append(c);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i<s.length()-1){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println();
        return sb.toString();
    }

    public static void main(String[] args) {
        String s="sHreyas ";
        System.out.println(toUpperCase(s));

    }
}