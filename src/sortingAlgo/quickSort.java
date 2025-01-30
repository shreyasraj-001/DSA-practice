package sortingAlgo;

public class quickSort {
    public static void quickSort(int[] arr,int low , int high){
        if (low<high){

            int pi =part(arr,low, high );
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
        public static void swap(int[] arr, int i, int j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    private static int part(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i= low-1;
        for (int j = low; j < high; j++) {
            if (arr[j]<pivot){
                i++;
                swap(arr,i,j);

            }
        }
//        int temp=arr[i+1];
//        arr[i+1]=arr[high];
//        arr[high]=temp;

        swap(arr,i+1,high);

        return i+1;
    }

    public static void main(String[] args) {
//        int arr[]={-50,-30,6,1,61};
        int arr[]={5,10,16,18,61};

        quickSort(arr,0,arr.length-1);
        for (int num : arr) {
            System.out.print(num+ " ");
        }
    }
}
