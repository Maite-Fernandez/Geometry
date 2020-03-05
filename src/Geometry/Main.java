package Geometry;
public class Main {
    public static void main(String[] args) {
        //Creates a Array of Object Figures
        Figure [] v= new Figure [4];
        //Initializes child objects
        v[0]=new Circle(7.5,"Circle");
        v[1]=new Rectangle(5,3,"Rectangle");
        v[2]=new Triangle(7,2,"Triangle");
        v[3]=new Square(7.8,"Square");
        //Displaying Geometrical Surface types and Surface Values.
        System.out.println("WELCOME TO OUR FIGURE MANAGER!\n These are our figures and their areas:");
        for (Figure figure : v) {
            System.out.println(figure.getName()+" : "+ Math.round(figure.surface()));
        }
        //Summation of all surfaces from array of geometrical figures
        double sum = FigureManagement.sum(v);
        //Displaying Results of the Summation
        System.out.println("The sum of areas is " + Math.round(sum));
        //Sorts geometrical figures by surface value.
        FigureManagement.sort(v);
        //Displaying the sort results.
        System.out.println("Now these are the figures sorted by area:");
            for (Figure figure : v) {
                System.out.println(figure.getName() +" : "+ Math.round(figure.surface()));
            }
        System.out.println("*We rounded the areas for better looks!");

    }
}
