package Geometry;
public class Main {
    public static void main(String[] args) {

        Figure [] v= new Figure [4];

        v[0]=new Circle(7.5,"Circle");
        v[1]=new Rectangle(5,3,"Rectangle");
        v[2]=new Triangle(7,2,"Triangle");
        v[3]=new Square(7.8,"Square");

        System.out.println("WELCOME TO OUR FIGURE MANAGER!\n These are our figures and their areas:");
        for (Figure figure : v) {
            System.out.println(figure.getName()+" : "+ Math.round(figure.surface()));
        }

        double sum = FigureManagement.sum(v);

        System.out.println("The sum of areas is " + Math.round(sum));

        FigureManagement.sort(v);

        System.out.println("Now these are the figures sorted by area:");
            for (Figure figure : v) {
                System.out.println(figure.getName() +" : "+ Math.round(figure.surface()));
            }

        System.out.println("*We rounded the areas for better looks!");

    }
}
