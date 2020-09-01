package hangman;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import hangman.model.BonusScore;
import hangman.model.GameScore;
import hangman.model.OriginalScore;
import hangman.model.PowerBonusScore;
import hangman.model.exception.GameScoreException;
import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class GameScoreTest 
{
    /**
     * Clase de equivalencia donde el valor mínimo debe ser 0
     * @throws GameScoreException 
     */
    @Test
    public void deberiaTenerComoPuntajeMinimoCeroEnOriginalScore() throws GameScoreException
    {
        GameScore juego = new OriginalScore();
		int valor;
		valor = juego.calculateScore(10,15);
		Assert.assertEquals(valor,0);
    }
    /**
     * Clase de equivalencia donde se le envía 5 palabras incorrectas y su respuesta debe ser mayor a 50
     * @throws GameScoreException 
     */
    @Test
    public void DeberiaTenerComoPuntajeCincuentaEnOriginalScore() throws GameScoreException
    {
        GameScore juego = new OriginalScore();
		int valor;
		valor = juego.calculateScore(10,5);
		Assert.assertEquals(valor,50);
    }
    
    /**
     * Clase de equivalencia donde los números de palabras correctas y incorrectas no deben ser negativas
     * @throws GameScoreException 
     */
    @Test
    public void noDeberiaOperarConParamatrosNegativos() throws GameScoreException
    {
    	GameScore calcu= new OriginalScore();
    	int valor;
		valor = calcu.calculateScore(-3,-2);
		
    }
    
    /**
     * Clase de equivalencia deberia bonificar por número de cantidad de letras correctas
     * @throws GameScoreException 
     */
    @Test
    public void deberiaBonificarPorLetraCorrecta() throws GameScoreException
    {
    	GameScore calcu= new BonusScore();
    	int valor;
    	valor = calcu.calculateScore(6,0);
		Assert.assertEquals(valor,60);
		
    }
    
    /**
     * Clase de equivalencia deberia dejar como mínimo valor 0 cuando la cantidad de letras incorrectas
     * Son mayor a la cantidad de letras correctas
     * @throws GameScoreException 
     */
    @Test
    public void deberiaTenerComoMinimoValorCeroCuandoSonMayorLaCantidadDeLetrasIncorrectas() throws GameScoreException
    {
    	GameScore calcu= new BonusScore();
    	int valor;
    	valor = calcu.calculateScore(6,20);
		Assert.assertEquals(valor,0);
		
    }
    
    /**
     * Clase de equivalencia no debería permitir que se le ingrese a la clase BonusScore 
     * números negativos
     * @throws GameScoreException 
     */
    @Test
    public void noDeberiaTenerComoEntradaNumerosNegativos() throws GameScoreException
    {
    	GameScore calcu= new BonusScore();
    	int valor;
		valor = calcu.calculateScore(-3,-2);
		
    }
    
    /**
     * Clase de equivalencia deberia dejar como mínimo valor 0 cuando la cantidad de letras incorrectas
     * Son mayor a la cantidad de letras correctas para la clase de PowerBonusScore
     * @throws GameScoreException 
     */
    @Test
    public void deberiaTenerComoMinimoValorCeroCuandoMuchoMayorLaCantidadDeLetrasIncorrectasEnPowerScore() throws GameScoreException
    {
    	GameScore calcu= new PowerBonusScore();
    	int valor;
    	valor = calcu.calculateScore(2,9);
		Assert.assertEquals(valor,0);
		
    }
    
    /**
     * Clase de equivalencia deberia dejar como máximo valor 500, si se pasa de 500 el puntaje
     * debe ser 500 en la clase PowerBonusScore
     * @throws GameScoreException 
     */
    @Test
    public void deberiaTenerComoMaximoValorQuinientos() throws GameScoreException
    {
    	GameScore calcu= new PowerBonusScore();
    	int valor;
    	valor = calcu.calculateScore(200,0);
		Assert.assertEquals(valor,500);
		
    }
    
    /**
     * Clase de equivalencia deberia dejar como máximo valor 500, si se pasa de 500 el puntaje
     * debe ser 500 en la clase PowerBonusScore
     * @throws GameScoreException 
     */
    @Test
    public void noDeberiaTenererValoresDeEntradaNegativa() throws GameScoreException
    {
    	GameScore calcu= new PowerBonusScore();
    	int valor;
    	valor = calcu.calculateScore(-1,-40);
		
		
    }
    
}