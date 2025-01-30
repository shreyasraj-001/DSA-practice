public class Reverse {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8};
        System.out.print("Original arr: ");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int start=0;
        int end=arr.length-1;
        while(start < end) {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.print("Reversed arr: ");

        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
        }
    }
}


//Method 2
//public class Reverse {
//    public static void rev(int[] arr, int start, int end){
//        while(start < end) {
//            int temp = arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2, 3, 4, 5, 6, 7, 8};
//        System.out.println("Original arr");
//
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
////        int start=0;
////        int end=arr.length-1;
//
//        rev(arr, 0, arr.length-1);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }
//}
//
