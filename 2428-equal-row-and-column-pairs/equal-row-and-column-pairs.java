class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;

        List<List<Integer>> rows = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(grid[i][j]);
            }
            rows.add(row);
        }
        List<List<Integer>> cols = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> col = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                col.add(grid[j][i]);
            }
            for (List<Integer> row : rows) {
                if (row.equals(col)) {
                    count++;
                }
            }

        }

        return count;
    }
}