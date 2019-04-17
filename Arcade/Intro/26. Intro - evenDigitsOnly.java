boolean evenDigitsOnly(int n) {
    
    while (n != 0) {
        if (n % 2 != 0) return false;
        n /= 10;
    }
    return true;
}