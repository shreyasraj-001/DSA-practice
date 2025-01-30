//Even number
public class Main {

    public static void printArr(int[] arr) {
//        int n= ;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[] remEVen(int[] arr){
        int oddCount =0;
        for(int i=0;i<arr.length;i++){
            if((arr[i] % 2) == 0){
                oddCount++;
//                System.out.println(num +" ");
            }
        }
        int[] result = new int[oddCount];
        int idx =0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%2  ==0){
                result[idx]=arr[i];
                idx++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr= {2,3,4,5,6,7,8};
        printArr(arr);
        int[] result = remEVen(arr);
        printArr(result);
            }
        }