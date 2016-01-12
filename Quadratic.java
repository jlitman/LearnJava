//use static imports to make code easier to read
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

class Quadratic {
    public static void main(String args[]) {
        double a,b,c,x;
        //solve 4x^2 + x - 3 = 0 for x
        a = 4;
        b = 1;
        c = -3;

        //first solution
        x = (-b + sqrt(pow(b,2) - 4*a*c)) /(2*a);
        System.out.println("First solution: " + x);

        x = (-b - sqrt(pow(b,2) - 4*a*c)) /(2*a);
        System.out.println("Second solution: " + x);
    }
}
