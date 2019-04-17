int arrayMaximalAdjacentDifference(int[] inputArray) {
    
    int max = 0;
    int dif = 0;
    for (int i = 1; i < inputArray.length; i++) {
        dif = Math.abs(inputArray[i] - inputArray[i-1]);
        if (dif > max) max = dif;
    }
    return max;
}