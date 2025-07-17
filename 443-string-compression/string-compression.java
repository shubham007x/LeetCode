class Solution {
    public int compress(char[] chars) {

        int count = 1;
        StringBuilder sb = new StringBuilder();
        char x = chars[0];
        if (chars.length == 1) {
            sb.append(x);
        } else {
            for (int i = 1; i <chars.length; i++) {
                char y = chars[i];
                if (x == y) {
                    count++;
                } else {

                    sb.append(x);
                    if (count > 1) {
                        sb.append(count);
                    }
                    count = 1;
                    x = y;
                }

            }
            sb.append(x);
            if (count > 1) {
                sb.append(count);
            }

        }

        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }
        return sb.length();

    }
}