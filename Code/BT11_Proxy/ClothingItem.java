public class ClothingItem {
    private String name;
    private double price;
    private ClothingImage image;

    public ClothingItem(String name, double price, String imageFilename) {
        this.name = name;
        this.price = price;
        this.image = new ProxyClothingImage(imageFilename);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayImage() {
        image.display();
    }

    @Override
    public String toString() {
        return "ClothingItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
} 