package frq.cs2007;

import java.util.ArrayList;

public class Player {
    private String name;
    public Player(String aName){
        name = aName;
    }

    public String getName() {
        return name;
    }

    public String getNextMove(GameState state) {
        return null;
    }
}

class RandomPlayer extends Player {
    public RandomPlayer(String name) {
        super(name);
    }

    @Override
    public String getNextMove(GameState state) {
        ArrayList<String> possibleMoves = state.getCurrentMoves();
        if(possibleMoves.size() == 0) {
            return "no move";
        }
        else {
            //state.makeMove(possibleMoves.get((int) (Math.random() * possibleMoves.size())));
            return possibleMoves.get((int) (Math.random() * possibleMoves.size()));
        }
    }
}

class GameDriver {
    private GameState state;
    private Player currentPlayer;
    private String chosenMove;
    private Player winner;

    public GameDriver(GameState initial) {
        state = initial;
    }

    public void play() {
        System.out.println(state);
        while (!state.isGameOver()) {
            currentPlayer = state.getCurrentPlayer();
            chosenMove = currentPlayer.getNextMove(state);
            System.out.println(currentPlayer.getName());
            System.out.println(chosenMove);
            state.makeMove(chosenMove);
        }

        winner = state.getWinner();
        // null if there was no winner
        if (winner == null) {
            System.out.println("Game ends in a draw");
        } else {
            System.out.println(winner.getName() + "wins");
        }
    }
}

