int makeArrayConsecutive2(int[] statues) {

    Arrays.sort(statues);
    return (statues[statues.length-1] - statues[0] + 1) - statues.length;
}