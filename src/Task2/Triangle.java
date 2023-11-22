package Task2;

import static java.lang.Math.sqrt;

public class Triangle extends Figure {

    public Triangle(int a) {
        super(a);
    }

    @Override
    void square() {
        System.out.println("S of triangle = "+((a*a*sqrt(3))/4));
    }

    @Override
    void perimetr() {
        System.out.println("P of triangle = "+(3*a));
    }
}
