class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;
        for (int i = 0; i < k; i++) {
            char x = s.charAt(i);
            if (isVowel(x)) {
                count++;
            }
        }
        int max = count;
        for (int i = k; i < s.length(); i++) {

            if (isVowel(s.charAt(i - k))) {
                count--;
            }
            if (isVowel(s.charAt(i))) {
                count++;
            }
            max = Math.max(count, max);
            if (max == k) {
                return max;
            }
        }
        return max;

    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}