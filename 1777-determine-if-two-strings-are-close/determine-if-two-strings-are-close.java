class Solution {
    public boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            if (map1.containsKey(c)) {
                int freq = map1.get(c);
                map1.put(c, freq + 1);
            } else {
                map1.put(c, 1);
            }
        }
        for (int i = 0; i < word2.length(); i++) {
            char c = word2.charAt(i);
            if (map2.containsKey(c)) {
                int freq = map2.get(c);
                map2.put(c, freq + 1);
            } else {
                map2.put(c, 1);
            }
        }
        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }
        List<Integer> freq1 = new ArrayList<>(map1.values());
        List<Integer> freq2 = new ArrayList<>(map2.values());
        Collections.sort(freq1);
        Collections.sort(freq2);
        return freq1.equals(freq2);

    }
}