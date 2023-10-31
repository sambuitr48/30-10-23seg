package consumer;

public class ProductConsumer {
    private Float price;
    private String color;
    private Integer id;

    public ProductConsumer(Float price, String color, Integer id) {
        this.price = price;
        this.color = color;
        this.id = id;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
