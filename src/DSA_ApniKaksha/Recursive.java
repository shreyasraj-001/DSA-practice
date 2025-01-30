package DSA_ApniKaksha;

public class Recursive {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.print(+n + " ");
        printDec(n - 1);
    }

    public static void printInc(int i) {
        if (i == 1) {
            System.out.print(i +" ");
            return;
        }
        printInc(i - 1);
        System.out.print(i + " ");
    }

    public static int factorial(int f){
        if (f == 0) {
            return 1;
        }
        int fn = f*factorial(f-1);
        return fn;
    }

        public static void main (String[]args){
//            int n = 10;
//            int i = 10;
//            System.out.print("Dec order : ");
//            printDec(n);
//            System.out.print("Inc order : ");
//            printInc(i);
            int f=4;
            System.out.println(factorial(f));
        }
    }

