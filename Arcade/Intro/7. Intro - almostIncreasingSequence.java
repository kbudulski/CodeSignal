boolean almostIncreasingSequence(int[] s) {
    
    int count = 0, pos = 0;
    
    for (int i = 1; i < s.length; i++) {
        if (s[i-1] >= s[i]) {
            count++;
            pos = i;            
        }
    }
    return count > 1 || pos - 1 > 0 && pos + 1 < s.length && s[pos+1] <= s[pos-1] && s[pos] <= s[pos-2] ? false : true;
}