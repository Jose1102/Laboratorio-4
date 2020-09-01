package hangman.model;
import hangman.model.exception.GameScoreException;

public interface GameScore {
	public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException;
}
