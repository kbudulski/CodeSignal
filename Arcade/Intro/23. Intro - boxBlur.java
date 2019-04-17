int[][] boxBlur(int[][] image) {
    
    int[][] out = new int[image.length-2][image[0].length-2];
    
    //i for vertical iteration, j for horizontal iteration, starting at first row and third column
    for (int i = 0; i < image.length-2; i++) {
        for (int j = 2; j < image[0].length; j++) {
            out[i][j-2] = (image[i][j-2] + image[i][j-1] + image[i][j] + image[i+1][j-2] + image[i+1][j-1] + image[i+1][j] + image[i+2][j-2] + image[i+2][j-1] + image[i+2][j])/9;
        }
    }
    return out;
}