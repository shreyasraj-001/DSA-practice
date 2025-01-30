package DSA_ApniKaksha;
//this pattern is similar like fibnonacci series where we use
// fib(n-1) + fib(n-2)
//base case : (n==0||n==1) return 1;

public class tilingProblem {
    public static int tiling(int n){
        if (n==0||n==1) return 1;
        return tiling(n-1) + tiling(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tiling(6));
    }
}
