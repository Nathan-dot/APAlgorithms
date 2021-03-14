package frq.cs2012;

public class HorseBarn {

    private Horse[] spaces;

    public HorseBarn(Horse[] spaces) {
        this.spaces = spaces;
    }

    public int findHorseSpace(String name) {
        for(int i = 0; i < spaces.length; i++) {
            if(spaces[i] != null && spaces[i].getName() != null) {
                if(spaces[i].getName().equals(name)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void consolidate() {
        int empty = 0;
        for(int i = 0; i < spaces.length; i++) {
            if(spaces[i] != null) {
                spaces[empty] = spaces[i];
                empty++;
            }
        }
        for(int i = empty; i < spaces.length; i++)
            spaces[i] = null;
    }
}
