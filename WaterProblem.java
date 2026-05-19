public class WaterProblem {

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            // Step 1: Calculate width and height
            int width = right - left;
            int h = Math.min(height[left], height[right]);

            // Step 2: Calculate current area
            int area = width * h;

            // Step 3: Update max area if current is bigger
            maxArea = Math.max(maxArea, area);

            // Step 4: Move smaller height pointer inward
            if (height[left] < height[right]) {
                left++;   // left is shorter → move left right
            } else {
                right--;  // right is shorter → move right left
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Output 1: " + maxArea(height1)); // 49

        // Test Case 2
        int[] height2 = {1, 1};
        System.out.println("Output 2: " + maxArea(height2)); // 1

        // Test Case 3
        int[] height3 = {4, 3, 2, 1, 4};
        System.out.println("Output 3: " + maxArea(height3)); // 16

        // Test Case 4
        int[] height4 = {1, 2, 1};
        System.out.println("Output 4: " + maxArea(height4)); // 2
    }
}