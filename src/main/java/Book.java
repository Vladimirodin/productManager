import ru.netology.productManager.Product;

public class Book extends Product {
    private String title;
    private String author;

    public Book(int id, String name, int price, String title, String author) {
        super(id, name, price, title);
        this.title = title;
        this.author = author;
    }
}
