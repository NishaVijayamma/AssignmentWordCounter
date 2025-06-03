package assignmentWordCounter;

public class WordCounter {
    // Attributes
    private int rowCount;
    private int charCount;
    private int countWords;
    private String longestWord;
    private boolean stopReadText;

    public WordCounter() {
        // Constructor
        this.rowCount = 0;
        this.charCount = 0;
        this.countWords = 0;
        this.longestWord = " ";
        this.stopReadText = false;

    }

    // Method to return the no of rows
    public int getRowCount() {

        return rowCount;
    }

    // Method  to return the number  of characters
    public int getCharCount() {

        return charCount;
    }

    // Method  to return the number  of words
    public int getWordCount() {

        return countWords;
    }

    // Method  to return the longest word
    public String getLongestWord() {

        return longestWord;
    }

    // Method  to check stop entered or not
    public boolean isStopReadText() {

        return stopReadText;
    }

    public void increment(String text) {
        // Check if the user writes stop
        if (text.equals("stop")) {
            stopReadText = true;
        }
        else
        {
            stopReadText = false;
            // Increment the row count
            rowCount++;
            //  count the characters of the  string text.
            charCount += text.length();
            //  split the words in the incoming text and stored it in array 'words'
            String[] words = text.split(" ");
            // count the  total number of words in the array
            countWords += words.length;

            // Loop to find the longest word
            for (int i = 0; i < words.length; i++)
            {
                // if the length of the  characters of current word  in the array >the  longest word length
                //replace the longest word with the current word
                if (words[i].length() > longestWord.length())
                {
                    longestWord = words[i];
                }

            }

        }

    }
}








