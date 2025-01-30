
import java.util.*;
//public class Largets_Number {
//    public static int getLargest(int num[]){
//        int largest =Integer.MIN_VALUE;
//        int smallest =Integer.MAX_VALUE;
//
//        for (int i = 0; i < num.length; i++) {
//            if (largest<num[i]){
//                largest=num[i];
//            }
//            if (smallest>num[i]){
//                smallest=num[i];
//            }
//        }
//            System.out.println("Smallest: "+smallest);
//            return largest;
//    }
//
//    public static void main(String[] args) {
//        int num[]={2,3,5,8,9,11,150};
//        System.out.println("Largest: "+ getLargest(num));
////        System.out.println("Largest: "+ getLargest(num));
//    }
//}



/* Binary Search of Given Key */
//public class Largets_Number {

//    public static int BinarySearch(int num[], int key) {
//        int start = 0, end = num.length - 1;
//        while (start <= end) {
//            int mid = (start + end) / 2;
//
//
//            if (num[mid] == key) {
//                return mid;
//            }
//            if (num[mid] < key) {
//                start = mid + 1;
//            }
////        if (num[mid]>key){
//            else {
//                end = mid - 1;
//            }
//        }
//    return -1;
//    }
//
//
//    public static void main(String[] args) {
//        int num[]={10,2,5,15,6,7,8};
//        Arrays.sort(num);
//        int key=10;
//        int result=BinarySearch(num,key)+1;
//        System.out.println(Arrays.toString(num));
//        System.out.printf("Searched Key: "+result);
//    }
//}

//public class Largets_Number {
//    public static void reverse(int num[]){
//        int first=0,last=num.length-1;
//
//        while (first<last){
//            int temp=num[last];
//            num[last]=num[first];
//            num[first]=temp;
//
//            first++;
//            last--;
//        }
//    }
//
//    public static void main(String[] args) {
//        int num[]={2,5,8,9,10,12};
//
//        reverse(num);
//        for (int i = 0; i < num.length; i++) {
//            System.out.printf(num[i]+",");
//        }
//    }
//}

/* Pair of array */

//public class Largets_Number {
//    public static void pair(int num[]){
//        for (int i = 0; i < num.length; i++) {
//            int curr=num[i];
//            for (int j = i+1; j < num.length; j++) {
//                System.out.print("("+curr+","+num[j]+")");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        int num[]={2,6,8,10,12};
//        pair(num);
//    }
//}


/*pair and sub array*/

//public class Largets_Number {
//    public static void subarray(int num[]){
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num.length; j++) {
//                int end =j;
//
//                for (int k = i; k < end; k++) {
//                    System.out.print(num[k]+" ");
//                }
////
//                System.out.println();
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        int num[]={2,4,6,8,10,12,14};
//        subarray(num);
//    }
//}


public class Largets_Number {
    public static void subarray(int num[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currSum=0;
                for (int k = start; k <= end; k++) {
                    currSum += num[k];
                }
                System.out.print(currSum+"  ");
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("maxSum: "+maxSum);
    }

    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        subarray(num);
    }
}

