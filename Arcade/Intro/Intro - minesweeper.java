int[][] minesweeper(boolean[][] matrix) {

    //either this or a lot of ifs (ArrayIndexOutOfBoundsException MADNESS)
    int[][] out = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] == true) {
                try {
                    out[i][j-1]++;
                }catch (Exception ignored) {}
                try {
                    out[i][j+1]++;
                }catch (Exception ignored) {}
                try {
                    out[i-1][j]++;
                }catch (Exception ignored) {}
                try {
                    out[i+1][j]++;
                }catch (Exception ignored) {}
                try {
                    out[i-1][j-1]++;
                }catch (Exception ignored) {}
                try {
                    out[i-1][j+1]++;
                }catch (Exception ignored) {}
                try {
                    out[i+1][j-1]++;
                }catch (Exception ignored) {}
                try {
                    out[i+1][j+1]++;
                } catch (Exception ignored) {}
            }
        }
    }
    return out;
}