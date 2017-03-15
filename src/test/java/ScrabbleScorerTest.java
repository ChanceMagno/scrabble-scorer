import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleScorerTest {

  @Test
  public void calculateSingleLetterScore_returnsScoreForSingleLetter_1() {
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

  @Test
  public void calculateSingleLetterScore_returnsScoreForSingleLetter_2() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateSingleLetterScore("d"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("g"));
  }

  @Test
  public void calculateSingleLetterScore_returnsScoreForSingleLetter_3() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateSingleLetterScore("b"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("c"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("m"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("p"));
  }

  @Test
  public void calculateSingleLetterScore_returnsScoreForSingleLetter_4() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateSingleLetterScore("f"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("h"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("v"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("w"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("y"));
  }

  @Test
  public void calculateSingleLetterScore_returnsScoreForSingleLetter_5() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 5;
    assertEquals(expected, testScrabble.calculateSingleLetterScore("k"));
  }

  @Test
  public void calculateSingleLetterScore_returnsScoreForSingleLetter_8() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 8;
    assertEquals(expected, testScrabble.calculateSingleLetterScore("j"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("x"));
  }

  @Test
  public void calculateSingleLetterScore_returnsScoreForSingleLetter_10() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 10;
    assertEquals(expected, testScrabble.calculateSingleLetterScore("q"));
    assertEquals(expected, testScrabble.calculateSingleLetterScore("z"));
  }

  @Test
  public void calculateWordScore_returnsScoreForCat_5() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 5;
    assertEquals(expected, testScrabble.calculateWordScore("cat"));
  }

}
