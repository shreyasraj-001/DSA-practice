import java.util.*  ;

public class missingNoSeries {
    public static int MissingNo(int[] arr){
        int n = arr.length+1;
        System.out.println("Array length: "+n);
        int sum = n*(n+1)/2;
        for (int num: arr){
            sum = sum - num;
        }
            return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,4,6,7};
        Arrays.sort(arr);
        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.println();
        int missingNum = MissingNo(arr);
        System.out.println("Missing Number is: "+ missingNum);

    }

}
