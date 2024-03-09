class WordCount {
    public static void main(String[] args) {
        String input = "one two three four 123";

        int count = 0;
        boolean isWord = false;

        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the current character is a letter
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                // If it's a letter and not part of a word, increment the count
                if (!isWord) {
                    count++;
                    isWord = true; // Set isWord to true to mark the beginning of a word
                }
            } else {
                // If it's not a letter, reset isWord to false
                isWord = false;
            }
        }

        System.out.println("Word count: " + count);
    }
}