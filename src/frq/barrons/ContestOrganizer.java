package frq.barrons;

public class ContestOrganizer {
    public static final int NUM_ROWS = 22;
    public static final int CONTESTANTS_PER_ROW = 31;
    private Contestant[][] contestants;

    private void sort(Contestant[] arr) {
        Contestant[] a = new Contestant[arr.length];
        int count = 0;
        for(int i = 0; i < arr.length-1; i++) {
           for(int j = 1; j < arr.length-2; j++) {
               if(arr[i].getScore() > arr[j].getScore()) {
                   count++;
               }
               if(arr[i].getScore() < arr[j].getScore()) {
                   i++;
                   j = 0;
               }
               if(count == arr.length-1) {
                   a[i] = arr[i];
               }
           }
        }
        arr = a;
    }

    public void sortAllRows() {
        for(Contestant[] a : contestants) {
            sort(a);
        }
    }

    public String findWinnerName() {
        Contestant winner = contestants[0][0];
        sortAllRows();
        for(int i = 0; i < NUM_ROWS; i++) {
            Contestant a = contestants[i][CONTESTANTS_PER_ROW];
            if(a.getScore() > winner.getScore()){
                winner = a;
            }
        }
        return winner.getName();
    }


}
