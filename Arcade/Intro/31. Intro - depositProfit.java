int depositProfit(int deposit, int rate, int threshold) {
    int years = 0;
    double d = (double)deposit;
    while (d < threshold) {
        d = d * (100 + rate) / 100;
        years++;
    } 
    return years;
}