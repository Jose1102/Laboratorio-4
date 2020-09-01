package hangman.model.exception;



public class GameScoreException extends Exception
{
    // instance variables - replace the example below with your own
    public static final String NUMERO_NEGATIVO= "No se pueden ingresar valores negativos";
    

    /**
     * Constructor for objects of class GameScoreException
     */
    public GameScoreException(String message)
    {
        super(message);
    }

    
}