class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (map.containsKey(x)) {
                int freq = map.get(x);
                map.put(x, freq + 1);

            } else
                map.put(x, 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : map.values()) {
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
        }
        return true;
    }
}
