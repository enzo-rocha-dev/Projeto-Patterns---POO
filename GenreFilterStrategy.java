import java.util.ArrayList;
public class GenreFilterStrategy implements BookFilterStrategy {

    private String searchGenre;

    public GenreFilterStrategy(String searchGenre) {
        this.searchGenre = searchGenre.toLowerCase().trim();
    }

    @Override
    public ArrayList<Book> filterBooks(ArrayList <Book> books) {

        ArrayList <Book> booksBygenre = new ArrayList<>();

        for (Book book : books){

            String genre = book.getGenre().toLowerCase().trim();

            if(genre.equals(this.searchGenre)){
                booksBygenre.add(book);
            }
        }
        return booksBygenre;
    }
}