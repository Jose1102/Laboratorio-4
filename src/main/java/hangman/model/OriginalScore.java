package hangman.model;


public class OriginalScore implements GameScore {
	

	/**
	 * @pre inicia con 100 puntos
	 * @pos condicion actual del puntaje
	 * @param correctCount 
	 * @param incorrectCount 
	 * @return int puntaje
	 */
	@Override
	public int calculateScore(int correctCount, int incorrectCount){
		int puntaje = 100;
		int descontar = incorrectCount*10;
		puntaje = punataje - descontar;
		return puntaje;		
		
	}

}
