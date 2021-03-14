package Arrays.CCC.CCC2020;
import java.util.ArrayList;
import java.util.Scanner;

class Coord {
    int x;
    int y;
    Coord(int x, int y) {
        this.x = x;
        this.y =y;
    }

    @Override
    public String toString() {
        return "Coord{" + "x=" + x + ", y=" + y + '}';
    }
}
public class J3_2020 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        int min_x = 0, min_y = 0, max_x = 100, max_y = 100;
        ArrayList<Coord> points = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            String[] point = in.nextLine().split(",");
            Coord coord = new Coord(Integer.parseInt(point[0]), Integer.parseInt(point[1]));
            points.add(coord);
        }
        min_x = points.get(0).x;
        max_x = points.get(0).x;
        min_y = points.get(0).y;
        max_y = points.get(0).y;
        for(int i = 0; i < N; i++) {
            if(points.get(i).x > max_x) {
                max_x = points.get(i).x;
            }
            else if(points.get(i).x < min_x) {
                min_x = points.get(i).x;
            }
            if(points.get(i).y > max_y) {
                max_y = points.get(i).y;
            }
            else if(points.get(i).y < min_y) {
                min_y = points.get(i).y;
            }
        }
        System.out.println((min_x - 1) + "," + (min_y - 1));
        System.out.println((max_x + 1) + "," + (max_y + 1));
    }

}
