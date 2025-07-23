class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        Arrays.sort(potions);
        int[] arr = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {

            int low = 0, high = potions.length - 1;
            int ans = potions.length;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                long x = (long) spells[i] * potions[mid];
                if (x >= success) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            if (ans != potions.length) {
                arr[i] = potions.length - ans;

            }

        }
        return arr;
    }
}