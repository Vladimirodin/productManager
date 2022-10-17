import ru.netology.productManager.Product;

public class Smartphone extends Product {
    private String producer;

    public Smartphone(int id, String name, int price, String producer) {
        super(id, name, price, producer);
        this.producer = producer;
    }
}
