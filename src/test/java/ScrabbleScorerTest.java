import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleScorerTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateSingleLetterScore("a"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("e"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("i"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("o"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("u"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("l"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("n"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("r"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("s"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("t"));
  }

}
