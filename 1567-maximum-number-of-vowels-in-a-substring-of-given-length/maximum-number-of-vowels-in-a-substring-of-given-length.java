class Solution {
    public int maxVowels(String s, int k) {
      
        int count = 0;
        for (int i = 0; i < k; i++) {
            char x = s.charAt(i);
            if (check(x)) {
                count++;
            }
        }
        int max =count;
        for (int i = k; i < s.length(); i++) {

            if (check(s.charAt(i - k))) {
                count--;
            }
            if (check(s.charAt(i))) {
                count++;
            }
            max = Math.max(count, max);
            if (max == k) {
                return max;
            }
        }
        return max;

    }

    public static Boolean check(char x) {
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
            return true;
        } else
            return false;
    }
}