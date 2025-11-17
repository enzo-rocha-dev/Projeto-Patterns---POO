import java.util.ArrayList;
public class AuthorFilterStrategy implements BookFilterStrategy {

    private String searchAuthor;

    public AuthorFilterStrategy(String searchAuthor) {
        this.searchAuthor = searchAuthor.trim().toLowerCase().replaceAll("[\\p{Zs}\\s]+", " ");
    }

    @Override
    public ArrayList<Book> filterBooks(ArrayList<Book> books) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();

        for (Book book : books){

            String author = book.getAuthor().toLowerCase().trim().replaceAll("[\\p{Zs}\\s]+", " ");

            if(author.equalsIgnoreCase(this.searchAuthor)){
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }
}