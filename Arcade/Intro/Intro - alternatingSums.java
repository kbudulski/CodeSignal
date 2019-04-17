int[] alternatingSums(int[] a) {

    int[] sum = new int[2];
    for (int i = 0; i < a.length; i++) {
        if (i % 2 == 0) sum[0] += a[i];
        else sum[1] += a[i];
    }
    return sum;
}