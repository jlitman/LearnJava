//Show dynamic method dispatch
//TwoDShape is a superclass
class TwoDShape {
    private double width;
    private double height;
    private String name;

    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    //copy ctor
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name  = ob.name;
    }

    double getWidth() {return width;}
    double getHeight() { return height;}
    void setWidth(double w) {width = w;}
    void setHeight(double h) {height = h;}

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Width and height are " + width + " " + height);
    }

    double area() {
        System.out.println("area method must be overridden");
        return 0.0;
    }
}

//Triangle inherits from TwoDShape
class Triangle extends TwoDShape {
    private String style;

    Triangle() {
        super();
        style = "none";
    }

    Triangle(String s, double w, double h) {
        super(w,h, "triangle");//feed base class ctor
        style = s;
    }

    Triangle(double x) {
        super(x, "triangle");
        style = "filled";
    }

    //copy ctor
    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    //Triangle can access TwoDShape member variables
    //override area
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Rectangle extends TwoDShape {
    Rectangle() {
        super();
    }

    Rectangle(double w, double h) {
        super(w,h,"rectangle");
    }

    Rectangle(double x) {
        super(x, "rectangle");
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    double area() {
        return getWidth() * getHeight();
    }
}

class DynamicShapes {
    public static void main(String args[])
    {
        TwoDShape shapes[] = new TwoDShape[5];
        shapes[0] = new Triangle("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Triangle(7.0);
        shapes[4] = new TwoDShape(10,20,"generic");

        for(int i=0;i<shapes.length;i++)
        {
            System.out.println("object is " + shapes[i].getName());
            System.out.println("area is " + shapes[i].area());
            System.out.println();
        }
    }
}

