package DSA_ApniKaksha;

public class ShortestPath {
    public static float getShortestPath(String p) {
        int x = 0, y = 0;
        int len = p.length();
        for (int i = 0; i < len; i++) {
            char dir = p.charAt(i);

            if (dir == 'S') y--;
            else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            }
        }


        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }


    public static void main(String[] args) {
        String p = "EWNSNE";
        System.out.println(getShortestPath(p));
    }
}
