import java.util.ArrayList; 

public class Catalog {

    private BookFilterStrategy filterStrategy;
    private ArrayList<Book> books;

    public Catalog(ArrayList<Book> books) {
        this.books = books;
    }

    public void setFilterStrategy(BookFilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void filterBooks() {
        System.out.println(filterStrategy.filterBooks(books));
    }

    public void showAllBooks(){
        System.out.println(books); 
    }

}