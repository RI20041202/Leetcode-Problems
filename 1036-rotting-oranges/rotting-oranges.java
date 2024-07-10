class Box {
    public int row;
    public int col;
    public int time;
    public Box(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}
 
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int freshOranges = 0;
        int spoiledOranges = 0;
        Queue<Box> Q = new LinkedList<>();
 
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (grid[row][col] == 1) {
                    freshOranges++;
                } else if (grid[row][col] == 2) {
                    spoiledOranges++;
                    Q.add(new Box(row, col, 0));
                }
            }
        }
 
        // edge cases 
        if (freshOranges == 0) {
            return 0;
        }
 
        if (spoiledOranges == 0) {
            return -1;
        }
 
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int result = 0;
        while (!Q.isEmpty()) {
            Box curr = Q.remove();
            result = Math.max(result, curr.time);
 
            for (int index = 0; index < 4; index++) {
                int newRow = curr.row + dx[index];
                int newCol = curr.col + dy[index];
 if (newRow >= 0 && newCol >= 0 && newRow < n && newCol < m && grid[newRow][newCol] == 1) {
                    grid[newRow][newCol] = 2;
                    freshOranges--;
                    Q.add(new Box(newRow, newCol, curr.time + 1));
                }
            }
        }
 
        if (freshOranges > 0) {
            return -1;
        }
        return result;
    }
}