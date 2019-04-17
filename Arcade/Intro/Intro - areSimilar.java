boolean areSimilar(int[] a, int[] b) {

    int counter = 0, mul1 = 1, mul2 = 1;
    
    //multiplication because of the double values
    for(int i = 0; i < a.length; i++) {
        if (a[i] != b[i]) counter++;
        mul1 *= a[i];
        mul2 *= b[i];
    }

    //counter used for swap count check
    return (counter < 3 && mul1 == mul2);
}