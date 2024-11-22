import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    private List<Book> books;

    public Store() {
        this.books = new ArrayList<>();
    }

    public Book getBook(int index) {
        return new Book(this.books.get(index));
    }

    public void setBook(Book book, int index) {
        this.books.set(index, new Book(book));
    }

    public void addBook(Book book) {
        this.books.add(new Book(book));
    }

    public boolean contains(Book book) {
        return this.books.contains(book);
    }

    public void sellBook(String title) {
        for (int i = 0; i < this.books.size(); ++i) {
            Book currentBook = books.get(i);
            if (Objects.equals(currentBook.getTitle(), title)) {
                this.books.remove(i);
                break;
            }
        }
    }

}
