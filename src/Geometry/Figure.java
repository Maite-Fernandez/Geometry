package Geometry;

public abstract class Figure implements Comparable<Figure> {
    public abstract double surface();
    public abstract String getName();

    public int compareTo(Figure f) {
        if (this.surface() > f.surface())
            return 1;
        else if (this.surface() < f.surface())
            return -1;
        else
            return 0;
    }
}

class Rectangle extends Figure{
    private double l1;
    private double l2;
    private String name;

    public String getName(){
        return this.name;
    }

    public Rectangle(double l1, double l2,String name){
        this.l1=l1;
        this.l2=l2;
        this.name=name;
    }

    public double surface(){
        double surface= l1*l2;
        return surface;
    }


}

class Square extends Rectangle{
    public Square(double l,String name){
        super(l,l,name);
    }
}

class Circle extends Figure{

    private double radius;
    private String name;

    public String getName(){
        return this.name;
    }

    public Circle(double r,String name){
        radius=r;
        this.name=name;
    }

    public double surface(){
        double surface=Math.PI*Math.pow(radius,2);
        return surface;
    }


}

class Triangle extends Figure{
    private double base;
    private double height;
    private String name;

    public String getName(){
        return this.name;
    }

    public Triangle(double b,double h, String name){
        base=b;
        height=h;
        this.name=name;
    }

    public double surface(){
        double surface= (base*height)/2;
        return surface;
    }

}







