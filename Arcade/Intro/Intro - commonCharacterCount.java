int commonCharacterCount(String s1, String s2) {
    
    int counter = 0;
    for (int i = 0; i < s2.length(); i++) {
        if (s1.contains(String.valueOf(s2.charAt(i)))) {
            counter++;
            s1 = s1.replaceFirst(String.valueOf(s2.charAt(i)), "");
        }
    }
    return counter;
}