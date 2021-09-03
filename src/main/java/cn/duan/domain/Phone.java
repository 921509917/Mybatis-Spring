package cn.duan.domain;

public class Phone {
    private Integer id;
    private String brand;
    private String memory;
    private String color;
    private Double price;

    public Phone(Integer id, String brand, String memory, String color, Double price) {
        this.id = id;
        this.brand = brand;
        this.memory = memory;
        this.color = color;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", memory='" + memory + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

