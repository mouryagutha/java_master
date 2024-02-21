import java.util.Arrays;

public class sqrt {
    static class Solution {
        public int[] constructRectangle(int area) {
            int width = (int) Math.sqrt(area);

            while (area % width > 0)
                --width;

            return new int[] {area / width, width};
        }
    }

    public static void main(String[] args) {
        int area = 45; // Example area value
        Solution solution = new Solution(); // Instantiate Solution class
        int[] result = solution.constructRectangle(area); // Call the method
        System.out.println("Length: " + result[0] + ", Width: " + result[1]);
    }
}
