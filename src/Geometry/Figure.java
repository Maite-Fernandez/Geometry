package Geometry;
import java.util.Comparator;
/*
    Parent class Figure which contains other geometrical types.
 */
public abstract class Figure implements Comparable<Figure> {
    //This are the abstract functions defined.
    public abstract double surface();
    public abstract String getName();
    /*This is the comparator used to sort geometrical shapes based on the property surface.
     */
    public int compareTo(Figure f) {

        if (this.surface() > f.surface())
            return 1;
        else if (this.surface() < f.surface())
            return -1;
        else
            return 0;
    }
}
//Child Class of Figure
class Rectangle extends Figure{
    private double l1;
    private double l2;
    private String name;
    public Rectangle(double l1, double l2,String name){
        this.l1=l1;
        this.l2=l2;
        this.name=name;
    }

    //Inherited methods from the parent class Figure
    public double surface(){
        double surface= l1*l2;
        return surface;
    }
    public String getName(){
        return this.name;
    }
}
//Child Class of Rectangle
class Square extends Rectangle{
    //Constructor calls parent constructor Rectangle
    public Square(double l,String name){
        super(l,l,name);
    }
}
//Child Class of Figure
class Circle extends Figure{
    private double radius;
    private String name;
    public Circle(double r,String name){
        radius=r;
        this.name=name;
    }
    // //Inherited methods from the parent class Figure
    public double surface(){
        double surface=Math.PI*Math.pow(radius,2);
        return surface;
    }
    public String getName(){
        return this.name;
    }
}
//Child Class of Figure
class Triangle extends Figure{
    private double base;
    private double height;
    private String name;
    public Triangle(double b,double h, String name){
        base=b;
        height=h;
        this.name=name;
    }
    //Inherited methods from the parent class Figure
    public double surface(){
        double surface= (base*height)/2;
        return surface;
    }
    public String getName(){
        return this.name;
    }
}







