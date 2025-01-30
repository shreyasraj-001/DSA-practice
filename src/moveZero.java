public class moveZero {
    public static void moveZero(int[] arr, int n){
        int j=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
            if (arr[j]!=0){
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,0,4,0,6,0,8};
        int steps=0;
        System.out.print("Original arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
            steps++;

        }
            System.out.print("no of steps:"+ steps);

        System.out.println();

        moveZero(arr, arr.length);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+",");
        }
//        System.out.println(arr[i]+" ");
    }
}
