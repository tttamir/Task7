package Task2;

public class Circle extends Figure{
    public Circle(int a) {
        super(a);
    }

    @Override
    void square() {
        System.out.println("S of circle = "+ (a*a*3.14));
    }

    @Override
    void perimetr() {
        System.out.println("P of circle = "+ (2*3.14*a));
    }
}
