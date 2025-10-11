//8.1 Unit Testing Task 2.


public class StringManipulator {
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public int findLength(String str) {
        if (str == null){
            return 0;
        }
        else {
            return str.length();
        }
    }

    public String convertToUpperCase(String str) {
        if (str == null){
            return null;
        }
        else {
            return str.toUpperCase();
        }
    }

    public String convertToLowerCase(String str) {
        if (str == null){
            return null;
        }
        else {
            return str.toLowerCase();
        }
    }

    public boolean containsSubstring(String str, String subStr) {
        if (str == null || subStr == null){
            return false;
        }
        else {
            return str.contains(subStr);
 }
}
}