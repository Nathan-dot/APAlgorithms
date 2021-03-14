package frq.cs2004;

public class Robot {
    private int[] hall;
    private int pos;
    private boolean facingRight;

    private boolean forwardMoveBlocked() {
        if((pos == hall.length-1 && facingRight) || (pos == 0 && (!facingRight))) {
            return true;
        }
        return false;
    }

    private void move(){
        if(hall[pos] > 0) {
            hall[pos]--;
        }
        if(hall[pos] == 0) {
            if(forwardMoveBlocked()) {
                facingRight = !facingRight;
            }
            else if(facingRight) {
                pos++;
            }
            else{
                pos--;
            }
        }

    }

    public int clearHall() {
        int count = 0;
        while(!hallIsClear()) {
            move();
            count++;
        }
        return count;
    }

    private boolean hallIsClear() {
        if(hall == null || hall.length == 0) {
            return true;
        }
        return false;
    }
}
