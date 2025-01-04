import java.util.*;

class Solution {
    public int maxPoints(int[][] points) {
        if (points.length < 3) {
            return points.length;  // Handle small cases
        }

        int maxPoints = 0;

        for (int i = 0; i < points.length; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = i + 1; j < points.length; j++) { 
                int dx = points[j][0] - points[i][0]; // Difference in x coordinates
                int dy = points[j][1] - points[i][1]; // Difference in y coordinates

                // Handle vertical lines (dx == 0)
                if (dx == 0) {
                    dy = Integer.MAX_VALUE; // Representation of vertical line
                } else {
                    // Normalize the slope (dy/dx) by reducing it using GCD
                    int gcd = gcd(dy, dx); // Get the GCD of dy and dx
                    dy /= gcd;
                    dx /= gcd;

                    // Ensure consistent sign (negative slope always has dx > 0)
                    if (dx < 0) {
                        dx = -dx;
                        dy = -dy; // Flip signs to ensure consistent representation
                    }
                }

                // Use slope (dy/dx) as the key
                String key = dy + "," + dx;
                map.put(key, map.getOrDefault(key, 0) + 1); // Increment count for this slope
            }

            // For each base point, find the maximum number of points on the same line
            for (int count : map.values()) {
                maxPoints = Math.max(maxPoints, count + 1); // Add 1 for the base point itself
            }
        }

        return maxPoints;
    }

    // Helper function to calculate GCD of two numbers
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
