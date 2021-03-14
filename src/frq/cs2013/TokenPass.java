package frq.cs2013;

public class TokenPass {
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount) {
        board = new int[playerCount];
        for(int i = 0; i < board.length; i++) {
            board[i] =(int)(Math.random() * 10 + 1);
        }
        currentPlayer = (int)(Math.random() * (playerCount));
    }

    public void distributeCurrentPlayerTokens(){
        int tokens = board[currentPlayer];
        board[currentPlayer] = 0;
        int finalIndex = currentPlayer + 1;

        while(tokens > 0) {
            if(finalIndex == board.length) {
                finalIndex = 0;
            }

            board[finalIndex]++; //tokens player has
            tokens--; //amount to give
            finalIndex++;
        }
    }
}
