boolean checkPalindrome(String inputString) {
    
    StringBuilder pal = new StringBuilder();
    pal.append(inputString);
    pal = pal.reverse();
    
    return pal.toString().equals(inputString) ? true : false;
}