package Geometry;
import java.util.Arrays;

public class FigureManagement {
    public static double sum(Figure[] figures){
        double total=0;
        for (Figure figure : figures) {
            total+=figure.surface();
        }
        return total;
    }

  public static void sort(Figure[] figures){
        Arrays.sort(figures);
    }
}

