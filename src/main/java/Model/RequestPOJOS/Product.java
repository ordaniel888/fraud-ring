package Model.RequestPOJOS;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    @JsonProperty(value = "price", required = true)
    private double price;

    @JsonProperty(value = "quantity", required = true)
    private int quantity;

    @JsonProperty(value = "title", required = true)
    private String title;

    public Product(@JsonProperty(value = "price", required = true) double price,
                   @JsonProperty(value = "quantity", required = true) int quantity,
                   @JsonProperty(value = "title", required = true) String title) {
        this.price = price;
        this.quantity = quantity;
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
