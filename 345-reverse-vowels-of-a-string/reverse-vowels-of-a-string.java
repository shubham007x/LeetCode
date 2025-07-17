class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] arr = s.toCharArray();
        while (start <= end) {
            char x = s.charAt(start);
            char y = s.charAt(end);
            if (check(x) && check(y)) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            } else if (!check(x)) {
                start++;
            } else {
                end--;
            }

        }
        return new String(arr);
    }

    public static boolean check(char x) {
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O'
                || x == 'U') {

            return true;
        }
        return false;
    }

}