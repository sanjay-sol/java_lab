class Print1 {
    public static void main(String[] args) {
        System.out.println(func(0, "bcaaddeaaad"));
    }

    static String func(int i, String str) {
        // Move to the next character
        if (str.length() == i)
            return str;
        if (str.charAt(i) == 'a') {
            String str1 = removeCharAtIndex(str, i);
            return func(i, str1);
        }
        i++;
        return func(i, str);

    }

    static String removeCharAtIndex(String str, int index) {
        if (index < 0 || index >= str.length()) {
            return str; // Return the original string if index is out of bounds
        }

        // Create a new string by excluding the character at the specified index
        return str.substring(0, index) + str.substring(index + 1);
    }
}
