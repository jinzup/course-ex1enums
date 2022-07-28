package entities;

public class OrderItem{

    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public double subTotal(){
        return quantity*price;
    }

    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder();
        stb.append(product.getName());
        stb.append(", ").append(product.getPrice());
        stb.append(", Quantity: ").append(quantity);
        stb.append(", Subtotal: $").append(subTotal());
        return stb.toString();
    }
}