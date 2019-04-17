boolean isIPv4Address(String inputString) {
    String[] parts = inputString.split("\\.");
    if (parts.length != 4) return false;
    
    try {
        for (String str : parts) {
            if (Integer.parseInt(str) < 0 || Integer.parseInt(str) > 255 || str.isEmpty()) return false;
        }
    } catch (NumberFormatException e) {return false;}
    return true;
}

//alternative using regex
boolean isIPv4Address(String inputString) {
    
    return inputString.matches("(([0-1]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\.){3}([0-1]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])");
}