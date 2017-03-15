import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("I'm a scrabble scorer! type a single word in and I will output the score");

    String userInputtedWord = myConsole.readLine();


    ScrabbleScorer wordScore = new ScrabbleScorer();
    Integer score = wordScore.calculateWordScore(userInputtedWord);

    System.out.println(score);

  }
}
