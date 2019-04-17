String[] allLongestStrings(String[] inputArray) {

    int max = 0;
    List<String> list = new ArrayList<>();
    
    //searching for the longest string
    for (int i = 0; i < inputArray.length; i++) {
        if (inputArray[i].length() > max) max = inputArray[i].length();
    }

    //adding the longest strings to ArrayList
    for (int i = 0; i < inputArray.length; i++) {
        if (inputArray[i].length() == max) list.add(inputArray[i]);
    }

    //ArrayList to array
    String[] out = new String[list.size()];
    return list.toArray(out);
}