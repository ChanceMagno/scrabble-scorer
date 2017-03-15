import java.util.Arrays;

public class ScrabbleScorer {

  public Integer calculateWordScore(String wordToScore) {
    String[] lettersToScore = wordToScore.toLowerCase().split("");
    Integer wordScore = 0;
    for (String letterToScore : lettersToScore) {
      wordScore += calculateSingleLetterScore(letterToScore);
    }
    return wordScore;
  }

  public Integer calculateSingleLetterScore(String letterToScore) {
    Integer singleLetterScore = 0;
    String[] onePointArray = {"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};
    String[] twoPointArray = {"d", "g"};
    String[] threePointArray = {"b", "c", "m", "p"};
    String[] fourPointArray = {"f", "h", "v", "w", "y"};
    String[] eightPointArray = {"j", "x"};
    String[] tenPointArray = {"q", "z"};
    if (Arrays.asList(onePointArray).contains(letterToScore)) {
      singleLetterScore = 1;
    } else if (Arrays.asList(twoPointArray).contains(letterToScore)) {
      singleLetterScore = 2;
    } else if (Arrays.asList(threePointArray).contains(letterToScore)) {
      singleLetterScore = 3;
    } else if (Arrays.asList(fourPointArray).contains(letterToScore)) {
      singleLetterScore = 4;
    } else if (letterToScore.equals("k")) {
      singleLetterScore = 5;
    } else if (Arrays.asList(eightPointArray).contains(letterToScore)) {
      singleLetterScore = 8;
    } else if (Arrays.asList(tenPointArray).contains(letterToScore)) {
      singleLetterScore = 10;
    }
    return singleLetterScore;
  }


}
