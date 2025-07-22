class Solution {
    public String decodeString(String s) {

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c != ']') {
                st.push(c);
            } else {
                String str = "";
                while (st.peek() != '[') {
                    str += st.pop();
                }
                st.pop();
                StringBuilder kStr = new StringBuilder();
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    kStr.insert(0, st.pop());
                }
                int k = Integer.parseInt(kStr.toString());
                String str1 = str.repeat(k);


                int i = str1.length() - 1;
                while (i >= 0) {
                    st.push(str1.charAt(i));
                    i--;
                }

            }

        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}