package hangman.model;


public class BonusScore implements GameScore {
	

	/**
	 * @pre inicia con 0 puntos
	 * @pos condicion actual del puntaje
	 * @param correctCount 
	 * @param incorrectCount 
	 * @return int puntaje
	 */
	@Override
	public int calculateScore(int correctCount, int incorrectCount){
		int puntaje;
		int bonificacion = correctCount*10;
		int penalizar = incorrectCount*5;
		puntaje = bonificacion-penalizar;
		return puntaje;		
		
	}

}
