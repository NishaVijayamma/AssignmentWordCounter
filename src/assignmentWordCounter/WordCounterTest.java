package assignmentWordCounter;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {
    @Test
    public void testInitialNumberOfSavedRows() {
        // Arrange
        WordCounter counter = new WordCounter();
        //Act

        int actual = counter.getRowCount();
        int expected = 0;
        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testNewRow() {
        // Arrange

        WordCounter counter = new WordCounter();
        //Act
        counter.increment("hej");
        int actual = counter.getRowCount();
        int expected = 1;
        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void setNewRows() {
        // Arrange
        WordCounter counter = new WordCounter();
        //Act
        counter.increment("hej");
        counter.increment("hej my name");
        counter.increment("hej my name is Nisha");

        int actual = counter.getRowCount();
        int expected = 3;
        //Assert
        assertEquals(expected, actual);

    }
    @Test
    public void testInitialCharCount() {
        // Arrange
        WordCounter counter = new WordCounter();
        //Act

        int actual = counter.getCharCount();
        int expected = 0;
        //Assert
        assertEquals(expected, actual);

    }
    @Test
    public void testCharCount() {
        // Arrange
        WordCounter counter = new WordCounter();
        //Act
        counter.increment("hej");
        counter.increment("hej my name");

        int actual = counter.getCharCount();
        int expected = 14;
        //Assert
        assertEquals(expected, actual);

    }
    @Test
    public void testCharCountWithMoreRows() {
        // Arrange
        WordCounter counter = new WordCounter();
        //Act
        counter.increment("hej");
        counter.increment("hej my name");
        counter.increment("hej my name is Nisha");
        counter.increment("Nisha is a student");


        int actual = counter.getCharCount();
        int expected = 52;
        //Assert
        assertEquals(expected, actual);

    }
    @Test
    public void testInitialWordCount() {
        // Arrange
        WordCounter counter = new WordCounter();
        //Act

        int actual = counter.getWordCount();
        int expected = 0;
        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testWordCount() {
        // Arrange
        WordCounter counter = new WordCounter();
        //Act
        counter.increment("hej");
        counter.increment("hej my name");
        counter.increment("hej my name is Nisha");
        int actual = counter.getWordCount();
        int expected = 9;
        //Assert
        assertEquals(expected, actual);

    }
    @Test
    public void testWordCountWithMoreRows() {
        // Arrange
        WordCounter counter = new WordCounter();
        //Act
        counter.increment("hej");
        counter.increment("hej my name");
        counter.increment("hej my name is Nisha");
        counter.increment("Nisha is a student");
        counter.increment("Nisha is studying Java");

        int actual = counter.getWordCount();
        int expected = 17;
        //Assert
        assertEquals(expected, actual);

    }
    @Test
    public void testLongestWord() {
        // Arrange
        WordCounter counter = new WordCounter();
        //Act
        counter.increment("hej");
        counter.increment("hej my name");
        counter.increment("hej my name is Nishaa");


        String actual = counter.getLongestWord();
        String expected ="Nishaa" ;
        //Assert
        assertEquals(expected, actual);

    }
    @Test
    public void testLongestWordWithMoreRows() {
        // Arrange
        WordCounter counter = new WordCounter();
        //Act
        counter.increment("hej");
        counter.increment("hej my name");
        counter.increment("hej my name is Nisha");
        counter.increment("Nisha is a student");
        counter.increment("Nisha is studying Java");


       String actual = counter.getLongestWord();;
       String expected = "studying";
        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testWithTextStop() {
        // Arrange
        WordCounter counter = new WordCounter();
        //Act
        counter.increment("hej");
        counter.increment("hej my name");

        counter.increment("stop");

        boolean actual = counter.isStopReadText();
        boolean expected = true;
        //Assert
        assertEquals(expected, actual);

    }
    @Test
    public void testWithOutTextStop() {
        // Arrange
        WordCounter counter = new WordCounter();
        //Act
        counter.increment("hej");
        counter.increment("hej my name");

        boolean actual = counter.isStopReadText();
        boolean expected = false;
        //Assert
        assertEquals(expected, actual);

    }
    @Test
    public void testCheckRowCountWithTextStop() {
        // Arrange
        WordCounter counter = new WordCounter();
        //Act
        counter.increment("hej");
        counter.increment("hej my name");
        counter.increment("stop");

        int actual = counter.getRowCount();;
        int expected = 2;
        //Assert
        assertEquals(expected, actual);

    }
    @Test
    public void testCheckCharCountWithTextStop() {
        // Arrange
        WordCounter counter = new WordCounter();
        //Act
        counter.increment("hej");
        counter.increment("hej my name");
        counter.increment("stop");

        int actual = counter.getCharCount();;
        int expected = 14;
        //Assert
        assertEquals(expected, actual);

    }
    @Test
    public void testCheckWordCountWithTextStop() {
        // Arrange
        WordCounter counter = new WordCounter();
        //Act
        counter.increment("hej");
        counter.increment("hej my name");
        counter.increment("stop");

        int actual = counter.getWordCount();
        int expected = 4;
        //Assert
        assertEquals(expected, actual);

    }


}