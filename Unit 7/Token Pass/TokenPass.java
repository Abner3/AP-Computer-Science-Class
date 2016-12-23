import java.util.*;

public class TokenPass
{
    private int[] board;
    private int currentPlayer;
    Random generator = new Random();

    public TokenPass(int playerCount)
    {
        board = new int[playerCount];   
        for(int i = 0; i < board.length; i++){
            board[i] = generator.nextInt(9) + 1;
            System.out.println(board[i]);
        }
    }

    public void distributeCurrentPlayerTokens()
    {

    }
}