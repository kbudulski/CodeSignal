int adjacentElementsProduct(int[] tab) {

    int max = tab[0] * tab[1];
    
    //searching for the max
    for (int i = 2; i < tab.length; i++) {
        int temp = tab[i] * tab[i-1];
        if (temp > max) max = temp;
    }
    return max;
}