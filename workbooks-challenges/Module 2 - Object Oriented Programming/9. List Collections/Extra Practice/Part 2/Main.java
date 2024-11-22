public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99);
        Book book2 = new Book("1984", "George Orwell", 4.17, 12.99);

        Store store = new Store();
        store.addBook(book1);
        store.addBook(book2);

        Book retrievedBook0 = store.getBook(0);
        Book retrievedBook1 = store.getBook(1);
        System.out.println(retrievedBook0.getTitle());
        System.out.println(retrievedBook1.getTitle());

        Book newBook = new Book("Moby-Dick", "Herman Melville", 3.5, 14.99);
        store.setBook(newBook, 0);

        retrievedBook0 = store.getBook(0);
        System.out.println(retrievedBook0.getTitle());

        System.out.println(store.contains(book2));

        store.sellBook("1984");
        System.out.println(store.contains(book2));
    }
}