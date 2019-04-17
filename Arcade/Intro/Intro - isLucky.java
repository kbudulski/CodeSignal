boolean isLucky(int n) {
    
    //int to string to split and count the sum of two parts
    String s = String.valueOf(n);
    int sum1 = 0;
    int sum2 = 0;
    String one = s.substring(0, s.length()/2);
    String two = s.substring(s.length()/2);
    
    for (int i = 0; i < one.length(); i++) {
        sum1 += Integer.parseInt(String.valueOf(one.charAt(i)));
        sum2 += Integer.parseInt(String.valueOf(two.charAt(i)));                      
    }
    return sum1 == sum2;
}