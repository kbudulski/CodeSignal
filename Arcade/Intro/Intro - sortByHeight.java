int[] sortByHeight(int[] a) {

    //adding only people to ArrayList, sorting and adding them back
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < a.length; i++) {
        if (a[i] != -1) list.add(a[i]);
    }
    Collections.sort(list);
    
    for (int i = 0; i < a.length; i++) {
        if (a[i] != -1) {
            a[i] = list.get(0);
            list.remove(0);
        }
    }
    return a;
}