package UDP;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String code;
    private String name;
    private int quantity;
    private static final long serialVersionUID = 20161107;

    public Product(int quantity, String name, String code, String id) {
        this.quantity = quantity;
        this.name = name;
        this.code = code;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
