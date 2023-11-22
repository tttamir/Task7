package Task3;

public class Main3 {
    public static void main(String[] args) {

        Book book = new Book();
        book.setNameOfBook("ClockWork orange");
        book.setPage(289);
        System.out.println("Name - "+book.getNameOfBook()+" pages - "+book.getPage());
        Book clone;
        try {
            clone = book.clone();
            clone.setNameOfBook("Bobr");
            clone.setPage(30);
            System.out.println("Name' - "+clone.getNameOfBook()+" pages' - "+clone.getPage());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Name - "+book.getNameOfBook()+" pages - "+book.getPage());
    }
}
