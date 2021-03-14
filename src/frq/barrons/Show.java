package frq.barrons;

public class Show {
    private int[][] seats;
    private final int SEATS_PER_ROW = 3;
    private final int NUM_ROWS = 2;

    public boolean isAisleSeat(int row, int seatNumber) {
        if(seatNumber == SEATS_PER_ROW-1 || seatNumber == 0) {
            return true;
        }
        return false;
    }

    public boolean twoTogether() {
        for(int r = 0; r < NUM_ROWS; r++) {
            for(int c = 0; c < SEATS_PER_ROW - 1; c++) {
                if(seats[r][c] == 0 && seats[r][c+1] == seats[r][c]) {
                    seats[r][c] = 1;
                    seats[r][c+1] = 1;
                    return true;
                }
            }
        }
        return false;
    }

    public int findAdjacent(int row, int seatsNeeded) {
        int count = 0;
        int index = 0;
        int a = 0;
        while(index < SEATS_PER_ROW) {
            while(index < SEATS_PER_ROW && seats[row][index] == 0) {
                count++;
                index++;
                if(count == seatsNeeded) {
                    return a;
                }
            }
            count = 0;
            index++;
            a = index;
        }
        return -1;
    }
}
