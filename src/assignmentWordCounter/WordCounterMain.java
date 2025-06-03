package assignmentWordCounter;
import java.util.Scanner;

public class WordCounterMain {
    public static void main(String[] args) {
        // Scanner class to read the user input text
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the text");
        // Create object for the class WordCounter
        WordCounter wordcounter = new WordCounter();
        // Read the text
        while(!wordcounter.isStopReadText())
        {
            String text1 = scan.nextLine();
            wordcounter.increment(text1);

        }

        //  Call and print text count, character count, word count, longest word,check  text =stop
        System.out.println("Total number of rows in the text="+ wordcounter.getRowCount());
        System.out.println("Total number of characters in the text including space="+ wordcounter.getCharCount());
        System.out.println("Total number of words in the text="+ wordcounter.getWordCount());
        System.out.println("Longest word in the text="+ wordcounter.getLongestWord());
        System.out.println("Does the user write the word 'stop' ?"+ wordcounter.isStopReadText());
        scan.close();
    }
}
