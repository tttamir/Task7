package Task2;

public class Square extends Figure{

    public Square(int a) {
        super(a);

    }

    @Override
    void square() {
        System.out.println("S of square = "+ (a*a));
    }

    @Override
    void perimetr() {
        System.out.println("P of square = "+ (4*a));
    }
}
