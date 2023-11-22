package Task3;

public class Book implements Cloneable{
    int page;
    String nameOfBook;


    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Book clone() throws CloneNotSupportedException {
        return (Book)super.clone();
    }

}
