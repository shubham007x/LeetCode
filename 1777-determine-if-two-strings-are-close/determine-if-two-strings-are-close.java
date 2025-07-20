class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for (char c : word1.toCharArray()) {
            arr1[c - 'a']++;
            set1.add(c);
        }
        for (char c : word2.toCharArray()) {
            arr2[c - 'a']++;
            set2.add(c);
        }

        if (!set1.equals(set2)) {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return (Arrays.equals(arr1, arr2));

    }
}