class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            int x = asteroids[i];

            while (!st.isEmpty() && st.peek() > 0 && x < 0) {
                int top = st.peek();
                if (top + x == 0) {
                    st.pop();
                    x = 0;
                } else if (top + x < 0) {
                    st.pop();
                } else
                    x = 0;

            }
            if (x != 0) {
                st.push(x);
            }
        }
        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();

        }
        return result;
    }
}