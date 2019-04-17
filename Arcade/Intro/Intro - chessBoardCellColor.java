boolean chessBoardCellColor(String cell1, String cell2) {

    int A1 = cell1.charAt(0);
    int A2 = cell1.charAt(1);
    int B1 = cell2.charAt(0);
    int B2 = cell2.charAt(1);

    return Math.abs(A1 - B1) % 2 == Math.abs(A2 - B2) % 2;
}