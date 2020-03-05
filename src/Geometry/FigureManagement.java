package Geometry;
import java.util.Arrays;
//Figure Management Class implements sum and sort methods.
public class FigureManagement {
    //Sum method for Geometrical Figure Surface.
    public static double sum(Figure[] figures){
        double total=0;
        for (Figure figure : figures) {
            total+=figure.surface();
        }
        return total;
    }
//Sorts Geometrical Figures based on the property Surface.
  public static void sort(Figure[] figures){
        Arrays.sort(figures);
    }
}

