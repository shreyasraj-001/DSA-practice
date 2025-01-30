//public class TrappingRainWater {
//    public static int trappedRainWater(int height[]) {
//        int n = height.length;
////        Math.max(int a, int b) is used to compare the two values in an array or collection
////        calculate left max boundary -array
//        int[] leftMax = new int[n];
//        leftMax[0] = height[0];
//        for(int i = 1; i < n; i++) {
//            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//        }
//
////        calculate right max boundary -array
//        int[] rightMax = new int[n];
//        rightMax[n - 1] = height[n - 1];
//        for (int i = n - 2; i >= 0; i--) {
//            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
//        }
//
////        loop
//        int trappedWater = 0;
//        for (int i=0; i < n; i++) {
//
//            int waterLevel = Math.min(leftMax[i], rightMax[i]);
////            trappedWater =waterLevel-height[i]
//            trappedWater += waterLevel - height[i];
//        }
//        return trappedWater;
//    }
//
//    public static void main(String[] args) {
//        int height[]={4,2,0,6,3,2,5};
//        System.out.println(trappedRainWater(height));
//    }
//}
//
//


/* Stock Market */
public class TrappingRainWater {
    public static int Stock(int price[]){
        int buyPrice= Integer.MAX_VALUE;
        int maxProfite=0;

        for (int i = 0; i < price.length; i++) {
            if (buyPrice<price[i]){
                int profit=price[i]-buyPrice;
                maxProfite=Math.max(maxProfite,profit);
            }else {
                buyPrice=price[i];
            }
        }
        return maxProfite;
    }


    public static void main(String[] args) {
        int price[]={7,1,2,0,5,6};
        System.out.println(Stock(price));
    }
}