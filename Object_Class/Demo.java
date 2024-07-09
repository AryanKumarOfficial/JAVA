package Object_Class;

class Laptop {
    private String model;
    private int price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public boolean equals(Laptop obj) {
        return this.model.equals(obj.model) && this.price == obj.price;
    }
}

public class Demo {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.setModel("Acer Aspire");
        obj.setPrice(10000);
        Laptop obj1 = new Laptop();
        obj1.setModel("Acer Aspire");
        obj1.setPrice(10000);
        boolean result = obj1.equals(obj);
        System.out.println(result);
        System.out.println(obj);
    }
}
