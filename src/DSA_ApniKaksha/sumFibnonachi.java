package DSA_ApniKaksha;

public class sumFibnonachi {

//    public static int sum(int n){
//        int sum=0;
//        for (int i = 0; i < n; i++) {
//            sum+=i;
////            i--;
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        int n=5;
//        System.out.println(sum(n));
//    }
//
    public static int fibonacci(int i){
    if (i==0 || i==1) {
        return i;
    }
    int fib1 =fibonacci(i-1);
    int fib2=fibonacci(i-2);
    int fn = fib1+fib2;
    return fn;
    }

    public static void printFibonacci(int n, int a, int b) {
        if (n > 0) {
            System.out.print(a + " ");
            printFibonacci(n - 1, b, a + b);
        }
    }

    public static void main(String[] args) {
//        int i =10;
        printFibonacci(6,0,1);
//        System.out.println(fibonacci(6));
}
}
