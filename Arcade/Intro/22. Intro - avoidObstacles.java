int avoidObstacles(int[] inputArray) {
    
    //checking if a number and its multiple is not in the array
    boolean flag = false;
    int jump = 1;
    Arrays.sort(inputArray);
    while (flag == false) {
        for (int j = 0; j < inputArray.length; j++) {
            if (inputArray[j] % jump == 0)  {
                jump++; 
                flag = false;
                break;
            }
            if (j == inputArray.length-1) flag = true;
        }
    }
    return jump;
}