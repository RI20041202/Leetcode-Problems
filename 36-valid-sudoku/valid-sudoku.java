class Solution {
    public boolean isValidSudoku(char[][] board) {
         HashSet<String> sudoku = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                if (current != '.') {
                    String row = current + " in row " + i;
                    String col = current + " in column " + j;
                    String box = current + " in box " + (i / 3) + "-" + (j / 3);
                    if (!sudoku.add(row) || !sudoku.add(col) || !sudoku.add(box)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
