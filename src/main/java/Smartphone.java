import ru.netology.productManager.Product;

public class Smartphone extends Product {
    private String title;
    private String producer;

    public Smartphone(int id, String name, int price, String title, String producer) {
        super(id, name, price, title);
        this.title = title;
        this.producer = producer;
    }
}
