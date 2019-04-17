int firstDuplicate(int[] a) {

    //extra array created to count the occurences of numbers
    int[] tab = new int[a.length];    
    for (int i = 0; i < a.length; i++) {
        //numbers as indexes
        tab[a[i]-1]++;
        if (tab[a[i]-1] == 2) return a[i];
    }
    return -1;
}