String[] addBorder(String[] picture) {
    
    // .repeat() method added in Java 11
    String star = "*";
    List <String> list = new ArrayList<>();

    //adding upper border
    list.add(star.repeat(picture[0].length()+2));

    //adding stars on the left and right 
    for (int i = 0; i < picture.length; i++) {
        list.add(star + picture[i] + star);
    }

    //adding bottom border
    list.add(star.repeat(picture[0].length()+2));
    return list.toArray(new String[0]);
}