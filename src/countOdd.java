class Solution {
    public int countOdds(int low, int high) {
        int diff = (high - low);
        if (low % 2 == 0 && high % 2 == 0)
            return diff / 2;
        else
            return (diff / 2) + 1;
    }
}

public class countOdd{

    public static void main(String[] args) {
        Solution solution = new Solution();
        // solution.countOdds(5, 10);
        int result = solution.countOdds(4, 10);
        System.out.print(result);

    }
}
// }
