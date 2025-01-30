package sortingAlgo;


//public class SortingAlgo {
//
////Selection sorting algo
//    public static void bubbleSort(int arr[]){
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j < arr.length-1-i; j++) {
//                if (arr[i]>arr[j]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//    }
////    public static void printArr(int arr[]){
////
////    }
//
//    public static void main(String[] args) {
//        int arr[]={4,1,5,6,0,8,7,9};
//        bubbleSort(arr);
////        printArr(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
////        System.out.println(printArr(arr));
//    }
//}



// Selection Sorting.
//
//public class SortingAlgo {
//    public static void selectionSort(int arr[]){
//        for (int i = 0; i < arr.length-1; i++) {
//            int minPos=i;
//            for (int j = i+1; j < arr.length-1; j++) {
//                if (arr[minPos]>arr[j]){
//                    minPos=j;
//                }
//            }
//            int temp=arr[minPos];
//            arr[minPos]=arr[i];
//            arr[i]=temp;
//        }
//    }
//    public static void main(String[] args) {
//        int arr[]={4,1,5,6,0,8,7,9};
//        selectionSort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }
//}

public class SortingAlgo {
    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
//            int curr=arr[i];
            int curr = arr[i];
            int prev= i-1;

            while (prev >=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
//            insertion
            arr[prev+1]=curr;
        }
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={4,1,5,6,3,7,2,0};
        insertionSort(arr);
        printArr(arr);

    }
}