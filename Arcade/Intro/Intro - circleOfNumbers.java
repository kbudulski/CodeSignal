int circleOfNumbers(int n, int firstNumber) {

    //checking if the first number is smaller or greater than the middle number
    if (firstNumber < n/2) return n/2 + firstNumber;
    else if (firstNumber > n/2)  return firstNumber - n/2;
    else return 0;
}