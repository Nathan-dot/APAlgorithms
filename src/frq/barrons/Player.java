package frq.barrons;

import java.util.List;

public class Player {
    public static final int NUM_LETTERS = 4;
    private List<Tile> playerTiles;

    public void replaceTiles(TileSet t) {
        if(t.getUnusedSize() <= (NUM_LETTERS - playerTiles.size())) {
            int a = t.getUnusedSize();
            for(int i = 0; i < a; i++) {
                playerTiles.add(t.getNewTile());
            }
        }
        if(t.getUnusedSize() > (NUM_LETTERS - playerTiles.size())) {
            for(int i = 0; i < (NUM_LETTERS - playerTiles.size()); i++) {
                playerTiles.add(t.getNewTile());
            }
        }
    }

    public int getWordScore(int[] indexes) {
        int score = 0;
        if(indexes[0] == -1) {
            return 0;
        }
        if(playerTiles.size() == indexes.length) {
            score += 20;
        }
        for(int i = 0; i < indexes.length; i++) {
            score += playerTiles.get(indexes[i]).getValue();
        }
        return score;
    }
}
