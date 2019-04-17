//StringBuilder provides .reverse() method
static StringBuilder str = new StringBuilder();

String reverseInParentheses(String s) {

    int start = 0;
    int end = s.length() - 1;
    str.setLength(0);
    
    //recursion used to find the most nested parentheses
    if (s.contains("(")) {
        start = str.lastIndexOf("(");
        end = str.indexOf(")", start);
        str.append(s, start+1, end);
        return reverseInParentheses(s.substring(0, start) + str.reverse().toString() + s.substring(end+1));
    }
    return s;
}