class Solution {
 
    private void visitAllNeighbours(int row, int col, int[][] visited, char[][] grid, int totalRows, int totalCols) {
 
if (col < 0 || row < 0 || row == totalRows || col == totalCols || grid[row][col] == '0' || visited[row][col] == 1) {
            return;
        }
 
        visited[row][col] = 1;
 
        // visit top cell
        visitAllNeighbours(row - 1, col, visited, grid, totalRows, totalCols);
 
        // visit bottom cell
        visitAllNeighbours(row + 1, col, visited, grid, totalRows, totalCols); 
 
        // visit left cell 
        visitAllNeighbours(row, col - 1, visited, grid, totalRows, totalCols);
 
 
        // visit right cell
        visitAllNeighbours(row, col + 1, visited, grid, totalRows, totalCols);
    }
 
    public int numIslands(char[][] grid) {
        int islandCount = 0;
        int totalRows = grid.length;
        int totalCols = grid[0].length;
        int[][] visited = new int[totalRows][totalCols];
        for (int row = 0; row < totalRows; row++) {
            for (int col = 0; col < totalCols; col++) {
                visited[row][col] = 0;
            }
        }
        for (int row = 0; row < totalRows; row++) {
            for (int col = 0; col < totalCols; col++) {
                if (grid[row][col] == '1' && visited[row][col] == 0) {
 
                    visitAllNeighbours(row, col, visited, grid, totalRows, totalCols);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }
}