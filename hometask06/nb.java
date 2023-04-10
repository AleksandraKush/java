package hometask06;

public class nb {
    String brand;
    String model;
    String color;
    double screen;
    String processor;
    int RAM;
    int storage;
    boolean used;
    double price;

    public nb(
            String brand, String model, String color,
            double screen, String processor, int RAM,
            int storage, boolean used, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.screen = screen;
        this.processor = processor;
        this.RAM = RAM;
        this.storage = storage;
        this.used = used;
        this.price = price;
    }

    public double getDiscount() {
        return used ? 0.1 * price : 0.0;
    }

    public double getPriceWithDiscount() {
        return price - getDiscount();
    }
    public void printInfo() {
        System.out.printf("%s %s, %s, %.1f\" screen, %s, %d GB RAM, %d GB storage, %s, $%.2f (%.0f%% discount)%n",
                brand, model, color, screen, processor, RAM, storage, used ? "used" : "new", getPriceWithDiscount(), getDiscount() * 100);
    }
}