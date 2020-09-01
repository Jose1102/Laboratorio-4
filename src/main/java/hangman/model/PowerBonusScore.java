package hangman.model;
import hangman.model.exception.GameScoreException;

public class PowerBonusScore implements GameScore {
	

	/**
	 * @pre inicia con 0 puntos
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
			int puntaje;
			int bonificacion = 0;
			bonificacion += (int) Math.pow(5.0,(double)correctCount);
			int penalizar = incorrectCount*8;
		
			puntaje = bonificacion-penalizar;
		
			if(puntaje>500){
				puntaje = 500;
			}
			
			if(puntaje<0) {
				puntaje = 0;
			}
		
			return puntaje;	
		}
		
	}

}