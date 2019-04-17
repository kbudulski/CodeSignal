    String alphabeticShift(String inputString) {
        char c;
        String out = "";

        //letter shift with boundary case
        for (int i = 0; i < inputString.length(); i++) {
            c = inputString.charAt(i);
            if (inputString.charAt(i) == 'z') c = 'a';
            else c++;
            out += c;
        }
        return out;
    }