public class Book {
    private String title;
    private String author;
    private String genre;
    private String publisher;

    public Book(String title, String author, String genre, String publisher) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "\nTítulo: " + this.title + "\nAutor: " + this.author + "\nGenre: " + this.genre + "\nEditora: " + this.publisher + "\n";
    }

}