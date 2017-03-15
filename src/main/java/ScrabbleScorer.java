import java.util.Arrays;

public class ScrabbleScorer {
  public Integer calculateSingleLetterScore(String letterToScore) {
    Integer score = 0;
    String[] onePointArray = {"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};
    if (Arrays.asList(onePointArray).contains(letterToScore)) {
      score = 1;
    }
    return score;
  }


}
