int arrayChange(int[] a) {

    int counter = 0;
    for (int i = 1; i < a.length; i++) {
        while (a[i] <= a[i-1]) {
            a[i]++;
            counter++;
        }
    }
    return counter;
}