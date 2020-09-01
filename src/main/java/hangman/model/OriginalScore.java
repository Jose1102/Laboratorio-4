package hangman.model;
import hangman.model.exception.GameScoreException;

public class OriginalScore implements GameScore {
	

	/**
	 * @pre inicia con 100 puntos
	 * @pos condicion actual del puntaje
	 * @param correctCount 
	 * @param incorrectCount 
	 * @return int puntaje
	 * @throws NUMERO_NEGATIVO, muestra en pantalla cuando se ingresa un valor negativo
	 */
	@Override
	public int calculateScore (int correctCount, int incorrectCount) throws GameScoreException{
		if(correctCount<0 || incorrectCount<0){
			throw new GameScoreException(GameScoreException.NUMERO_NEGATIVO);
			
		}
		else{
			int puntaje = 100;
			int descontar = incorrectCount*10;
			puntaje = puntaje - descontar;
			if(puntaje <0){
				puntaje =0;
			}
			return puntaje;		
		}
		
		
	}

}
