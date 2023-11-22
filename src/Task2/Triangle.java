package Task2;

import static java.lang.Math.sqrt;

public class Triangle extends Figure {
    int b;
    int c;
    public Triangle(int a, int b, int c) {
        super(a);
        this.b=b;
        this.c=c;
    }

    @Override
    void square() {
        int p=(a+b+c)/2;
        System.out.println("S of triangle = "+((sqrt((p*(p-a)*(p-b)*(p-c))))));
    }

    @Override
    void perimetr() {
        System.out.println("P of triangle = "+(3*a));
    }
}
