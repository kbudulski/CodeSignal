boolean palindromeRearranging(String inputString) {
    
    //HashMap is used to count all the letters
    HashMap<Character, Integer> map = new HashMap<>();
    char[] tab = inputString.toCharArray();
    int counter = 0;
    
    for (char c : tab) {
        if (map.containsKey(c)) map.put(c, map.get(c)+1);
        else map.put(c,1);
    }

    //checking if there is more than one odd number of letters
    for (int value : map.values()) {
        if (value % 2 != 0) counter++;
    }
    return counter < 2;
}