class Solution {
    public String removeStars(String s) {

        Stack<Character> st = new Stack<>();
        StringBuilder sb=new StringBuilder();
        for (char x : s.toCharArray()) {

            if (Character.isLetterOrDigit(x)) {
                st.push(x);
            } else if (!st.isEmpty()) {
                st.pop();
            }
        }
        for (char x : st) {
            sb.append(x);
        }
        return sb.toString();
    }
}