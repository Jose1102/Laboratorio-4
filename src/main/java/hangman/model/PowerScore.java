package hangman.model;


public class PowerScore implements GameScore {
	

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
		int bonificacion += (int) Math.pow(5, correctCount);
		int penalizar = incorrectCount*8;
		
		puntaje = bonificacion-penalizar;
		
		if(puntaje>500){
			puntaje = 500;
		}
		
		return puntaje;		
		
	}

}