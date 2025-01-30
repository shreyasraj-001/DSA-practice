package DSA_ApniKaksha;

public class compress {
    public static String compression(String s){
        String newS="";
        for (int i = 0; i < s.length(); i++) {
            Integer count=1;
            while (i<s.length()-1 &&s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            newS+= s.charAt(i);
            if (count>0) newS +=count.toString();

        }
        return newS;
    }

    public static void main(String[] args) {
        String s= "aaaabbbdsseee";
        System.out.println(compression(s));
    }
}
