public class Min {
    public static void main(String[] args) {
        int[] arr= {2,3,4,5,6,7,8};
        System.out.print("Original arr: ");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("\n"+ min);
    }
}

