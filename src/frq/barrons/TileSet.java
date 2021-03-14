package frq.barrons;

import java.util.List;

public class TileSet {
    private List<Tile> tiles;
    private int unusedSize;

    public boolean allUsed() {
        return unusedSize == 0;
    }

    public int getUnusedSize() {
        return unusedSize;
    }

    public void shuffle() {
        for(int k = tiles.size(); k >= 0; k--) {
            int random = (int) (Math.random() * k);
            Tile temp = tiles.get(k);
            tiles.set(k ,tiles.get(random));
            tiles.set(random, temp);
        }
    }

    public Tile getNewTile() {
        return null;
    }
}
