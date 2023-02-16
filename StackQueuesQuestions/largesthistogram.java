import java.util.Stack;

//https://leetcode.com/problems/largest-rectangle-in-histogram/
//hard
public class largesthistogram {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max=0;
        stack.push(0);

        for (int i = 1; i < heights.length; i++) {
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                max=getMax(heights, stack, max, i );
            }stack.push(i);
        }
        return max;
    }

    private int getMax(int[] heights, Stack<Integer> stack, int max, int i) {
        return 0;
    }
}
