package DSA_ApniKaksha;

public class pairing {
    public static int Pairing(int n){
        if (n==2||n==1) return n;

        return Pairing(n-1)+Pairing(n-2)*(n-1);
    }

    public static void main(String[] args) {
        System.out.println(Pairing(4));
    }
}
