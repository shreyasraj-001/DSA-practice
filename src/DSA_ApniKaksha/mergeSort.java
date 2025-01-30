package DSA_ApniKaksha;

public class mergeSort {

//    Print method

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


//    mergeSort method


    public static void mergeSort(int arr[], int si, int ei ){
        if (si>=ei){
            return;
}
        int mid = si + (ei-si)/2; //mid value
        mergeSort(arr, si, mid); //left part
        mergeSort(arr, mid+1, ei); //right part
        merge(arr,si,mid,ei);
 }


//      merge Method



 public static void merge(int arr[], int si, int mid, int ei)
 {
     int temp[] =new int[ei-si+1];
     int i = si;
     int j = mid+1;
     int k =0;

     while (i<=mid &&j<=ei){
         if (arr[i]<arr[j]){
             temp[k]=arr[i];
             i++;
         } else {
             temp[k]=arr[j];
             j++;
         }
         k++;
     }


//     left part
     while (i<=mid){
         temp[k++]=arr[i++];
     }


//      right part
     while (j <= ei){
         temp[k++] = arr[j++];
 }


//     copy temp to original arr
     for (k = 0, i=si; k < temp.length; k++, i++) {
         arr[i]=temp[k];
     }
}


/*Quick Sort*/


    public static void main(String[] args) {
        int arr[]={6,8,4,9,7,1};
        mergeSort(arr,0, arr.length-1);

        printArr(arr);

    }
}
